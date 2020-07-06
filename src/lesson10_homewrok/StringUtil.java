package lesson10_homewrok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringUtil {

    public static String firstLetterToUppperCase(String defaultText) {
        StringBuilder builder = new StringBuilder(defaultText);
        if (Character.isAlphabetic(defaultText.codePointAt(0))){
            builder.setCharAt(0, Character.toUpperCase(defaultText.charAt(0)));
        }
        for (int i = 1; i < defaultText.length(); i++){
            if (Character.isAlphabetic(defaultText.charAt(i)) && Character.isSpaceChar(defaultText.charAt(i - 1))){
                builder.setCharAt(i, Character.toUpperCase(defaultText.charAt(i)));
            }
        }
        return builder.toString();
    }

    public static void numberOfPunctuationMarks (String string) {
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("В данном тексте находится " + count + " знаков препинания" );
    }

    public static void sumOfNumbersInText (String string) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(string);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех целых чисел в данном тексте равна: " + sum);
    }

    public static void letterToCharachterReplacement (String string) {
        int k = 2;
        char symbol = '$';
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : string.split(" ")) {
            if (word.length() >= k) {
                stringBuilder.append(word.substring(0, k - 1)).append(symbol).append(word.substring(k, word.length()));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static void removeText (String string) {
        System.out.println(string.replaceAll("\\([^)]+\\)", ""));
    }

    public static void repetitionOfEachWord (String string) {
        String [] words = string.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = wordsMap.get(word);
                if(count == null) {
                    count = 0;
                }
                wordsMap.put(word, ++count);
            }
        }

        for(String word : wordsMap.keySet()) {
            System.out.println(word + ": " + wordsMap.get(word));
        }
    }

    public static void countOfVowelsAndNotVowels (String string){
        String[] strings = string.split("[.!?]+");

        for (int i = 0; i < strings.length; i++) {
            String vowels = strings[i].replaceAll("(?i:[^aeiouy])", "");
            //cut out only consonants
            String notVowels = strings[i].replaceAll("(?i:[^bcdfjhgklmnpqrstvwxz])", "");

            int vowelsCount = vowels.length();
            int notVowelsCount = notVowels.length();

            if (notVowelsCount > vowelsCount) {
                System.out.println("В предложении " + (i + 1) + " согласных больше, чем гласных");
            } else if (notVowelsCount < notVowelsCount) {
                System.out.println("В предложении " + (i + 1) + " гласных больше, чем согласных");
            } else if (notVowelsCount == notVowelsCount) {
                System.out.println("В предложении " + (i + 1) + " количество гласных и согласных равно");
            }
        }
    }

//    public static void wordsHashSet (String string){
//        String defaultString = "";
//        Pattern pattern = Pattern.compile("([\\w][^.!?]*)\\?");
//        Matcher matcher = pattern.matcher(string);
//        while (matcher.find()) {
//            defaultString = defaultString.concat(matcher.group().replaceAll("[^a-zA-z]", " "));
//        }
//        String[] words = defaultString.split("\\s");
//        HashSet<String> wordsHashSet = new HashSet<>(Arrays.asList(words));
//        for (String s : wordsHashSet) {
//            System.out.println(s);
//        }
//    }


    public static void repeatingWords (String string){
        String defaultString = "";
        Pattern pattern = Pattern.compile("([\\w][^.!?]*)\\?");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            defaultString = defaultString.concat(matcher.group().replaceAll("[^a-zA-z]", " "));
        }
        List<String> words = Arrays.asList(defaultString);
        words.stream()
                .flatMap((s) -> Arrays.asList(s.split("\\s")).stream())
                .filter(s -> s.length() == 4)
                .distinct()
                .forEach(System.out::println);

    }

}


