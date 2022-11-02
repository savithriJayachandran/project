package SortingArray;
import java.util.Scanner;
public class BubbleSort {
	Scanner input= new Scanner(System.in);
void bubble(int a[]){
	int size=a.length;
	System.out.println("choose sorting order: " +size );
	System.out.println("Ascending sorting \n2 for descending order: " +size);
	int sortOrder= input.nextInt();
	for(int i=0;i<size-1;i++){
		for(int j=0;j<i-1;j++)
	if(sortOrder==1){
		if(a[j]>a[j+1]) {
		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		}}
		else {
		if(a[j]<a[j+1]){
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}}}}
	public static void main(String[] args) {
		int[] data= {24,42,76,67,89,98,54,45,21,12};
		BubbleSort bs=new BubbleSort();
		bs.bubble(data);
		System.out.println("The sorted array are: " +data);
		}}
		
	
		
		

	


