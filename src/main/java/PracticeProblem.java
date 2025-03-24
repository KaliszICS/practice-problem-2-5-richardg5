public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] characters) {
		for (int i = 1; i < characters.length; i++) {
			char temp = characters[i];
			for (int e = i - 1; e >= 0 && characters[e] > temp; e--) {
				characters[e + 1] = characters[e];
				characters[e] = temp;
			}
		}
	}
}
