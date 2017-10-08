package pack1;
public class one {
	private int a;
	int b;
	protected int c;
	public int d;
	public one(){
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void display() {
		System.out.println("ONE:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) {
		one y = new one();
		y.display();
		two x = new two();
		x.display();
	}
}
class two extends one {
	public void display() {
		System.out.println("TWO:");
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
