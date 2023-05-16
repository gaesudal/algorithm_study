import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNumber = Integer.parseInt(sc.nextLine());
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < caseNumber; i++) {
            inputList.add(sc.nextLine());
        }

        for (String input : inputList) {
            int score = 0;
            int continueCount = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'O') {
                    score += ++continueCount;
                } else {
                    continueCount = 0;
                }
            }
            System.out.println(score);
        }

    }
}