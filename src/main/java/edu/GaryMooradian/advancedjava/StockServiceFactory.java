package edu.GaryMooradian.advancedjava;

/*
 * This class will return an instantiation of a specific StockService (i.e. BasicStockService)
 * BasicStockService implements StockService, therefore, we can return
 * BasicStockService as StockService type
 */
public class StockServiceFactory {
	
	//Returning BasicStockService object
	public static StockService getStockService() {
		return new BasicStockService();
	}

}
