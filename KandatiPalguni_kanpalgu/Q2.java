import java.util.Scanner;
public class Q2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number:");
		double p1=sc.nextDouble();
		System.out.println("Input second number:");
		double p2=sc.nextDouble();
		if(p1>0 && p1<1 && p2>0 &&p2<1)
			System.out.println("true");
		else
			System.out.println("false");
	}
}