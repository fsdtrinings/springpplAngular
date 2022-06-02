package p1;

import java.util.Comparator;

public class SortStockBasedOnCMP implements Comparator<Stock> 
{

	@Override
	public int compare(Stock s1, Stock s2) {
		return s1.getCmp() - s2.getCmp();
	}

	
}
