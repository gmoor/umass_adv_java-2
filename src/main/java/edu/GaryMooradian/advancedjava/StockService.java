package edu.GaryMooradian.advancedjava;

import java.util.Date;

public interface StockService {
	
	/*
	 * returns a stock quote, based on a date and stockSymbol
	 */
	public StockQuote getQuote(String symbol, Date date);

}
