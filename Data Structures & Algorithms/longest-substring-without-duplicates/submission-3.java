class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max_str = 0;

        for (int i = 0; i < s.length(); i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (set.contains(ch)) {
                    break;
                }

                set.add(ch);

                max_str = Math.max(max_str, set.size());
            }
        }

        return max_str;
    }
}