package ch03;

import java.text.NumberFormat;

public class test01 {
	
	// 정적 메서
//	public static double pow(double base, double expon) {
//	
//		double d=0.0;
//		
//		return d;
//	}
	
	public static void main(String[] args) {
		// 팩토리 메서드 
		NumberFormat currentFormmat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormmat = NumberFormat.getPercentInstance();
		double d = 0.1;
		System.out.println(currentFormmat.format(d));
		System.out.println(percentFormmat.format(d));
	}
	
	
}
