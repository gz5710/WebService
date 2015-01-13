/**
 * 
 */
package com.tmax;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bruce GONG
 * @Project: Tester
 * @Package: com.tmax
 * @Filename: ListTest
 * @Datetime: 2014年11月17日 / 下午11:05:10
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ins = new ArrayList<String>();
		for(int i = 0; i<11; i++)
		{
			ins.add(String.valueOf(i+1));
		}
		int token = 0;
		int interval = 3;
		while(ins.size() > 1){
			token = (token + interval - 1)%ins.size();
			System.out.println(ins.get(token));
			ins.remove(token);
			//token --;
			//System.out.println(ins.size());
		}
		System.out.println("Last one is : " + ins.get(0));
	}

}
