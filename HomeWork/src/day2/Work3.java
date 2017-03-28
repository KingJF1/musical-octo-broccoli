package day2;
//第三种方法

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work3 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int times = 0; //菱形的层数
		System.out.println("请输入要打印的菱形的层数：");
		//从控制台读取输入的times的值
		times = Integer.parseInt(reader.readLine());
		Work3.upTriangle(times);
		Work3.downTriangle(times);
	}
	private static void upTriangle(int times) {
		for (int i = 0; i < (times+1)/2; i++) {
			for (int j = 0; j <= times-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void downTriangle(int times) {
		for (int i = (times+1)/2; i < times; i++) {
			for (int j = 0; j <= i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 2*times; j > 2*i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
