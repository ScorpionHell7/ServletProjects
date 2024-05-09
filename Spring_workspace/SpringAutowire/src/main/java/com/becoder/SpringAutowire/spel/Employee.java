package com.becoder.SpringAutowire.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("#{1+2}")
	public int val1;
	@Value("#{1-2}")
	public int val2;
	@Value("#{1*2}")
	public int val3;
	@Value("#{1/2}")
	public int val4;
	@Value("#{1%2}")
	public int val5;
	@Value("#{5==6}")
	public boolean val6;
	@Value("#{4<7?'Yes':'No'}")
	public boolean val7;
	@Value("#{T(java.lang.Math).PI}")
	public float val8;
	@Value("#{T(com.becoder.SpringAutowire.spel.Employee).call}")
	public String val9;
	
	public static String call() {
		return "Method called";
//		System.out.println("Method called");
	}
	
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public int getVal3() {
		return val3;
	}
	public void setVal3(int val3) {
		this.val3 = val3;
	}
	public int getVal4() {
		return val4;
	}
	public void setVal4(int val4) {
		this.val4 = val4;
	}
	public int getVal5() {
		return val5;
	}
	public void setVal5(int val5) {
		this.val5 = val5;
	}
	
	
	@Override
	public String toString() {
		return "Employee [val1=" + val1 + ", val2=" + val2 + ", val3=" + val3 + ", val4=" + val4 + ", val5=" + val5
				+ "]";
	}
	
	

}
