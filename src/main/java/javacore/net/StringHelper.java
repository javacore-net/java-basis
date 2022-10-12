package javacore.net;

public class StringHelper {
    public static String toCaptitalize(String str) {
        // convert to char

        // uppercase first char
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
            if (i == 0) {
                newStr = newStr.toUpperCase();
            }
        }
        return newStr;
    }
}
