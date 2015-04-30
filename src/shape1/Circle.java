package shape1;

public class Circle extends Shape implements Drawable{
	
	public void draw(){
		System.out.println("원을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
