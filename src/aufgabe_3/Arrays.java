package aufgabe_3;

public class Arrays {

	public static boolean isEven(int number) {

		boolean result = false;

		if (number % 2 == 0) {
			result = true;
		}

		return result;
	}

	public static int countEvens(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			if (isEven(array[i])) {
				count++;
			}

		}

		return count;
	}

	public static String evenPositionsToString(int[] array) {

		String result = "";
		int counter = 0;

		for (int i = 0; i < array.length; i++) {

			if (counter == countEvens(array)) {
				result = result + i;
			}

			if (isEven(array[i])) {
				counter++;

				if (counter == countEvens(array)) {
					result = result + i;

				} else {
					result = result + i + " - ";

				}
			}

		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(isEven(3));
		System.out.println(isEven(2));

		int[] array = { 1, 2, 5, 8, 3, 9, 4 };
		System.out.println(countEvens(array));

		System.out.println(evenPositionsToString(array));

	}

}
