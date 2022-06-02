package p1;

import java.util.Comparator;

public class SortStockBasedOnReturn implements Comparator<Stock> 
{

	@Override
	public int compare(Stock s1, Stock s2) {
		return s1.getStockReturn() - s2.getStockReturn();
	}

	
}