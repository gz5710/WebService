/**
 * 
 */
package com.second;

import com.model.LoanInfo;
import com.model.ReturnedStatus;

/**
 * @author Bruce GONG
 *
 */
public class SecondWS {
	public ReturnedStatus evalueAppart(LoanInfo loanInfo)
	{
		ReturnedStatus rs = new ReturnedStatus();
		rs.setSSN(loanInfo.getSSN());
		if(loanInfo.getLoanAmount() < loanInfo.getHomePrice())
		{
			rs.setResult("Approved");
		}else{
			rs.setResult("Denied");
		}
		return rs;
	}
}
