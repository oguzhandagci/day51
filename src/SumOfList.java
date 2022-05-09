import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                arr.add(input);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                System.out.print(arr.get(i) + ", ");
            } else
                System.out.println("and " + arr.get(i) + " are in the arrayList and the sum is:\n" + sum(arr));
        }
    }

    public static int sum(ArrayList<Integer> arr) {

        int total = 0;
        for (Integer integer : arr) {
            total += integer;
        }
        return total;
    }
}