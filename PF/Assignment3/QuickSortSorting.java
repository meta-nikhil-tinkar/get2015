import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSortSorting {

	/**
	 * UserInput is a function which is use to calculate the length of an array
	 * 
	 * @return It return a length of an array
	 */

	int UserInput() {
		int length;
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the length of an array.");
			length = scanner.nextInt();
			if (length < 0) {
				System.out.println("length can't be negative");
				length = UserInput();

			}
			return length;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			length = UserInput();
			return length;
		}

	}

	/**
	 * UserInputInArray is a function which is use to insert the element in
	 * array
	 * 
	 * @param length it take length of array
	 * @return It return a length of an array
	 */

	int[] UserInputInArray(int length) {

		int input[] = new int[length];

		try {
			Scanner scanner = new Scanner(System.in);

			System.out.print("enter element in array");

			for (int TakeInputInArray = 0; TakeInputInArray < length; TakeInputInArray++)
				input[TakeInputInArray] = scanner.nextInt();
			return input;
		} 
		catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			input = UserInputInArray(length);
			return input;
		}

	}

	/**
	 * QuickSort is a function which sort the element with quick sort algorithm
	 * 
	 * @param input is array which we want to sort it.
	 * @param StartIndex is starting index of the array
	 * @param LastIndex is ending index of array
	 */

	void QuickSort(int input[], int StartIndex, int LastIndex) {
		int partition = Partition(input, StartIndex, LastIndex);

		if (StartIndex < partition - 1)
			QuickSort(input, StartIndex, partition - 1);

		if (LastIndex > partition)
			QuickSort(input, partition, LastIndex);

	}

	/**
	 * Partition is a function which is divide array in two parts.
	 * 
	 * @param input
	 *            is array which we want to sort it.
	 * @param StartIndex
	 *            is starting index of the array
	 * @param LastIndex
	 *            is ending index of array
	 * @return left side element is smaller and right element is larger from the
	 *         return value
	 */

	int Partition(int input[], int StartIndex, int LastIndex) {
		int pivort = input[StartIndex];

		while (StartIndex <= LastIndex) {

			while (input[StartIndex] < pivort) {
				StartIndex++;
			}

			while (input[LastIndex] > pivort) {
				LastIndex--;
			}

			if (StartIndex <= LastIndex) // swap the element

			{
				int temp;
				temp = input[StartIndex];
				input[StartIndex] = input[LastIndex];
				input[LastIndex] = temp;
				StartIndex++;
				LastIndex--;
			}
		}

		return StartIndex;

	}

	public static void main(String[] args) {

		QuickSortSorting quickSortSorting = new QuickSortSorting();

		int length = quickSortSorting.UserInput();
		int input[] = quickSortSorting.UserInputInArray(length);

		quickSortSorting.QuickSort(input, 0, input.length - 1);

		for (int PrintOutputArray = 0; PrintOutputArray < input.length; PrintOutputArray++)
			System.out.println(input[PrintOutputArray]);

	}

}
