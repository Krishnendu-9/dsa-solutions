class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();

        makeParenthesis("", 0, 0, n, answer);
        return answer;
    }
    private void makeParenthesis(String s, int open, int close,int n,List<String> answer) {

        if (s.length() == n * 2) {
            answer.add(s);
            return;
        }
        if (open < n) {
            makeParenthesis(s + "(", open + 1, close, n, answer);
        }
        if (close < open) {
            makeParenthesis(s + ")", open, close + 1, n, answer);
        }
    }
}
