public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello Kevin");
		
		Chicken chicken = new Chicken();
		chicken.initialize("Lucy","brown",2);
		chicken.showData();
		
		Chicken chicken1 = new Chicken();
		chicken1.initialize("Lucia","yellow",1);
		chicken1.showData();
		chicken1.layAndEgg();
		
		Chicken chicken2 = new Chicken();
		chicken2.initialize("Maria","white",2);
		chicken2.showData();
		chicken2.poop();
		
		Chicken chicken3 = new Chicken();
		chicken3.initialize("Marta","white",3);
		chicken3.showData();
		chicken3.drink();
		
			
	}
}