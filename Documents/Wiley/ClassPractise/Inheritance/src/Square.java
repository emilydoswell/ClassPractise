
public class Square implements Drawable, Fillable {
	public String color;
	public int length;
	public int height;

	@Override
	public void fillingColor() {
		System.out.println("Filling the colour" + color);
	}

	@Override
	public void size() {
		int area = height * length;
		System.out.println("The area is : " + area);
	}

	@Override
	public void drawingColor() {
		
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		
	}

}
