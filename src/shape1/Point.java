package shape1;

public class Point {
	private int x;
	private int y;
	
	public Point(){
		System.out.println("call Shape()");
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void Show(){
		System.out.println("좌표[x="+x+",y="+y+"]에 점을 그렸습니다.");
	}
	public void Show(int a, int b){
		System.out.println("좌표[x="+a+",y="+b+"]에 점을 그렸습니다.");
	}
	public void Show(boolean visible){
		if(visible==true){
			Show();
		}
		else{
			System.out.println("좌표[x="+x+",y="+y+"]에 점을 지웠습니다.");
		}
	}
}
