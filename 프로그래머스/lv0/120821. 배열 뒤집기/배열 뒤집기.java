class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = num_list.length-1, y = 0; i >= 0 ; i--, y++) {
            answer[y] = num_list[i];
        }
        return answer;
    }
}