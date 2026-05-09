class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
                "", "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        solve(digits, 0, "", ans, map);

        return ans;
    }

    public void solve(String digits, int idx,
                      String curr,
                      List<String> ans,
                      String[] map) {

        // combination ready
        if (idx == digits.length()) {
            ans.add(curr);
            return;
        }

        // current digit
        int digit = digits.charAt(idx) - '0';

        // us digit ki string
        String str = map[digit];

        // har character try karo
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // current string me add karke next digit pe jao
            solve(digits, idx + 1, curr + ch, ans, map);
        }
    }
}