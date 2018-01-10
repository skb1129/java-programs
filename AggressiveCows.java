import java.util.*;

/* Least Maximum distance between aggressive cows */

public class AggressiveCows {
	public static void arrange_cows(int stalls, int cows, int[] stallNo, int[] dist, int cow, int index) {
		for (int i = (n-cow); i > 0; i--) {
			dist[index] = stallNo[i];
		}
	}

	public static void main(String[] args) {
		int stalls, cows;
		Scanner scan = new Scanner(System.in);
		stalls = scan.nextInt();
		cows = scan.nextInt();
		int[] stallNo = new int[n];
		for (int i = 0; i < n; i++) {
			stallNo[i] = scan.nextInt();
		}
		Arrays.sort(stallNo);
		int[] dist = new int[c];
		arrange_cows(n, c, stallNo, dist, c-1, 1);
	}
}