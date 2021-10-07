package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test= "feeling good";
		System.out.println("Input String:");
		System.out.println(test);
		int len=test.length();
		char[] arr = test.toCharArray();
		System.out.println();
		System.out.println("Reversed String:");
		for (int i = len-1; i >=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
