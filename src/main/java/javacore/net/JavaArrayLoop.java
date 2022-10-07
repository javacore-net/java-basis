package javacore.net;

// Day 2: Java Array & Loops
public class JavaArrayLoop {
    public static void run() {

        // There are 26 letters in English
        char[] englishLetters = new char[26];
        byte letterCount = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            englishLetters[letterCount] = c;
            letterCount++;
        }
        String englishAlphabet = "";
        for (byte i = 0; i < englishLetters.length; i++) {
            englishAlphabet += Character.toString(englishLetters[i]) + " ";
        }
        System.out.printf("%s\n", englishAlphabet.trim());
        System.out.printf("%s\n", englishAlphabet.trim().toUpperCase());

        String[] listOfRepeatedChars = JavaArrayLoop.generateRepeatedCharacters(5);
        for (byte i = 0; i < listOfRepeatedChars.length; i++) {
            System.out.printf("%s ", listOfRepeatedChars[i]);
        }
        System.out.println();

        int[] customerPoints = {10, 3, 6, 3, 8, 2, 5, 8, 3, 7};
        JavaArrayLoop.sortCustomerPoints(customerPoints);
        for (int i = 0; i < customerPoints.length; i++) {
            System.out.printf("%s ", customerPoints[i]);
        }
    }

    static char[] getEnglishAlphabet() {
        // There are 26 letters in English
        char[] englishLetters = new char[26];
        byte letterCount = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            englishLetters[letterCount] = c;
            letterCount++;
        }
        return englishLetters;
    }

    // write a function to generate a list of string like this
    // IF N= 5 THEN output = ["a", "bb", "ccc", "dddd", "eeeee"];
    static String[] generateRepeatedCharacters(int n) {
        String[] result;
        result = new String[n];
        var letters = JavaArrayLoop.getEnglishAlphabet();
        for (int i = 0; i < n; i++) {
            result[i] = Character.toString(letters[i]).repeat(i + 1);
        }
        return result;
    }

    // write a sort function in one dimension number array
    static void sortCustomerPoints(int[] points) {
        // selection sort
        // split your array into 2 parts: left, right
        // left is the sorted parts, right is the unsorted parts
        // the main idea is pick an item from right part and compare it with last item in left parts
        int tmp;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                // we will find the smallest element and put it in the left parts
                if (points[j] < points[i]) {
                    // swap position
                    tmp = points[i];
                    points[i] = points[j];
                    points[j] = tmp;
                }
            }
        }
    }
}
