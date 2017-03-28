package day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work1 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("请输入第一个数字：");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.println("请输入第二个数字：");
		int num2 = Integer.parseInt(reader.readLine());
		string(num1,num2);
	}
	public static void string(int num1,int num2) {
		if (num1 < 1 || num1 > num2 || num2 >26) {
			System.out.println("输入错误，程序结束运行！");
		}else {
			for (int i = 0; i < (num2 - num1 + 1); i++) {
				System.out.print((char) (num1 + 96 + i) + " ");
			}
		}
	}
}
