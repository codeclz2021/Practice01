/*문제 출제용*/
package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] agrgs) {
		
		double f;
		double c;
		Scanner sc = new Scanner(System.in);
		
		//화씨 입력
		System.out.print("화씨:  ");
		f = sc.nextDouble();
		
		//화씨-->섭씨 계산
		c = (double)5/(double)9 * (f-32);
		
		//섭씨  출력
		System.out.println("화씨 " + f + " 의 섭씨온도는 " + c + " 입니다." );
		
		sc.close();
		
		
	}
}
