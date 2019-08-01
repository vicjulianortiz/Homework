public class Rectangle
{
	private double length;
	private double width;

	public Rectangle( double len, double w)
	{
		length = len;
		width = w;
	}

	public void setLength( double len)
	{
		length = len;
	}

	public void setWidth( double w)
	{
		width = w;
	}

	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getArea()
	{
		return (length * width);
	}
}

class Cube extends Rectangle
{
	private double height;

	public Cube(double len, double w, double h)
	{
		super(len, w);
		height = h;
	}

	public double getHeight()
	{
		return height;
	}
	public double getSurfaceArea()
	{
		double area = super.getArea();
		return (area * 6.0);
	}

	public double getVolume()
	{

		return( super.getArea() * height);
	}
}
