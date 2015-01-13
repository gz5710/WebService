/**
 * 
 */
package com.tester;


import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.third.ThirdWSStub;
import com.third.ThirdWSStub.ApprobationResponse;
import com.third.ThirdWSStub.SecondWSStub_Address;
import com.third.ThirdWSStub.Approbation;

/**
 * @author Bruce GONG
 *
 */
public class WebServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.third.ThirdWSStub.FirstWSStub_Address adresse1 = new com.third.ThirdWSStub.FirstWSStub_Address();
		adresse1.setAddr1("22 rue racine");
		adresse1.setCityState("Versailles");
		adresse1.setZip("78000");
		adresse1.setTelephone("06 61 99 72 25");
		com.third.ThirdWSStub.FirstWSStub_UserInfo userInfo = new com.third.ThirdWSStub.FirstWSStub_UserInfo();
		userInfo.setNom("John Smith");
		userInfo.setSSN("666777888");
		userInfo.setAdresse(adresse1);
		
		com.third.ThirdWSStub.SecondWSStub_Address adresse2 = new com.third.ThirdWSStub.SecondWSStub_Address();
		adresse2.setAddr1("22 rue racine");
		adresse2.setCityState("Versailles");
		adresse2.setZip("78000");
		adresse2.setTelephone("06 61 99 72 25");
		com.third.ThirdWSStub.SecondWSStub_LoanInfo loanInfo = new com.third.ThirdWSStub.SecondWSStub_LoanInfo();
		loanInfo.setSSN("66777888");
		loanInfo.setLoanAmount(600000);
		loanInfo.setHomePrice(500000);
		loanInfo.setAdresse(adresse2);
		
		ThirdWSStub tStub = null;
		try {
			tStub = new ThirdWSStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Approbation appr = new Approbation();
		appr.setUserInfo(userInfo);
		appr.setLoanInfo(loanInfo);
		ApprobationResponse apprr;
		try {
			apprr = tStub.approbation(appr);
			System.out.println(apprr.get_return());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
