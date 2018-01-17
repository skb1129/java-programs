import java.util.*;

public class AllocateBooks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> books = new ArrayList<Integer>();
		int i, j, l = 0, r = 0, mid = 0, val;
		for (i = 0; i < n; i++) {
			val = scan.nextInt();
			books.add(val);
			r += val;
		}
		int st = scan.nextInt();
		ArrayList<Integer> alloted_n = new ArrayList<Integer>();
		ArrayList<Integer> alloted = new ArrayList<Integer>();
		mid = (l + r) / st;
		while (l < mid && r > mid) {
			alloted_n.clear();
			alloted_n.add(0);
			for (i = 0, j = 0; i < n && j < st; i++) {
				if ((alloted_n.get(j) + books.get(i)) <= mid)
					alloted_n.add(j, alloted_n.get(j) + books.get(i));
				else {
					j++;
					i--;
					alloted_n.add(j, 0);
				}
			}
			if (i == n && j == (st - 1)) {
				alloted.clear();
				alloted.addAll(alloted_n);
				r = mid - 1;
			} else
				l = mid;

			mid = (l + r) / st;
		}
		System.out.println(Collections.max(alloted));
		scan.close();
	}
}