package day2;
//�ڶ��ַ�����

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int times = 0;  //��Ҫ������εĲ�����һ��ʱ��*
		System.out.print("��������Ҫ��ӡ�����β�����");
		//�ӿ���̨��ȡ�����times��ֵ
		times = Integer.parseInt(reader.readLine());
		//���������
		for (int i = 0; i < (times+1)/2; i++) {
			for (int j = 0; j <= times-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//���������
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
