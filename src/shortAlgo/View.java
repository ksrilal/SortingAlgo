package shortAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		int n, c;
		
		//shorting class 
		Bubble bShort = new Bubble();
		Insertion iShort = new Insertion();
		Selection sShort = new Selection();
		Merge mShort = new Merge();
		Heapsort hSort = new Heapsort();
		Quicksort qSort = new Quicksort();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("\tShorting Algorithems");
		System.out.println("Enter number of elements: ");
		n = userInput.nextInt();
		
		//create array
		int a[] = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			a[i] = userInput.nextInt();
		}
		
		System.out.println(	"1 - Bubble Shorting \n"
							+ "2 - Insertion Shorting \n"
							+ "3 - Slection Shorting \n"
							+ "4 - Merge Shorting \n"
							+ "5 - Heapsort Shorting \n"
							+ "6 - Quicksort Shorting \n"
							+ "Enter type of Shorting Algorithems: ");
		c = userInput.nextInt();
		System.out.print("Unshorted Array: ");
		System.out.println(Arrays.toString(a));
		
		switch(c) {
		case 1: 
			bShort.bubbleShort(a);
			System.out.print("Bubble Shorted Array: ");
			System.out.println(Arrays.toString(a));
			break;
		case 2: 
			iShort.insertionShort(a);
			System.out.print("Insertion Shorted Array: ");
			System.out.println(Arrays.toString(a));
			break;
		case 3: 
			sShort.selectionShort(a);
			System.out.print("Selection Shorted Array: ");
			System.out.println(Arrays.toString(a));
			break;
		case 4: 
			mShort.mergeShort(a, 0, a.length-1);
			System.out.print("Merge Shorted Array: ");
			System.out.println(Arrays.toString(a));
			break;
		case 5: 
			hSort.heapSort(a);
			System.out.print("Heapsort Shorted Array: ");
			System.out.println(Arrays.toString(a));
			break;
		case 6: 
			qSort.quickSort(a, 0, a.length-1);
			System.out.print("Quicksort Shorted Array: ");
			System.out.println(Arrays.toString(a));
			break;
		default: System.out.println("Invalid Input!!");
		}			
	}
}
