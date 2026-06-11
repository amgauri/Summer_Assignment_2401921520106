package WEEK2.DAY4;
public class ReverseWordsIII {

    public String reverseWords(String s) {
        StringBuilder answerText = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);

            if (ch == ' ') {
                // word complete hua, ab reverse karke add karo
                answerText.append(currentWord.reverse());
                answerText.append(' ');

                // next word ke liye empty kar do
                currentWord.setLength(0);
            } else {
                currentWord.append(ch);
            }
        }

        // last word ke baad space nahi hota, isliye separately add karna padega
        answerText.append(currentWord.reverse());

        return answerText.toString();
    }

    public static void main(String[] args) {
        ReverseWordsIII task = new ReverseWordsIII();

        String line = "Let's take LeetCode contest";

        System.out.println(task.reverseWords(line));
    }
}

