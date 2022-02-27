package oops.problems;

import java.util.ArrayList;

public class StockPortfolio {

	// variables
	private String sharename;
	private double shareprice;
	private double noofshares;
	
	private ArrayList<String> shar_nam = new ArrayList<>();
	private ArrayList<Double> shar_nos = new ArrayList<>();
	private ArrayList<Double> shar_pric = new ArrayList<>();

	/*
	 * getters and setters
	 */
	public String getSharename() {
		return sharename;
	}

	public void setSharename(String sharename) {
		this.sharename = sharename;
	}

	public double getShareprice() {
		return shareprice;
	}

	public void setShareprice(double shareprice) {
		this.shareprice = shareprice;
	}

	public double getNoofshares() {
		return noofshares;
	}

	public void setNoofshares(double noofshares) {
		this.noofshares = noofshares;
	}

	public ArrayList<String> getShar_nam() {
		return shar_nam;
	}

	public void setShar_nam(ArrayList<String> shar_nam) {
		this.shar_nam = shar_nam;
	}

	public ArrayList<Double> getShar_nos() {
		return shar_nos;
	}

	public void setShar_nos(ArrayList<Double> shar_nos) {
		this.shar_nos = shar_nos;
	}

	public ArrayList<Double> getShar_pric() {
		return shar_pric;
	}

	public void setShar_pric(ArrayList<Double> shar_pric) {
		this.shar_pric = shar_pric;
	}

}