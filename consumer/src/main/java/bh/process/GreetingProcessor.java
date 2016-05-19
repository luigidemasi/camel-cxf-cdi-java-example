package bh.process;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("greetingProcessor")
public class GreetingProcessor {

	public void processor(Exchange exchange) {
		Message in = exchange.getIn();
		Message out = exchange.getOut();
		out.setBody(in.getBody());
		
		exchange.setOut(out);
	}

}
