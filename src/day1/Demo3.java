package day1;

public class Demo3 {
	public static void main(String[] args) {
		int arr[] = {1,6,2,3,9,4,5,7,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int hold;
					hold = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = hold;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] < arr[j+1]) {
					int hold;
					hold = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = hold;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
