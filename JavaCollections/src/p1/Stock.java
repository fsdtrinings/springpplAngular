package p1;

public class Stock implements Comparable<Stock> 
{
	
	private String stockName;
	private int cmp;
	private int marketCap;
	private int stockReturn; // 3 years return 
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* arg constructor is not the part of bean class*/
	public Stock(String stockName, int cmp, int marketCap, int stockReturn) {
		super();
		this.stockName = stockName;
		this.cmp = cmp;
		this.marketCap = marketCap;
		this.stockReturn = stockReturn;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getCmp() {
		return cmp;
	}
	public void setCmp(int cmp) {
		this.cmp = cmp;
	}
	public int getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(int marketCap) {
		this.marketCap = marketCap;
	}
	public int getStockReturn() {
		return stockReturn;
	}
	public void setStockReturn(int stockReturn) {
		this.stockReturn = stockReturn;
	}
	
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", cmp=" + cmp + ", marketCap=" + marketCap + ", stockReturn="
				+ stockReturn + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cmp;
		result = prime * result + marketCap;
		result = prime * result + ((stockName == null) ? 0 : stockName.hashCode());
		result = prime * result + stockReturn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (cmp != other.cmp)
			return false;
		if (marketCap != other.marketCap)
			return false;
		if (stockName == null) {
			if (other.stockName != null)
				return false;
		} else if (!stockName.equals(other.stockName))
			return false;
		if (stockReturn != other.stockReturn)
			return false;
		return true;
	}
	@Override
	public int compareTo(Stock s) {

		return this.getCmp() - s.getCmp();
	}

	
	
	
	

}//end class







