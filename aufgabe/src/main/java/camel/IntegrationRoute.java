package camel;
import org.apache.camel.builder.RouteBuilder;

public class IntegrationRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// Consumer Endpoint

			// if tracing is turned on, you get very detailed information about processing within the route.
			//.tracing()
			// a processor does custom integration logic

			// a bean also does custom integration logic

			// Translator EIP (using the camel-csv component)

			// Splitter EIP

			// Content-based Router EIP

					// Producer Endpoint
					
	}

}
