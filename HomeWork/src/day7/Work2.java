package day7;

import java.util.Scanner;
import java.util.Calendar;

public class Work2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = scan.nextInt();
		System.out.println("请输入月份: ");
		int month = scan.nextInt();
		System.out.println("您输入的年月为：\n" + year+"年" + month+ "月");
		System.out.println("日        一        二        三        四        五        六");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		if (week==0) {
			week = 7;
		}else {
			week = week -1;
		}
		if (month == 2&&(year%4==0)) {
			forPrint(29,week);
		} else if(month ==2){
			forPrint(28,week);
		}else if (month==4||month==6||month==9||month==11) {
			forPrint(30,week);
		}else {
			forPrint(31,week);
		}
	}
	public static void forPrint(int day,int week) {
		for (int i = 0; i < week; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <10; i++) {
			if ((((i+week)%7-1)==0)&&((i!=1)||(i==(7-week)
					))) {
				System.out.println();
			}
			System.out.print(i+"   ");
		}
		for (int i = 10; i <=day; i++) {
			if ((i%7-1)==0) {
				System.out.println();
			}
			System.out.print(i+"  ");
		}
	}
}
