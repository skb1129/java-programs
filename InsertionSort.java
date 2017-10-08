import java.util.Scanner;

public class InsertionSort {
	public static void insertion_sort(int arr[]) {
		int n = arr.length;
		int i, j, temp;
		for (i = 0; i < n; i++) {
			j = i;
			temp = arr[i];
			while (j > 0 && temp < arr[j-1]) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n, i;
		n = inp.nextInt();
		int arr[] = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = inp.nextInt();
		}
		insertion_sort(arr);
		for (i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}
}
