import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArray = str.split(" ");
        int min = 50;
        for (int i = 0; i < strArray[1].length()- strArray[0].length()+1; i++) {
            int tmpCount = 0;
            for (int j = 0; j < strArray[0].length(); j++) {
                if (strArray[0].charAt(j) != strArray[1].charAt(i+j)) {
                    tmpCount++;
                }
            }
            if (tmpCount < min) {
                min = tmpCount;
            }
        }

        System.out.println(min);
    }
}