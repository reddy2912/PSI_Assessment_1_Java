import java.util.Scanner;
public class Q1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int count=0;
		System.out.println("Input first number:");
		arr[0]=sc.nextInt();
		System.out.println("Input second number:");
		arr[1]=sc.nextInt();
		System.out.println("Input third number:");
		arr[2]=sc.nextInt();
		System.out.println("Input fourth number:");
		arr[3]=sc.nextInt();
		for(int i=1;i<4;i++) {
			if(arr[0]==arr[i]) 
				count++;
			else
				break;
		}
		if(count==3)
			System.out.println("Numbers are equal");
		else
			System.out.println("Numbers are not equal");
	}
}