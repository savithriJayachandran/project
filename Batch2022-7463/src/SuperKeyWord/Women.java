package SuperKeyWord;
 class Women {
 String name="Geetha";
 }
class Girl extends Women{
	String name="Moni";
	void display() {
		System.out.println("The women name is: " +super.name);
		System.out.println("The Women allows her child to be independent her name is: "  +name);
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Girl g=new Girl();
	g.display();

}}
