import java.util.Scanner;
public class Q6 {	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	System.out.print("Input first number: ");
        	int n = sc.nextInt();
    		int k = 0;
    		String binaryNumber = Integer.toBinaryString(n);
		System.out.print("Binary representation of "+n+" is: "+binaryNumber);
    		for (char ch : binaryNumber.toCharArray()) {
      		k += ch == '0' ? 1 : 0;
    		}
		System.out.println("\nNumber of zero bits: " + k);
  }	
	
}