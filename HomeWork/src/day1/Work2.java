//100+98+96+94+...+2  (3种方式实现)
package day1;

public class Work2 {
	public static void main(String[] args) {
/************第一种方式***************/
		int sum1 = 0;
		for (int i = 100; i > 0; i--) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("100+98+96+94+...+2=" + sum1);
		
/************第二种方式*************/
		int sum2 = 0;
		for (int i = 50; i > 0; i--) {
			sum2 += (2 * i);
		}
		System.out.println("100+98+96+94+...+2=" + sum2);
		
/*************第三种方式*************/
		int sum3 = 0;
		for (int i = 100; i > 0; i-=2) {
			sum3 += i;
		}
		System.out.println("100+98+96+94+...+2=" + sum3);
		
	}
}
