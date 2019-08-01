public class Shape
{
	public static void main(String[] args)
	{
		Cube shape1 = new Cube(1, 2, 3);
		System.out.println(shape1);

		double area = shape1.getVolume();
		System.out.println(area);
	}
}
