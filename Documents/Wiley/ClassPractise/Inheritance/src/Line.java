
public class Line implements Drawable {
	public int thickness;
	public String color;

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing color is : " + color);
	}

	@Override
	public void thickness() {
		System.out.println("Thickness of the line" + thickness);
	}
}
