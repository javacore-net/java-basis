package javacore.net;

import java.util.ArrayList;

public class JavaArrayList {
    public static void run() {
        // Programming languages
        ArrayList<String> programmingLanguages = new ArrayList<String>();
        String userInput = "java,c#,php,python,ruby,javascript,go,haskell,typescript,kotlin,dart,swift";
        String[] arrayOfStr = userInput.split(",");
        for (String item : arrayOfStr
        ) {
            programmingLanguages.add(item);
        }

        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, StringHelper.toCaptitalize(programmingLanguages.get(i)));
        }
    }
}
