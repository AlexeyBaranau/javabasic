package lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> listForStreams = Arrays.asList("hello world", "java", "Republic of Belarus", "a3");

        listForStreams.stream()
                    .map(s -> {return s.toUpperCase();})
                            .filter(s -> s.length() > 10)
                                .forEach(System.out::println);

    }
}
