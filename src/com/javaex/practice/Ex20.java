/*문제 출제용*/
package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] agrgs) {
		
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int totalCoin;
		
		Scanner sc = new Scanner(System.in);
		
		//동전개수 입력
		System.out.print("500원 개수:  ");
		coin500 = sc.nextInt();
		
		System.out.print("100원 개수:  ");
		coin100 = sc.nextInt();
		
		System.out.print("50원 개수:  ");
		coin50 = sc.nextInt();
		
		System.out.print("10원 개수:  ");
		coin10 = sc.nextInt();
		
		
		
		//총합 계산
		totalCoin = coin500*500 + coin100*100 + coin50*50 + coin10*10;
		
		System.out.println("동전의 총합은 " + totalCoin + " 원 입니다." );
		
		sc.close();
		
		
	}
}
