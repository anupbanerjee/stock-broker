package org.anup.stock.broker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BrokerStartup {
	
	private static final Logger logger = LoggerFactory.getLogger(BrokerStartup.class);

	public void init() {
		logger.info(":: BrokerStartup :: initialized!!!");
	}
}
