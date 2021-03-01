import java.util.Scanner;
public class Q4 {
	public static void main(String args[]) {
		int[][] twodim={{10,20,30},{40,50,60}};
		System.out.print("Original Array:\n");
		print_arr(twodim);
		System.out.println("After changing the rows and columns");
		int[][] newtwodim=new int[twodim[0].length][twodim.length];
		for(int i=0;i<twodim.length;i++) {
			for(int j=0;j<twodim[0].length;j++) {
				newtwodim[j][i]=twodim[i][j];
			}
		}
		print_arr(newtwodim);
	}
	private static void print_arr(int[][] twodim) {		
		for (int i = 0; i < twodim.length; i++) {
			for (int j = 0; j < twodim[0].length; j++) {
				System.out.print(twodim[i][j] + " ");
			}
			System.out.println();
		}
	}
}
