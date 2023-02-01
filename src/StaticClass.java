
public class StaticClass 
{
	public static void main(String args[]) {
	int a = 10;
	 display();
	{
		System.out.println(a);
		System.out.println("static variable");
	}
}

	static void display() {
		// TODO Auto-generated method stub
		
	}
}
class Class 
{
	public static void main(String args[])
	{
		System.out.println("Main method");
		System.out.println();
		StaticClass.display();
	}
	
	

}
