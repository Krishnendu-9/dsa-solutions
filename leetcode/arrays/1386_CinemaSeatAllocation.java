import java.util.*;
class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
        for (int[] seat : reservedSeats) {
            rows.putIfAbsent(seat[0], new HashSet<>());
            rows.get(seat[0]).add(seat[1]);
        }
        int answer = (n -rows.size()) * 2;

        for (HashSet<Integer> seats : rows.values()){

            boolean left = true, middle = true, right = true;

            for (int seat = 2; seat <= 5; seat++){
                if (seats.contains(seat)){
                    left = false;
                    break;
                }
            }

            for (int seat = 4; seat <= 7; seat++){
                if (seats.contains(seat)){
                    middle = false;
                    break;
                }
            }

            for (int seat = 6; seat <= 9; seat++){
                if (seats.contains(seat)) {
                    right = false;
                    break;
                }
            }

            if (left && right){
                answer += 2;
            } else if (left || middle || right){
                answer++;
            }
        }
        return answer;
    }
}
