
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth)
                    break;
                totalChars += 1 + words[last].length();
                last++;
            }

            int gapCount = last - index - 1;
            StringBuilder sb = new StringBuilder();

            if (last == words.length || gapCount == 0) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1)
                        sb.append(" ");
                }
                while (sb.length() < maxWidth)
                    sb.append(" ");
            }

            else {
                int spaces = (maxWidth - totalChars + gapCount) / gapCount;
                int extraSpaces = (maxWidth - totalChars + gapCount) % gapCount;

                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) {
                        int spaceCount = spaces + (extraSpaces-- > 0 ? 1 : 0);
                        for (int j = 0; j < spaceCount; j++)
                            sb.append(" ");
                    }
                }
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }
}
// in this code first we have to arrange the words of words array in exactly the maxwidth 
// size of string where we can take the first strings which is less than  the maxwidth 
// because in between the strings at least one space is mandatory we can put multiple as 
//well but at start or end no spaces expect the last line it shoulf be left aligned 
// so we have firstly added the first word in variable than by running a loop 
// we are taking less words than word limit and also adding the spaces beacuse 1 is 
//mandatory then creating the string there is 2 cases written in code 1 for last 
// and second for the leftone's 


