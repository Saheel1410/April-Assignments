package week1.day2;

public class TwoSum {

	public static void main(String[] args) {

		int[] input = {2,3,4,5};
		int k = 10;
		boolean flag = false;
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if (input[i]+input[j]==k) {
					System.out.println("true");
					flag = true;
				}
			}
			if (flag) 
				break;
			
		}if (!flag) {
			System.out.println("false");
		}
	}

}
