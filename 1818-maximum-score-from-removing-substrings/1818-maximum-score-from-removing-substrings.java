public class Solution {

    public int maximumGain(String s, int x, int y) {
        int total = 0;
        if (x > y) {
            Result res = removePairs(s, 'a', 'b', x);
            Result res2 = removePairs(res.remaining, 'b', 'a', y);
            total = res.score + res2.score;
        } else {
            Result res = removePairs(s, 'b', 'a', y);
            Result res2 = removePairs(res.remaining, 'a', 'b', x);
            total = res.score + res2.score;
        }
        return total;
    }

    // Helper class to return both remaining string and score
    static class Result {
        String remaining;
        int score;

        Result(String remaining, int score) {
            this.remaining = remaining;
            this.score = score;
        }
    }

    private Result removePairs(String s, char first, char second, int points) {
        StringBuilder stack = new StringBuilder();
        int score = 0;

        for (char ch : s.toCharArray()) {
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == first && ch == second) {
                stack.deleteCharAt(stack.length() - 1); // pop
                score += points;
            } else {
                stack.append(ch); // push
            }
        }

        return new Result(stack.toString(), score);
    }
}
