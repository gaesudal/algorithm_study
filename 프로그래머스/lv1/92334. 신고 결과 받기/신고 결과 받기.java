import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reportMap = new HashMap<>();

        for (String item : id_list) {
            Set<String> reportSet = new HashSet<>();
            reportMap.put(item, reportSet);
        }

        for (String value : report) {
            String[] reportStr = value.split(" ");
            reportMap.get(reportStr[1]).add(reportStr[0]);
        }

        for (String s : id_list) {
            if (reportMap.get(s).size() >= k) {
                Iterator<String> iterator = reportMap.get(s).iterator();
                while (iterator.hasNext()) {
                    String id = iterator.next();
                    for (int l = 0; l < id_list.length; l++) {
                        if (id_list[l].equals(id)) {
                            answer[l]++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}