package aufgabe_4;

import java.util.Random;

public class MatrixVectorMultiplier {

	private Random random;
	private int[] resultVector;

	public int multiply(int[][] matrix, int[] vector) {
		// Konsistenzprüfung, Vergleich nicht dazu zählen!
		if (matrix[0].length != vector.length) {
			throw new RuntimeException(
					"matrix.length and vector.length must be the same.");
		}

		// Ergebnis der Matrix-Vektor-Multiplikation initialisieren, nicht für
		// Zähler berücksichtigen
		int[] result = new int[matrix.length];

		// TODO: ab hier Zähler integrieren und als Returnvalue zurückgeben
		int counter = 0;

		for (int i = 0; i < matrix.length; i++) {

			counter = counter + 2;

			for (int j = 0; j < vector.length; j++) {
				counter = counter + 2;
				result[i] += matrix[i][j] * vector[j];
				counter++;

			}
		}

		// TODO: Ende Integration des Zählers

		// Speicherung des Ergebnisvektors, nicht erfassen durch den Zähler
		resultVector = result;

		// TODO: Zähler als Ergebnis der Methode zurückgeben
		return counter;
	}

	public int[][] getNxNMatrix(int n) {
		random = new Random(1337);

		int[][] result = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = random.nextInt(10);
			}
		}

		return result;
	}

	public int[] getNVector(int n) {
		random = new Random(4711);

		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = random.nextInt(10);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO: hier die unterschiedlichen Werte für n testen und Ergebnisse
		// notieren
		int n = 1000;
		MatrixVectorMultiplier mvm = new MatrixVectorMultiplier();
		int[][] matrix = mvm.getNxNMatrix(n);
		int[] vector = mvm.getNVector(n);

		int result = mvm.multiply(matrix, vector);
		System.out.println(result);
	}
}
