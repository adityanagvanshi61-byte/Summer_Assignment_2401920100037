class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int write = 0;

        for (int read = 0; read < len; ) {
            char curr = chars[read];
            int count = 0;

            while (read < len && chars[read] == curr) {
                count++;
                read++;
            }

            chars[write++] = curr;

            if (count > 1) {
                String s = String.valueOf(count);
                for (int i = 0; i < s.length(); i++) {
                    chars[write++] = s.charAt(i);
                }
            }
        }

        return write;
    }
}
