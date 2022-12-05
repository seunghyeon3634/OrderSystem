package com.kh.ksh;

public class OrderRun {
	public static void main(String [] args) {
		OrderFunction sFunc = new OrderFunction();
		EXIT :
		while(true) {
			int choice = sFunc.printMenu();
			switch(choice) {
			case 1 :
				int num = sFunc.inputOrder();
				if(num == 1) {
				int num2 = sFunc.orderNumber();
				String num3 = sFunc.inputMenu();
				System.out.println(num2 + "명의 " + num3 + "(이)가 주문 완료되었습니다.");
				}
				
			}
		}
		
	}
}
