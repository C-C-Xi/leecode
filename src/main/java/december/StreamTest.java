package december;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Holli1s", "HollisChuang", "hol22lis", "Hello", "HelloWorld", "Holli2s");
        Stream<String> stream = strings.stream();
        System.out.println("数量："+stream.count());
        stream = strings.stream();
        stream.filter(string->string.endsWith("s")).forEach(System.out::println);
    }
}
