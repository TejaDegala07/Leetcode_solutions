class Solution {
    public String longestPrefix(String s) {
        StringBuilder sb = new StringBuilder();
        String ans = "";

        for (int i = 0; i < s.length() - 1; i++) {
            sb.append(s.charAt(i));

            if (s.endsWith(sb.toString())) {
                ans = sb.toString();
            }
        }

        return ans;
        
    }
}