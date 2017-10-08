import java.util.*;

public class median{
	public static void main(String args[]){
		PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();
		Scanner scan = new Scanner(System.in);
		int val,i;
		for(i=0;i<10;i++){
			val = scan.nextInt();
			if(max.peek() == null)
				max.add(val);
			else{
				if(val > max.peek())
					min.add(val);
				else
					max.add(val);
				if((min.size()-max.size()) == 2)
					max.add(min.poll());
				else if((min.size()-max.size()) == -2)
					min.add(max.poll());
			}
			System.out.print("median = ");
			if((min.size()-max.size()) == 1)
				System.out.println(min.peek());
			else if((min.size()-max.size()) == -1)
				System.out.println(max.peek());
			else if(min.size() == max.size())
				System.out.println((max.peek()+min.peek())/2);
		}
	}
}
