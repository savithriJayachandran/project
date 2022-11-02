public class Puppy
{
int puppyAge;
public Puppy(String name){
System.out.println("Name chosen is:" +name);
}
public void setAge(int age){
puppyAge=age;
}
public void getAge( ){
System.out.println("Puppy's Age is :" +puppyAge);

}
public static void main( String args[])
{
Puppy myPuppy=new Puppy("rosy");
myPuppy.setAge(3);
myPuppy.getAge();
}
}