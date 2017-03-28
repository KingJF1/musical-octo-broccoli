package day7;

import java.util.Scanner;
import java.util.Calendar;

public class HomeWork1 {
	public static int setYear(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		return calendar.get(Calendar.YEAR);
	}
	public static int setMonth(int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, month);
		return calendar.get(Calendar.MONTH);
	}
	public int setDay(int month,int year) {
		Calendar calendar = Calendar.getInstance();
		if (month == 2&&(year%4 == 0)) {
			calendar.set(Calendar.DAY_OF_MONTH, 29);
		}else if (month == 2) {
			calendar.set(Calendar.DAY_OF_MONTH, 28);
		}else if (month==4||month==6||month==9||month==11) {
			calendar.set(Calendar.DAY_OF_MONTH, 30);
		}else {
			calendar.set(Calendar.DAY_OF_MONTH, 31);
		}
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	public static int setTab(int month,int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int week = calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println(week);
		return week;
	}
	public void printWeek() {
		System.out.println("日\t一\t二\t三\t四\t五\t六");
	}
	public void printDate() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		System.out.println("\t\t" + year + "年" + month + "月\t\t\t" );
		System.out.println("日    一    二    三    四    五     六");
		for (int i = 0; i < 42; i++) {
//			calendar.get(Calendar.w);
		}
	}
}
