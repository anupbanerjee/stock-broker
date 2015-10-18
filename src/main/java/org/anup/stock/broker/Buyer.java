package org.anup.stock.broker;

import java.sql.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Buyer {
	private static final Logger logger = LoggerFactory.getLogger(Buyer.class);

	public Stock buyStock(){
		logger.info(":: Buyer :: buyStock!!");
		int quantity = new Random().nextInt(900) + 100;
		return new Stock("ACN", 100.43, quantity, new Date(
				System.currentTimeMillis()), "BUY", "ANUP");
	}

}
