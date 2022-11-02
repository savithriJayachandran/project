package PracticeCode;

public class StudentPercentage{
public static void main(String[] args) {
		String[] name = {"Ammu","Pappu","Buji","Babloo"};
int[][] marks = new int[4][4];
marks[0][0]=99;
marks[0][1]=80;
marks[0][2]=75;
marks[0][3]=69;
marks[1][0]=98;
marks[1][1]=82;
marks[1][2]=77;
marks[1][3]=68;
marks[2][0]=97;
marks[2][1]=84;
marks[2][2]=79;
marks[2][3]=99;
marks[3][0]=96;
marks[3][1]=88;
marks[3][2]=71;
marks[3][3]=75;{
	for(int i=0;i<marks.length;i++) {
		int total=0;
		for(int j=0;j<marks.length; j++){
			total=total+marks[i][j];}
	for(int k=0;k<name.length;k++){
		System.out.println("Total marks obtained by stuents " +name[k]+":" +total);
		double percen =(double)total/3;
		System.out.println("Percentage:" +name[i]+ " " +percen);
}}}}}