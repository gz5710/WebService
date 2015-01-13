/**
 * 
 */
package com.tmax;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @Author: Bruce GONG
 * @Project: Tester
 * @Package: com.tmax
 * @Filename: MapTest
 * @Datetime: 2014年11月17日 / 下午10:41:43
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "asdfjapishrfgphsdpafsperifasdf";
		Map map = new Hashtable();
		char[] chs = test.toCharArray();
		for(char c : chs)
		{
			if(map.containsKey(c)){
				map.put(c, Integer.parseInt(map.get(c).toString())+1);
			}else{
				map.put(c, 1);
			}
		}
		for(Object s : map.keySet())
		{
			System.out.println(s.toString() + " : " + map.get(s));
		}
	}

}
