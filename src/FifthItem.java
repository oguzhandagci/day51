import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some stuff and I'll tell you what the 5th thing you entered!");
        ArrayList<String> entries = new ArrayList<String>();

        for (int i = 0; i < entries.size() + 1; i++) {
            String input = scanner.nextLine();
            if (input.isBlank()){
                System.out.println("Your fifth item is " + entries.get(4));
            }
            else {
                entries.add(input);
            }
        }
    }
}