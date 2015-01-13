/**
 * 
 */
package com.third;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.first.FirstWSStub;
import com.first.FirstWSStub.CheckCredit;
import com.first.FirstWSStub.CheckCreditResponse;
import com.first.FirstWSStub.UserInfo;
import com.second.SecondWSStub;
import com.second.SecondWSStub.EvalueAppart;
import com.second.SecondWSStub.EvalueAppartResponse;
import com.second.SecondWSStub.LoanInfo;

/**
 * @author Bruce GONG
 *
 */
public class ThirdWS {
	public String approbation(UserInfo userInfo, LoanInfo loanInfo)
	{
		String result1 = null, result2 = null;
		try {
			//get first result
			FirstWSStub fstub = new FirstWSStub();
			CheckCredit cc = new CheckCredit();
			cc.setUserInfo(userInfo);
			CheckCreditResponse ccr;
			try {
				ccr = fstub.checkCredit(cc);
				result1 = ccr.get_return().getResult();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//get second result
			SecondWSStub sstub = new SecondWSStub();
			EvalueAppart ea = new EvalueAppart();
			ea.setLoanInfo(loanInfo);
			EvalueAppartResponse ear;
			try {
				ear = sstub.evalueAppart(ea);
				result2 = ear.get_return().getResult();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result1.equals("Approved") && result2.equals("Approved"))
		{
			return "Mr. John Smith, vote demande de pr¨ºt a ¨¦t¨¦ accept¨¦";
		}else{
			return "Mr. John Smith, vote demande de pr¨ºt a ¨¦t¨¦ refus¨¦";
		}
	}
}
