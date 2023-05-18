import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<Integer, String> rankPlayersMap = new HashMap<>(); // 랭크 - 선수
        Map<String, Integer> playersRankMap = new HashMap<>(); // 선수 - 랭크
        for (int i = 0; i < players.length; i++) {
            rankPlayersMap.put(i, players[i]);
            playersRankMap.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            int preRank = playersRankMap.get(callings[i]);
            String passPlayer = rankPlayersMap.get(preRank - 1);

            int currentRank = playersRankMap.get(passPlayer);

            playersRankMap.put(callings[i], currentRank);
            playersRankMap.put(passPlayer, currentRank + 1);

            rankPlayersMap.put(currentRank, callings[i]);
            rankPlayersMap.put(currentRank + 1, passPlayer);
        }
        answer = rankPlayersMap.values().toArray(new String[0]);
        return answer;
    }
}