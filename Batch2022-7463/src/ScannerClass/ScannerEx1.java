package ScannerClass;
import java.util.Scanner;
public class ScannerEx1 {
public static void main(String[] args) {
		int n,m;
		Scanner SC = new Scanner(System.in);
	    System.out.println("Enter the no of Rows: ");
	    m=SC.nextInt();
	    System.out.println("Enter the no of Columns: ");
	    n=SC.nextInt();
		int arr[][]= new int[m][n];
		System.out.println("Enter the elements ");
		for (int i=0;i<m;i++)
			for(int j=0;j<n;j++){
	     arr[i][j]=SC.nextInt();}
		System.out.println(" The elements Are: ");
		for (int i=0;i<m;i++){
			for (int j=0;j<n;j++)
		System.out.print(arr[i][j]+ " ");
			System.out.println();
	     }}}