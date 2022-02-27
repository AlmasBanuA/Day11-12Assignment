package oops.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

	public void enterStockDetails(StockPortfolio spf) {

		ArrayList<String> shar_nam = new ArrayList<>();
		ArrayList<Double> shar_nos = new ArrayList<>();
		ArrayList<Double> shar_pric = new ArrayList<>();

		System.out.println("Enter the number of companies whose stocks you want to enter");
		Scanner sc0 = new Scanner(System.in);
		int no_stocks = sc0.nextInt();

		/*
		 * Take input for each company
		 */
		for (int i = 0; i < no_stocks; i++) {
			System.out.println("Enter the name of share: ");
			Scanner sc1 = new Scanner(System.in);
			String sharename = sc1.next();
			shar_nam.add(sharename);
			spf.setSharename(sharename);
			spf.setShar_nam(shar_nam);

			System.out.println("Enter the number of share: ");
			Scanner sc2 = new Scanner(System.in);
			double noofshares = sc2.nextInt();
			shar_nos.add(noofshares);
			spf.setNoofshares(noofshares);
			spf.setShar_nos(shar_nos);

			System.out.println("Enter the price of share: ");
			Scanner sc3 = new Scanner(System.in);
			double shareprice = sc3.nextInt();
			shar_pric.add(shareprice);
			spf.setShareprice(shareprice);
			spf.setShar_pric(shar_pric);

		}
	}

	public void stockValue(StockPortfolio spf) {
		enterStockDetails(spf);
		double stock_tot_val = 0;

		System.out.println("StockName           StockValue");

		/*
		 * Fetch details of each stock
		 */
		for (int i = 0; i < spf.getShar_pric().size(); i++) {
			
			double share_num = (double) spf.getShar_nos().get(i);
			double share_price = (double) spf.getShar_pric().get(i);
			String share_name = (String) spf.getShar_nam().get(i);

			stock_tot_val += share_num * share_price;
			
			System.out.println(share_name + "           " + share_num * share_price);
		}
		System.out.println("The total value of all the stocks = " + stock_tot_val);
	}

	// main method
	public static void main(String[] args) {

		/*
		 * create an instance of poso class
		 */
		StockPortfolio stokporfol = new StockPortfolio();
		Stock stok = new Stock();
		stok.stockValue(stokporfol);
	}
}