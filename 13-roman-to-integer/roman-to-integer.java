class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;

        boolean flag = true;

        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char next = s.charAt(i + 1);

            int nextNumber = hm.get(next);
            int num = hm.get(ch);

            if (nextNumber > num) {
                sum += nextNumber - num;

                if (i + 1 == s.length() - 1) {
                    flag = false;
                }
                i++;
            } else {
                sum += num;
            }
        }

        if (flag) {
            sum += hm.get(s.charAt(s.length() - 1));
        }

        return sum;

    }
}