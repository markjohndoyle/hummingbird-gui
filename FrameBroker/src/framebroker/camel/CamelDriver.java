package framebroker.camel;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;


public class CamelDriver {
	
	private static ConnectionFactory connectionFactory;
	private static CamelContext cc = new DefaultCamelContext();
	
	public static void init() {
		connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
		cc.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
	}
}
