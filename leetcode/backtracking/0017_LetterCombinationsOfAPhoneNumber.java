class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> answer = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return answer;
        }

        String[] letters = {
            "", "", "abc", "def","ghi", "jkl", "mno","pqrs", "tuv", "wxyz"
        };
        makeCombinations(digits, 0, "", letters, answer);
         return answer;
    }

    private void makeCombinations(String digits,int index,String current,String[] letters, List<String> answer) {
        if (index == digits.length()) {
            answer.add(current);
            return;
        }

        String options = letters[digits.charAt(index) - '0'];

        for (int i = 0; i < options.length(); i++) {
            makeCombinations(
                digits,
                index + 1,
                current + options.charAt(i),
                letters,
                answer
            );
        }
    }
}
