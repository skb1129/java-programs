import java.util.Scanner;

public class SelectionSort {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void selection_sort(int arr[]) {
		int n = arr.length;
		int i, j, pos, temp;
		for (i = 0; i < n-1; i++) {
			pos = i;
			for (j = i+1; j < n; j++) {
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}
			swap(arr,i,pos);
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
		selection_sort(arr);
		for (i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}
}
