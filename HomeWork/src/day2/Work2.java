package day2;
//第二种方法。

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int times = 0;  //需要输出菱形的层数；一层时：*
		System.out.print("请输入需要打印的菱形层数：");
		//从控制台读取输入的times的值
		times = Integer.parseInt(reader.readLine());
		//输出上三角
		for (int i = 0; i < (times+1)/2; i++) {
			for (int j = 0; j <= times-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//输出下三角
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
