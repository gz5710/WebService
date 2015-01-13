/**
 * 
 */
package com.model;

/**
 * @author Bruce GONG
 *
 */
public class LoanInfo {
	private String SSN;
	private int LoanAmount;
	private int HomePrice;
	private Address Adresse;
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public int getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		LoanAmount = loanAmount;
	}
	public int getHomePrice() {
		return HomePrice;
	}
	public void setHomePrice(int homePrice) {
		HomePrice = homePrice;
	}
	public Address getAdresse() {
		return Adresse;
	}
	public void setAdresse(Address adresse) {
		Adresse = adresse;
	}
	
}
