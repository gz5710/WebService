/**
 * 
 */
package com.tmax.planification;

import java.util.Date;
import java.util.Map.Entry;

/**
 * @author Bruce GONG
 *
 */
public class Planifier {
	public Plan getPlan(){
		Date dateRand = new Date();
		//dateRand.setYear(2015);
		dateRand.setMonth((int)(Math.random()*1000)%12);
		dateRand.setDate(12 + (int)(Math.random()*1000)%18);
		int ID = (int)(Math.random()*1000);
		return new Plan(dateRand, ID);
	}
}

class Plan{
	private Date date;
	private int ID;
	public Plan(Date date, int iD) {
		super();
		this.date = date;
		ID = iD;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Plan [date=" + date + ", ID=" + ID + "]";
	}
	
}