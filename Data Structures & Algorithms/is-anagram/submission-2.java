class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] collection1 = s.toCharArray();
        char[] collection2 = t.toCharArray();

        Arrays.sort(collection1);
        Arrays.sort(collection2);

        return Arrays.equals(collection1, collection2);
    }
}