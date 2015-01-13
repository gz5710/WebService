package com.tmax;

import java.util.ArrayList;
import java.util.List;

public class ClassTester {

	public ClassTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		String str = "test";
		ClassTester ct = new ClassTester();
		System.out.println(l.getClass().getSimpleName());
		System.out.println(str.getClass().getSimpleName());
		System.out.println(ct.getClass().getSimpleName());
	}

}
