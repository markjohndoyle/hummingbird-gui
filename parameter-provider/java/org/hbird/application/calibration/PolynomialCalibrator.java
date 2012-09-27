package org.hbird.application.calibration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hbird.core.commons.tmtc.Parameter;
import org.hbird.core.commons.tmtc.ParameterGroup;
import org.hbird.core.spacesystemmodel.parameters.HummingbirdParameter;
import org.hbird.core.spacesystemmodel.tmtcgroups.HummingbirdParameterGroup;

public class PolynomialCalibrator {
	
	private Map<String, List<Double>> calibrationsMap;
	
	public PolynomialCalibrator() {
	}

	public PolynomialCalibrator(Map<String, List<Double>> calibrationsMap) {
		this.calibrationsMap = calibrationsMap;
	}
	
	public ParameterGroup calibrateAllParametersInGroup(ParameterGroup pg) {
		if(calibrationsMap == null) {
			initialiseForThunderbird();
		}
		
		ParameterGroup calibratedParametersGroup = new HummingbirdParameterGroup(pg.getQualifiedName(), pg.getName(), "calibrated", pg.getLongDescription());

		
		// FIXME ugly, Thunderbird-specific hack written on the way to the launch
		double latDeg = 0, latMin = 0, latMinDec = 0, longDeg = 0, longMin = 0, longMinDec = 0;
		
		
		for (Parameter<Integer> parameter : pg.getIntegerParameters().values()) {
			if (calibrationsMap.containsKey(parameter.getQualifiedName())) {
				
				List<Double> calibrationPolynomial = calibrationsMap.get(parameter.getQualifiedName());
				
				double value = (double) parameter.getValue();
			
				double outValue = 0;
				int term = 0;
				for (Double currentPolynomial : calibrationPolynomial) {
					outValue += currentPolynomial * Math.pow(value, term);
					term++;
				}
				Parameter<Double> calibratedParameter = new HummingbirdParameter<Double>(parameter.getQualifiedName(), parameter.getName(), "calibrated", parameter.getLongDescription());
				calibratedParameter.setValue(outValue);
				if (parameter.getName() == "GPS_Latitude_Degrees") {
					latDeg = outValue;
				}
				if (parameter.getName() == "GPS_Latitude_Minutes") {
					latMin = outValue;
				}
				if (parameter.getName() == "GPS_Latitude_Minutes_Decimals") {
					latMinDec = outValue;
				}
				if (parameter.getName() == "GPS_Longitude_Degrees") {
					longDeg = outValue;
				}
				if (parameter.getName() == "GPS_Longitude_Minutes") {
					longMin = outValue;
				}
				if (parameter.getName() == "GPS_Longitude_Minutes_Decimals") {
					longMinDec = outValue;
				}
				
				
				calibratedParametersGroup.addDoubleParameter(calibratedParameter);
			}
			
			
		}
		
		// FIXME calculate Lat, Long from rocket values
		
		double latInDegrees, longInDegrees;
		latInDegrees = latMinDec / Math.pow(2, 14) / 60;
		latInDegrees += latMin / Math.pow(2, 6);
		latInDegrees += latDeg;
		
		Parameter<Double> latParam = new HummingbirdParameter<Double>("LATITUDE", "LATITUDE", "synthetic", "");
		latParam.setValue(latInDegrees);
		
		calibratedParametersGroup.addDoubleParameter(latParam);
		
		return calibratedParametersGroup;
	}
	
	public Parameter<Double> calibrateParameter(Parameter<?> parameterIn) {
		
		List<Double> calibrationPolynomial = calibrationsMap.get(parameterIn.getQualifiedName());
		
//		if (calibrationPolynomial != null) {
			// calibration polynomial found
			
			double value = Double.parseDouble(parameterIn.getValue().toString());

			double outValue = 0;
			int term = 0;
			for (Double currentPolynomial : calibrationPolynomial) {
				outValue += currentPolynomial * Math.pow(value, term);
				term++;
			}
			Parameter<Double> parameter = new HummingbirdParameter<Double>("", "", "", "");
			parameter.setValue(outValue);
			return parameter;
//			parameterIn = parameter;
//		}
//		return (Parameter<Double>) parameterIn;
	}

	private void initialiseForThunderbird() {
		calibrationsMap = new HashMap<String, List<Double>>();
		
		List<Double> polynomials = new ArrayList<Double>();
		polynomials.add(0d);
		polynomials.add(0.1d);
		
		calibrationsMap.put("Thunderbird.tm.Air_Pressure_SCP1000", polynomials);
		
		polynomials = new ArrayList<Double>();
		polynomials.add(0d);
		polynomials.add(1d);
		calibrationsMap.put("Thunderbird.tm.Air_Pressure_BMP", polynomials);
		calibrationsMap.put("Thunderbird.tm.Z_Axis_Accelerometer", polynomials);
		calibrationsMap.put("Thunderbird.tm.Temperature_SCP1000", polynomials);
		calibrationsMap.put("Thunderbird.tm.Temperature_BMP", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Altitude", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Latitude_Degrees", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Latitude_Minutes", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Latitude_Minutes_decimals", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Longitude_Degrees", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Longitude_Minutes", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Longitude_Minutes_decimals", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Lock", polynomials);
		calibrationsMap.put("Thunderbird.tm.GPS_Number_of_Sats", polynomials);
		calibrationsMap.put("Thunderbird.tm.IMU_Roll", polynomials);
		calibrationsMap.put("Thunderbird.tm.IMU_Pitch", polynomials);
		calibrationsMap.put("Thunderbird.tm.IMU_Heading", polynomials);
		
		
		// FIXME add more calibrations!
		
		
	}

}
