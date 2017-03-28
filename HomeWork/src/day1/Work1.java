//2+4+6+8+10+...+100(三种方式实现)
package day1;

public class Work1 {
	public static void main(String[] args) {
/*************第一种方式****************/
		int sum1 = 0;
		for (int i = 2; i < 101; i++) {
			if(i % 2 ==0){
				sum1 += i;
			}
		}
		System.out.println("2+4+6+8+10+...+100=" + sum1);
	
/*************第二种方式***************/
		int sum2 = 0;
		for(int i = 1; i < 51; i++){
			sum2 += (2*i);
		}
		System.out.println("2+4+6+8+10+...+100=" + sum2);
	
/************第三种方式**************/
		int sum3 = 0;
		for (int i = 0; i < 101; i+=2) {
			sum3 += i;
		}
		System.out.println("2+4+6+8+10+...+100=" + sum3);
		
	}
}
