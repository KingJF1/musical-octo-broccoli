//100+98+96+94+...+2  (3�ַ�ʽʵ��)
package day1;

public class Work2 {
	public static void main(String[] args) {
/************��һ�ַ�ʽ***************/
		int sum1 = 0;
		for (int i = 100; i > 0; i--) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("100+98+96+94+...+2=" + sum1);
		
/************�ڶ��ַ�ʽ*************/
		int sum2 = 0;
		for (int i = 50; i > 0; i--) {
			sum2 += (2 * i);
		}
		System.out.println("100+98+96+94+...+2=" + sum2);
		
/*************�����ַ�ʽ*************/
		int sum3 = 0;
		for (int i = 100; i > 0; i-=2) {
			sum3 += i;
		}
		System.out.println("100+98+96+94+...+2=" + sum3);
		
	}
}
