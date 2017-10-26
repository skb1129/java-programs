import java.util.*;

class Data implements Comparable<Data> {
	int rno;
	String name;
	double grade;
	public Data(int r, String n, double g){
		rno = r;
		name = n;
		grade = g;
	}
	@Override
	public int compareTo(Data obj) {
		if (obj == null) {
			return -1;
		}
		int cmp = Integer.valueOf(rno).compareTo(obj.rno);
		if (cmp != 0) {
			return cmp;
		}
		return name.compareTo(obj.name);
	}

	@Override
	public String toString() {
		return String.format("%d\t%s\t%f\n", rno, name, grade);
	}
}

public class Student {
	public static void main(String[] args) {
		List <Data> students = new ArrayList<>();
		students.add(new Data(2,"b",7.1));
		students.add(new Data(2,"a",8.1));
		students.add(new Data(5,"c",9.1));
		students.add(new Data(3,"d",6.1));
		students.add(new Data(4,"e",8.2));
		Collections.sort(students);
		System.out.println(students);
	}
}
