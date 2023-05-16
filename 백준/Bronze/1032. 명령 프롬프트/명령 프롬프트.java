import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        String[] dirArray = new String[count];

        for (int i = 0; i < count; i++) {
            dirArray[i] = sc.nextLine();
        }
        String dirBase = dirArray[0];
        char[] baseCharArray = dirBase.toCharArray();

        if (count != 1) {
            for (int i = 1; i < count; i++) {
                char[] compareCharArray = dirArray[i].toCharArray();
                for (int j = 0; j < baseCharArray.length; j++) {
                    if (baseCharArray[j] == '?' || baseCharArray[j] == compareCharArray[j]) {
                        continue;
                    }
                    baseCharArray[j] = '?';
                }
            }
            dirBase = String.valueOf(baseCharArray);
        }
        System.out.println(dirBase);
    }
}