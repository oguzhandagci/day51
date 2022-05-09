import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> arr = new ArrayList<String>();

        for (int i =0; i<arr.size()+1; i++){
            String input = scanner.nextLine();
            if(input.isBlank()){
                System.out.println("The total amount of items in the list was: "+arr.size());
            }
            else{
                arr.add(input);
            }
        }

    }
}
