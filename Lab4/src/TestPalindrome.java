import java.util.Scanner;

public class TestPalindrome {
	
	public static void main(String[] args) {
		TestPalindrome t = new TestPalindrome();
		t.testPalindrome();


	
	}
	
	public void testPalindrome() {
		Scanner in = new Scanner(System.in);
		String str = "";
		char option = 'y';
		
		while(option=='y') {
			try {
			System.out.println("Enter a string: ");
			str=in.nextLine();
			str=str.replaceAll("\\s+","");// remove all spaces
			str=str.toLowerCase();// to lower case
			if(isPalindrome(str,0)) {
				System.out.print("This string is a palindrome");
			}else {
				System.out.print("This string is not a palindrome");
			}
			System.out.println("    Do another (Y/n)? ");	
			option=in.nextLine().toLowerCase().charAt(0);
			if(option=='n') return;
			}catch(Exception e) {
				System.out.println("Please enter a valid value.");
			}
			
		}
	}
	public boolean isPalindrome(String str, int index) {
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			if(str.length()>2) {
				return isPalindrome(str.substring(index+1, str.length()-1),0);
			}else {
				return true;
			}
		}
		return false;
	}
	
/*	public boolean forLoopPalindrome(String str) {

		for (int i = 0, j=str.length()-1; i <str.length()/2; i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}*/

}
