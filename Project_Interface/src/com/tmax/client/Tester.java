/**
 * 
 */
package com.tmax.client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import localhost.demandeprestation.DemandePrestationRequest;
import localhost.demandeprestation.DemandePrestationResponse;
import localhost.demandeprestation.DemandePrestationStub;

/**
 * @author Bruce GONG
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemandePrestationRequest dpr = new DemandePrestationRequest();
		dpr.setName("gong");
		dpr.setLocation("Paris");
		dpr.setEmail("bruce.gong.tmax@gmail.com");
		DemandePrestationStub dpStub;
		DemandePrestationResponse dpRes;
		try {
			dpStub = new DemandePrestationStub();
			dpRes = dpStub.process(dpr);
			System.out.println(dpRes.getCompteRendu() + dpRes.getFacture() + dpRes.getResult());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
