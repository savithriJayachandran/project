package StringBuffer;

public class ReplaceString {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("GoodMorning");  
		sb.replace(0,4,"Java");  
		System.out.println(sb);//prints JavaMorning  

	}

}
