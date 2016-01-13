package my.playground.dropwizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import my.playground.dropwizard.AppConfiguration;
import my.playground.dropwizard.resources.ContactResource;

/**
 * Hello RESTful Dropwizard world!
 *
 */
public class App extends Application<AppConfiguration> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    @Override
    public void initialize(Bootstrap<AppConfiguration> b) {}

	@Override
	public void run(AppConfiguration config, Environment environ) throws Exception {
		
			LOGGER.info("Method App#run() called");
			System.err.println( "Hello RESTful world, by Dropwizard!" );
			
			// Add the resource to the environment
			environ.jersey().register(new ContactResource());
		
	}
	
    public static void main( String[] args ) throws Exception
    {
    	new App().run(args);
    }

}
