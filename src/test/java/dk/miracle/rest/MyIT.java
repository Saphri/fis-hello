package dk.miracle.rest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyIT {
	
	private static final Logger logger = LoggerFactory.getLogger(MyIT.class);

	@Test
	public void test() {
		logger.info("Test running!");
	}

}
