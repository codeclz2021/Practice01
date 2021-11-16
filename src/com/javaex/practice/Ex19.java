/*문제 출제용*/
package com.javaex.practice;

public class Ex19 {

	public static void main(String[] agrgs) {
		
		long speed = 300000l;
		long distance;
	
		//거리계산
		distance = speed * 60 * 60 * 24 * 365;
	
		System.out.println("빛이 1년 동안 가는 거리는  " + distance + "  km 입니다." );
		
	}
}
