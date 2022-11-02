package SortingArray;

public class SelectionSort {
	void sort (int array[]){
		int n=array.length;
		for (int i=0;i<n-1;i++){
			int min_element = i;
			for (int j=i+1; j<n; j++)
				if (array[j] <array[min_element])
					min_element=j;
			int temp=array[min_element];
			array[min_element] =array[i];
			array[i]=temp;
		}}
	void printarray(int array[]){
		int n= array.length;
		for(int i=0; i<n; ++i)
			System.out.println(array[i]+ " ");
		System.out.println();
	}
			public static void main(String[] args) {
		SelectionSort ob= new SelectionSort();
		int array[]= {15,10,5,20,50,65};
		ob.sort(array);
		System.out.println("Sorted array");
		ob.printarray(array);
	}}


