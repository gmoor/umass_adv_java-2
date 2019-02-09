package edu.GaryMooradian.advancedjava;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

public class BasicStockServiceTest {
	
	/*
	 * Tests the getQuote method in BasicStockService
	 */
	@Test
	public void testGetQuote() {
		//Create a Date
		Date date = new Date(2019,05,05);
		//Pass stock symbol and date.
		StockQuote quote = new BasicStockService().getQuote("OLED", date);
		/*
		 * Provide same price as we hard coded in BasicStockService's getQuote method
		 */
		BigDecimal price = new BigDecimal(5.00);
		
		/*
		 * Verify that dateRecorded is correct for the StockQuote object
		 * Note: Just trying assertTrue for the hell of it; i.e. instead of assertEquals
		 */
		assertTrue("The dateRecorded is not correct", date == quote.getDateRecorded());
		
		/*
		 * Verify that the stockPrice is correct for the StockQuote object
		 */
		assertTrue("The stockPrice is not correct", price.equals(quote.getStockPrice()));
		
		/*
		 * Verify the stockSymbol is correct for the stockQuote object
		 */
		assertEquals("The stockSymbol is not correct", "OLED", quote.getStockSymbol());		
	}

}
