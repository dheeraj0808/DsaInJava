public class Duplicacy {
    public static void removeDuplicacy(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Processing the current character
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicacy(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicacy(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicacy(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
