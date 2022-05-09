import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList <String> arr = new ArrayList<String>();

        for(int i = 0; i < arr.size()+1; i++){

            String input = scanner.nextLine();
            if (input.isBlank()){
                System.out.println("The last item in the list is: "+ (arr.get(arr.size()-1)));
            }
            else {
                arr.add(input);
            }
        }
    }


}
