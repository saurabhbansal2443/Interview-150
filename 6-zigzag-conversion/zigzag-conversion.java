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
    // in this question the words are to be arranged zigZag Pattern then take any row of between and we have tried to find 
    // the charcaterr are following a pattern the next charcter so we have identified that pattern and then write the code 
    // acxcording to that the first charcter of the row os the number of rowth character and the next charcter is coming 
    // after 2*(numRows-1-i) and then afterthis the next is coming at 2*i and these goes on so we have used this trick 
}