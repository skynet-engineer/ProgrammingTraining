package day1;

public class test1 {
	public static void main(String[]args) {
		String name1 = "Desktop1 ThinkPad";
		double price1 = 10999.0;
		int size1[] = {25,45};
		String mode1 = "intel kuri i7";
		int num1 = 10;
		
		String name2 = "Desktop2 DELL";
		double price2 = 10999.0;
		int size2[] = {25,35};
		String mode2 = "intel kuri i5";
		int num2 = 10;
		
		String name3 = "Desktop3 Huawei";
		double price3 = 10999.0;
		int size3[] = {35,45};
		String mode3 = "intel kuri i9";
		int num3 = 10;
		
		System.out.println("number1\n"
				+ "name:" + name1 
				+ "\nprice:" + price1
				+ "\nsize:" + size1[0] + " X " + size1[1]
				+ "\nmode:" + mode1
				+ "\nnumber:" + num1
				+ "\n-------------------------\n");
		
		System.out.println("number2\n"
				+ "\nname:" + name2 
				+ "\nprice:" + price2
				+ "\nsize:" + size2[0] + " X " + size2[1]
				+ "\nmode:" + mode2
				+ "\nnumber:" + num2
				+ "\n-------------------------\n");
		
		System.out.println("number3\n"
				+ "\nname:" + name3
				+ "\nprice:" + price3
				+ "\nsize:" + size3[0] +  " X " + size3[1]
				+ "\nmode:" + mode3
				+ "\nnumber:" + num3
				+ "\n-------------------------\n");
		
		System.out.println("All\n"
				+ "\nall number = " + (num1 + num2 + num3)
				+ "\nall price = " + (num1*price1 + num2*price2 + num3*price3));
		
	}

}
