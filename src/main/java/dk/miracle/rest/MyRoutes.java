package dk.miracle.rest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

@ContextName("Proxy")
public class MyRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	restConfiguration().port(8080).setComponent("jetty");
    	
    	rest("/say/")
        .produces("text/plain")
        .get("hello")
            .route()
            .transform().constant("Hello World!")
            .endRest()
        .get("hello/{name}")
            .route()
            .beanRef("hello")
            .log("${body}");
    }
}
