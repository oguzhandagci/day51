import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                arr.add(input);
            }
        }

        System.out.println("Done entering integers into the list\n" +
                "What number are you looking for in the list?");
        int value = scanner.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (value == arr.get(i)) {
                System.out.println(value + " is at index " + i);
            }
        }
    }
}