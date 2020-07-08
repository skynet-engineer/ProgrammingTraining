package day1;

public class Demo2 {
	public static void main(String [] args) {
		double length = 3000;
		int day;
		for(day = 0;length > 5;day++) {
			length = length/2;
		}
		System.out.println("Day " + day);
	}
}
