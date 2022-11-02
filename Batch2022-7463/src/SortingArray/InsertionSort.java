package SortingArray;

public class InsertionSort {
	public static void insertionSort(int array[]) {
	int n=array.length;
for(int j=1;j<n;j++){
	int key=array[j];
	int i=j-1;
	while ((i>-1)&&(array[i]>key)) {
	array[i+1]=array[i];
	i--;
}
	array[i+1]=key;
}}
public static void main(String[] args) {
		int arr[]= {27,14,7,17,26,6,12};
		System.out.println(" Before insertion Sort: ");
		for(int i:arr){
			System.out.println(  " Before insertion sorting: " +i );
		}
		InsertionSort is= new InsertionSort();
		is.insertionSort(arr);
		System.out.println("After insertion Sort: ");
		for(int i:arr)
		{
			System.out.println(  " After insertion sorting: " +i );
		}}

}

