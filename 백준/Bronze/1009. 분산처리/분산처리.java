import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author SUDAL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        List<String> caseList = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            caseList.add(sc.nextLine());
        }

        for (String caseStr:
             caseList) {
            String[] splitCase = caseStr.split(" ");
            int a = Integer.parseInt(splitCase[0]);
            int b = Integer.parseInt(splitCase[1]);
            int result = a;

            for (int i = 1; i < b; i++) {
                result *= a;
                result %= 10;
            }

            result %= 10;

            if (result == 0) {
                result = 10;
            }

            System.out.println(result);
        }
    }
}
