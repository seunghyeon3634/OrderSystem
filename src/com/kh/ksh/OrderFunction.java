package com.kh.ksh;

import java.util.Scanner;

public class OrderFunction {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 주문 관리 프로그램 ======");
		System.out.println("1. 주문");
		System.out.println("2. 메뉴");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int inputOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 주문 ======");
		System.out.println("1. 인원");
		System.out.println("2. 뒤로가기");
		int num = sc.nextInt();
		return num;
	}	
	public int orderNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 인원수 ======");
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
		return num;
	}

	public String inputMenu() {
		Scanner sc = new Scanner(System.in);
		String Menu = " ";
		System.out.println("====== 메뉴 ======");
		System.out.println("1. 짜장면");
		System.out.println("2. 짬뽕");
		System.out.println("3. 볶음밥");
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
		if(num == 1) {
			Menu = "짜장면";
		}
		if(num == 2) {
			Menu = "짬뽕";
		}
		else {
			Menu = "볶음밥";
		}
		return Menu;
	}

	public void reviseSelect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 주문 수정");
		System.out.println("2. 메뉴 수정");
		System.out.println("번호 입력 : ");
	}
	
	public void printGoodBye() {}

	public void printException() {}
}

