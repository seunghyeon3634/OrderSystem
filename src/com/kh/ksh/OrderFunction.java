package com.kh.ksh;

import java.util.Scanner;

public class OrderFunction {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �ֹ� ���� ���α׷� ======");
		System.out.println("1. �ֹ�");
		System.out.println("2. �޴�");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.print("��ȣ �Է� : ");
		int num = sc.nextInt();
		return num;
	}
	
	public int inputOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �ֹ� ======");
		System.out.println("1. �ο�");
		System.out.println("2. �ڷΰ���");
		int num = sc.nextInt();
		return num;
	}	
	public int orderNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �ο��� ======");
		System.out.print("�ο����� �Է��ϼ��� : ");
		int num = sc.nextInt();
		return num;
	}

	public String inputMenu() {
		Scanner sc = new Scanner(System.in);
		String Menu = " ";
		System.out.println("====== �޴� ======");
		System.out.println("1. ¥���");
		System.out.println("2. «��");
		System.out.println("3. ������");
		System.out.print("��ȣ �Է� : ");
		int num = sc.nextInt();
		if(num == 1) {
			Menu = "¥���";
		}
		if(num == 2) {
			Menu = "«��";
		}
		else {
			Menu = "������";
		}
		return Menu;
	}

	public void reviseSelect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �ֹ� ����");
		System.out.println("2. �޴� ����");
		System.out.println("��ȣ �Է� : ");
	}
	
	public void printGoodBye() {}

	public void printException() {}
}

