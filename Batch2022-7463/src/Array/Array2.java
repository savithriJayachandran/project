package Array;
public class Array2 {
	public static void main(String[] args) {
	String employee[]= {"Maha ","Moni ","Krish ","Navi ","Bheem "};
	int age[]= {17,18,20,22,21};
	String lang[]= {"java","python","sql","c","sharepoint"};
	for (int i=0; i<employee.length; i++)
	{
		if(employee[i]==("krish"))
			continue;
		{
		if (age[i]>=20)	
		{
		System.out.println(employee[i] +"The employee with the age above 20: " +age[i] );
		}
		else {
		System.out.println(employee[i] +"The employee with the age below 20: " +age[i]);
		}
		if(lang[i]=="java")
		{
			System.out.println(employee[i] +"The employee with Known language : " +lang[i] );
		}
		else {
			System.out.println(employee[i] +"The employee with unmatched language: " + lang[i] );
		}}}}}
