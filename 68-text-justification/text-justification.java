



class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        
        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;
            
            // Collect words that fit in the current line
            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length(); // Add space and next word length
                last++;
            }

            int gapCount = last - index - 1;
            StringBuilder sb = new StringBuilder();
            
            // Handle last line or lines with only one word (left-justified)
            if (last == words.length || gapCount == 0) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" "); // Fill remaining spaces
            } 
            // Handle full justification
            else {
                int spaces = (maxWidth - totalChars + gapCount) / gapCount;
                int extraSpaces = (maxWidth - totalChars + gapCount) % gapCount;

                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) { // Add spaces after every word except the last
                        int spaceCount = spaces + (extraSpaces-- > 0 ? 1 : 0);
                        for (int j = 0; j < spaceCount; j++) sb.append(" ");
                    }
                }
            }
            
            result.add(sb.toString());
            index = last;
        }
        
        return result;
    }
}
