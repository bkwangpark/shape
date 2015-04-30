package shape1;
public class ShapeApp {
	public static void main(String[] args) {
		/*Shape s=new Shape();
		s.setX(2);
		s.setY(5);
		Shape h=new Shape();
		h.setX(10);
		h.setY(23);
		Shape a=new Shape(50, 50);
		
		s.Show();
		h.Show();
		a.Show();
		a.Show(false);
		a.Show(true);*/
		//ColorPoint point4=new ColorPoint(10,50,"red");
		/*point4.setX(10);
		point4.setY(50);
		point4.setColor("red");*/
		//point4.Show();
		
		//인터페이스 테스트
		//Drawable drawable = new Point(10, 20);
		//drawable.draw();
		
		// instaceof 테스트
		Circle c= new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Visible);
		
		//Error
		//System.out.println(c instanceof Rect);
		
		Shape s=c;
		System.out.println(s instanceof Rect);
	}
}
