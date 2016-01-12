package my.playground.dropwizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import my.playground.dropwizard.AppConfiguration;

/**
 * Hello RESTful Dropwizard world!
 *
 */
public class App extends Application<AppConfiguration> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
    @Override
    public void initialize(Bootstrap<AppConfiguration> b) {}

	@Override
	public void run(AppConfiguration arg0, Environment arg1) throws Exception {
		
			LOGGER.info("Method App#run() called");
			System.err.println( "Hello RESTful world, by Dropwizard!" );
		
	}
	
    public static void main( String[] args ) throws Exception
    {
    	new App().run(args);
    }

}
