package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StockApp {
	
	//Set<Stock> allStocks = new TreeSet<>();
	List<Stock> allStocks = new ArrayList<>();
	
	public static void main(String[] args) {
		StockApp app = new StockApp();
		app.addStocks();
		app.displayAllStocks(app.allStocks);
		System.out.println("\n Compare Two Objects \n");
		app.doCompare();
		System.out.println("\n =======  SORTED OUTPUT ========= \n");
		showListBasedOnCMP(app.allStocks);
		showListBasedOnMarketCap(app.allStocks);
		showListBasedOnReturn(app.allStocks);
	}
	
	public void doCompare()
	{
		Stock s1 = new Stock("Reliance",2600, 1550000, 110);
		Stock s2 = new Stock("Reliance",2600, 1550000, 110);
		
		boolean isSame = (s1 == s2);// 10 == 10
		System.out.println(isSame);
		
		boolean isEqual = (s1.equals(s2));
		System.out.println("calling equals() -> "+isEqual);
		
	}
	
	public void addStocks()
	{
		
		Stock tcs = new Stock("TCS",5, 750000, 120);
		Stock infosys = new Stock("Infosys",89, 650000, 150);
		Stock hul = new Stock("HUL",5, 250000, 80);
		Stock reliance = new Stock("Reliance",2, 1550000, 110);
		Stock hcl = new Stock("HCL",12, 1550000, 110);
		
		allStocks.add(tcs);
		allStocks.add(infosys);
		allStocks.add(hul);
		allStocks.add(reliance);
		allStocks.add(hcl);

	}
	
	public static void showListBasedOnCMP(Collection<Stock> collection)
	{
		List<Stock> tempList = new ArrayList<>();
		tempList.addAll(collection);
		
		Collections.sort(tempList,new SortStockBasedOnCMP());
		System.out.println(" \n\n--- All Stock Based on Current Price ---");
		for (Stock stock : tempList) {
			System.out.println(stock);
		}
	}
	
	public static void showListBasedOnMarketCap(Collection<Stock> collection)
	{
		List<Stock> tempList = new ArrayList<>();
		tempList.addAll(collection);
		
		Collections.sort(tempList,new SortStockBasedOnMarketCap());
		System.out.println("\n\n --- All Stock Based on Market Capitalization ---");
		for (Stock stock : tempList) {
			System.out.println(stock);
		}
	}
	
	public static void showListBasedOnReturn(Collection<Stock> collection)
	{
		List<Stock> tempList = new ArrayList<>();
		tempList.addAll(collection);
		
		Collections.sort(tempList,new SortStockBasedOnReturn());
		System.out.println("\n\n --- All Stock Based on 3 Years Return ---");
		for (Stock stock : tempList) {
			System.out.println(stock);
		}
	}
	
	
	
	public void displayAllStocks(Collection<Stock> collection)
	{
		for (Stock stock : collection) {
			System.out.println(stock);
		}
	}
	
	

}
