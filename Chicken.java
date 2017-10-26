public class Chicken
{
	
	//Clases con Uper camel Case
	//Atributos con Lower Camel Case
	//Metodos con Lower Camel Case
	//Variables con Lower Camel Case
		// Atributos
		private String name;
		private String color;
		private int  age;
		//Metodos
		public void initialize(String name, String color, int age)
		{
			this.name=name; //el primero es el atributo de la clase el segundo es el parametro que recibo
			this.color=color;
			this.age=age;
		}
		public void layAndEgg()
		{
			System.out.println("The Chicken Lucia lay an egg");
		}
		public void poop()
		{
			System.out.println("The Chicken Maria pooped");
		}
		public void drink()
		{
			System.out.println("The Chicken Marta drank");
		}
		public void showData()
		{
			System.out.println("The Name of the Chicken is: " + name + " Color: " + color + " Age: " + age);
		}

	

}