class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < numRows; i++) {
            int charIndex = i;
            int downCalc = 2 * (numRows - 1 - i);
            int upCalc = 2 * i;
            boolean down = true;

            while (charIndex < s.length()) {
                sb.append(s.charAt(charIndex));

                if (i == 0) {
                    charIndex += downCalc;
                } else if (i == numRows - 1) {
                    charIndex += upCalc;
                } else {
                    if (down == true) {
                        charIndex += downCalc;
                    } else {
                        charIndex += upCalc;
                    }
                    down = !down;
                }
            }
        }

        return sb.toString(); 
    }
}