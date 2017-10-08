package pack2;
import pack1.*;
public class three extends one{
	public void display() {
		System.out.println("THREE:");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) {
		three y = new three();
		y.display();
		four x = new four();
		x.display();
	}
}
class four {
	one x = new one();
	public void display() {
		System.out.println("FOUR:");
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(x.c);
		System.out.println(x.d);
	}
}
