/**
 * 
 */
package com.first;

import com.model.ReturnedStatus;
import com.model.UserInfo;

/**
 * @author Bruce GONG
 *
 */
public class FirstWS {
	public ReturnedStatus checkCredit(UserInfo userInfo)
	{
		ReturnedStatus rs = new ReturnedStatus();
		rs.setSSN(userInfo.getSSN());
		if(userInfo.getSSN().startsWith("6"))
		{
			rs.setResult("Approved");
		}else{
			rs.setResult("Denied");
		}
		return rs;
	}
}
