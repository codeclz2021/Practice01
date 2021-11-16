package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	
		double price; //상품가격 
		double momey; //받은돈
		double tax; //부가세
		double changes; //잔돈
		
		Scanner sc = new Scanner(System.in);
	
		//상품가격 입력
		System.out.print("상품가격:  ");
		price = sc.nextDouble();
		
		//받은돈 입력
		System.out.print("받은돈:  ");
		momey = sc.nextDouble();
		
		//부가세 계산
		tax = price * 0.1;
		
		//잔액 계산
		changes = momey - price;
		
		//출력
		System.out.println("==========================");
		System.out.println("받은돈: " + momey );
		System.out.println("상품가격: " + price );
		System.out.println("부가세: " + tax );
		System.out.println("잔액: " + changes );
	
		
		sc.close();

	}

}
