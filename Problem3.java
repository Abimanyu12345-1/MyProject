package Modal;
import java.util.*;
class Process {
	 void main() {
		Scanner sc = new Scanner(System.in);
		// Take size of the array
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] input = new int[n];
		// Take input elements
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt(); 
			}
		// Create a HashMap to store counts for 1..9
		Map<Integer, Integer> countMap = new HashMap<>();
		// Initialize counts to 0
		for (int i = 1; i <= 9; i++) {
			countMap.put(i, 0);
			}
		// Count multiples
		for (int num : input) {
			for (int i = 1; i <= 9; i++) {
				if (num % i == 0) {
					countMap.put(i, countMap.get(i) + 1);
					}
				}
			}
		// Print output in dictionary format
		System.out.print("{");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + ": " + countMap.get(i));
			if (i != 9) {
				System.out.print(", ");
				}
			}
		
System.out.println("}");
sc.close();
}
	}




public class Problem3 {

	public static void main(String[] args) {
		Process obj=new Process();
		obj.main();

	}

}
