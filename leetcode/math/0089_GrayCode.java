class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> answer = new ArrayList<>();
        int size = 1 << n;
        for (int i = 0; i < size; i++){
            answer.add(i ^ (i >> 1));
        }
        return answer;
    }
}
