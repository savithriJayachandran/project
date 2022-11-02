package ScannerClass;

import java.util.Scanner;

public class MeanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner SC = new Scanner(System.in);
		int sum=0,
		count=0;
	    System.out.println("Enter the Range of numbers: ");
	  int n=SC.nextInt();
	  
	  System.out.println("Enter the numbers: ");
	  for(int i=1;i<=n;i++) {
		  int num = SC.nextInt();
		  sum+=num;
		  count++;
	  }
	  int mean=sum/count;
	  System.out.println("mean of the numbers are: " +mean);
	  
	}}
