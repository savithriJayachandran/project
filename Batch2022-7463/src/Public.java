
 class Student
{
public int girlsCount;
public void display() {
 System.out.println("Number of Students is:10");
 System.out.println("The count is " +girlsCount +" girls");
 }
}

public class Public {
public static void main( String[] args ) 
{
Student student = new Student();
student.girlsCount = 4;
student.display();
}
}