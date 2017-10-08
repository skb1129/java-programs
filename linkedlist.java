class node {
	int data;
	node next;
	public node(){
		next = null;
		data = 0;
	}
	public node(int d, node n){
		next = n;
		data = d;
	}
	public void setNext(node n){
		next = n;
	}
	public void setData(int d){
		data = d;
	}
	public node getNext(){
		return next;
	}
	public int getData(){
		return data;
	}
}
class list {
	node start, end;
	int size;
	public list(){
		start = null;
		end = null;
		size = 0;
	}
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return start == null;
	}
	public void push_back(int val){
		node nptr = new node(val,null);
        size++;
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            end.setNext(nptr);
            end = nptr;
        }
	}
	public void push_front(int val){
		node nptr = new node(val, null);
        size++;
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setNext(start);
            start = nptr;
        }
	}
	public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == null)
        {
            System.out.println(start.getData() );
            return;
        }
        node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getNext();
        while (ptr.getNext() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
public class linkedlist {
	public static void main(String[] args) {
		list ll = new list();
		ll.push_back(1);
		ll.push_back(2);
		ll.push_back(3);
		ll.push_back(4);
		ll.push_back(5);
		ll.display();
	}
}
