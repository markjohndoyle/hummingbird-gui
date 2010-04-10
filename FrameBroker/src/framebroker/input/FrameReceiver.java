package framebroker.input;

import java.util.List;
import java.util.Observable;

import com.logica.hummingbird.tmframeprovider.IFrameProvider;



public class FrameReceiver extends Observable {

	IFrameProvider frameProvider;
	
	public FrameReceiver(IFrameProvider fp) {
		this.frameProvider = fp;
	}
	
	List<Object> getMessages() {
		return frameProvider.getTmMessages();
	}
}
