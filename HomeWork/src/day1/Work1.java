//2+4+6+8+10+...+100(���ַ�ʽʵ��)
package day1;

public class Work1 {
	public static void main(String[] args) {
/*************��һ�ַ�ʽ****************/
		int sum1 = 0;
		for (int i = 2; i < 101; i++) {
			if(i % 2 ==0){
				sum1 += i;
			}
		}
		System.out.println("2+4+6+8+10+...+100=" + sum1);
	
/*************�ڶ��ַ�ʽ***************/
		int sum2 = 0;
		for(int i = 1; i < 51; i++){
			sum2 += (2*i);
		}
		System.out.println("2+4+6+8+10+...+100=" + sum2);
	
/************�����ַ�ʽ**************/
		int sum3 = 0;
		for (int i = 0; i < 101; i+=2) {
			sum3 += i;
		}
		System.out.println("2+4+6+8+10+...+100=" + sum3);
		
	}
}
