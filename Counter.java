

public class Counter {
    public static int countWordsInString (String word) {

        int wordCount = 0;

        boolean isWord = false;

        int endOfLine = word.length() - 1;

        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {

            // if the char is a letter or number, word = true.
            if ((Character.isLetterOrDigit(characters[i])) && i != endOfLine) {
                isWord = true;

            // if char isn't a letter/digit and there have been letters before,
            // counter goes up.
            } else if ((!Character.isLetterOrDigit(characters[i])) && isWord) {
                wordCount++;
                isWord = false;

            // last word of String; if it doesn't end with a non letter, it wouldn't count without this.
            } else if ((Character.isLetterOrDigit(characters[i])) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }//End method

        public static int countCharsInString (String word) {

            int charCount = 0;

            char[] characters = word.toCharArray();

            //Checks if the character is a letter or number.
            //counter goes up.
            for (int i = 0; i < characters.length; i++) {
                if (Character.isLetterOrDigit(characters[i])) {
                    charCount++;
                }
            }
            return charCount;
        }

} //End Class
