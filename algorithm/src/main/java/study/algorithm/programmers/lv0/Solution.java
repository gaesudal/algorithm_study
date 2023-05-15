package study.algorithm.programmers.lv0;

/**
 * @author SUDAL
 */
public class Solution {

    public int aDifferenceOfTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public int getTheRest(int num1, int num2) {
        return num1 % num2;
    }

    public int ageOutput(int age) {
        return 2022 - age + 1;
    }

    public int seekingAShare(int num1, int num2) {
        return num1 / num2;
    }

    public int toCompareNumbers(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public int theProductOfTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public int theSumOfTheTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int divisionOfTwoNumbers(int num1, int num2) {
        return (num1 * 1000) / num2;
    }

    public int protractor(int angle) {
        int result = 0;
        if (0 < angle && angle < 90) {
            result = 1;
        } else if (angle == 90) {
            result = 2;
        } else if (90 < angle && angle < 180) {
            result = 3;
        } else if (angle == 180) {
            result = 4;
        }
        return result;
    }

    public int theSumOfEvenNumbers(int n) {
        int result = 0;
        for (int i = 2; i <= n; i += 2) {
            result += i;
        }
        return result;
    }

    public double averageValueOfAnArray(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        answer = answer / numbers.length;
        return answer;
    }

    public int lambSkewers(int n, int k) {
        return n * 12000 + k * 2000 - (n/10 * 2000);
    }

    public int[] flipArray(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = num_list.length-1, y = 0; i >= 0 ; i--, y++) {
            answer[y] = num_list[i];
        }
        return answer;
    }

    public int[] createArrayDoubleArray(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public int findTheLocationOfAPoint(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
}
