package learning;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jDemo {

	static Logger logger = Logger.getLogger(Log4jDemo.class);
	
	public static void main(String[] args)
	{

		DOMConfigurator.configure("log4j.xml");
		logger.info("This is log4j demo class");
	}

}
