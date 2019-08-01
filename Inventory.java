public class Inventory
{
	public static void main(String[] args)
	{
		Good item1 = new Good("Bubble Bath", 2.5);
		item1.display();

		Food item2 = new Food("Root Beer", 2.45, 160);
		item2.display();

		Toy item3 = new Toy("Leggos" , 30 , 7);
		item3.display();

		Book item4 = new Book("Emma", 42, "Austen");
		item4.display();
	}
}

class Good
{
	private String description;
	private double price;

	public Good(String des, double pr)
	{
		description = des;
		price = pr;
	}

	public void display()
	{
		System.out.println("Description : " + description + ", Price : $" + price);
	}

}

class Food extends Good
{
	private int calories;

	public Food(String des, double pr, int cal)
	{
		super(des, pr);
		calories = cal;
	}

	public void display()
	{
		super.display();
		System.out.println("Calories : " + calories);
	}
}

class Toy extends Good
{
	private int minAge;

	public Toy(String des, double pr, int age)
	{
		super(des, pr);
		minAge = age;
	}

	public void display()
	{
		super.display();
		System.out.println("Minimum age : " + minAge);
	}

}

class Book extends Good
{
	private String author;

	public Book(String des, double pr, String aut)
	{
		super(des, pr);
		author = aut;
	}

	public void display()
	{
		super.display();
		System.out.println("Author : " + author);
	}
}
