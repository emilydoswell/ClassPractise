
public class Circle implements Drawable, Fillable {
	private String color;
	private int radius;
	
	// Getters & Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// Methods
	@Override
	public void fillingColor() {
		System.out.println("Now filling the shape with : " + getColor());
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		
	}

}
