package edu.GaryMooradian.advancedjava;

import java.math.BigDecimal;
import java.util.Date;


public class BasicStockService implements StockService {
 
	/*
	 * This method receives a stock symbol and date. It uses that information to
	 * obtain a stock price. With that information, it creates (and returns) a
	 * StockQuote object.
	 * 
	 * Because we are not actually going out to some third party to obtain the 
	 * actual price, we will hard code price. The symbol and date arguments
	 * will be provided via JUnit test
	 */
	@Override
	public StockQuote getQuote(String symbol, Date date) {
		/*
		 * returning StockQuote
		 * Note: new BigDecimal(5.00) is the price
		 */
		return new StockQuote(date, new BigDecimal(5.00), symbol);
	}

}
