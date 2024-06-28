package com.kh.practice;

import java.util.Scanner;

import com.kh.variable.A_Variable;

public class VariablePractice {
	
	public static void main(String[] args) {
		
		VariablePractice variable = new VariablePractice();
		
		// variable.method1();
		// variable.method2();
		//variable.method3();
		//variable.method4();
		//variable.method5();
		//variable.method6();
		variable.method7();
		
	}
	
	/*
	 * 영화관의 요금표는 다음과 같다.
	 *  - 성인 : 10000원
	 *  - 청소년 : 7000원
	 * 
	 * 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	 * */
	
//	----------1번 문제--------
	public void method1() {
		
System.out.println((10000*2)+(7000*3));
		
		int adult = 10000;
		int child = 7000;
		int adultCount = 2;
		int childCount = 3;
		
		int total = adult * adultCount + child * childCount;
		System.out.println("총 지불해야 할 금액 : " + total + "원");
		
		
		
		
	}
	
	/*
	 * x=5, y=7, z=9의 값을 직접 변경하지 않고 변수를 사용하여
	 * 
	 * x=7
	 * y=9
	 * z=5
	 * 
	 * 로 출력하세요.
	 * */
//	---------2번문제---------
	public void method2() {
		
	int x = 5;
	int y = 7;
		int z = 9;
		
		// 코드 적어주세요!
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
	
	

	public void method3() {

		
	    System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
		System.out.println("나누기 몫 : " + (num1 / num2));
	}

	/*
	 * 정수 두 개를 입력 받아 두 수의 합(+), 차(-), 곱(*), 나누기(/)한 몫을 출력하세요.
	 * 
	 * 첫 번째 정수 : 23
	 * 두 번째 정수 : 7
	 * 더하기 : 30
	 * 빼기 : 16
	 * 곱하기 : 161
	 * 나누기 몫 : 3
	 * */
	
	Scanner sc = new Scanner(System.in);
	
//	------- 3번문제 --------
	public void method4() {
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		double round = (width + height) *2;

		System.out.printf("면적 : %.2f", area);
		System.out.printf("둘레 : %.1f", round);

		
	}

	/*
	 * 키보드로 가로, 세로 값을 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	 * 공식) 면적 : 가로 * 세로
	 *       둘레 : (가로 + 세로) * 2
	 * 
	 * 가로 : 13.5
	 * 세로 : 41.7
	 * 면적 : 562.95
	 * 둘레 : 110.4
	 * */
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		System.out.println("첫번째 문자" + input.charAt(0));
		System.out.println("두번째 문자" + input.charAt(1));
		System.out.println("마지막 문자" + input.charAt(input.length()-1));	
     
	}

	/*
	 * 영어 문자열 값을 입력 받아 문자에서 첫번째, 두번째, 마지막 글자(문자열.length())를 출력하세요.
	 * 
	 * 문자열을 입력하세요 : apple
	 * 첫번째 문자 : a
	 * 두번째 문자 : p
	 * 마지막 문자 : e
	 * */
	
	public void method6() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int num = ch;
		char ch2 = (char) (num + 1);
		
		System.out.println(ch + " unicode : " + num);
		System.out.println(ch2 + " unicode :" + (int)ch2);
	}

	/*
	 * 문자 하나를 입력 받아 그 문자와 다음 문자의 유니코드를 출력하세요.
	 * 
	 * 문자 : A
	 * A unicode : 65
	 * B unicode : 66
	 * */
	public void method7() {
		
		System.out.println("국어 : ");
		int kScore = sc.nextInt();
		System.out.println("영어 : ");
		int eScore = sc.nextInt();
		System.out.println("수학 : ");
		int mScore = sc.nextInt();
		
		int sum = kScore + eScore + mScore;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f" , ((double)sum / 3));
	}
	
}
	/*
	 * 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	 * 
	 * 국어 : 75
	 * 영어 : 63
	 * 수학 : 80
	 * 총점 : 218
	 * 평균 : 72.67
	 * */
