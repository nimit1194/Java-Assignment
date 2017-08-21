import org.junit.Assert;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class IntermediateOperators {

    public Stream<String> filterEx() {
        Stream<String> str1 = Stream.of("java ", "aayush ", "nimit ", "abhi ", "shubham ");
        return str1.filter(x -> x.length() > 5);
    }

    public Stream<String> distinctEx() {
        Stream<String> str2 = Stream.of("java", "aayush", "nimit", "abhi", "shubham", "aayush", "nimit");
        return str2.distinct();
    }

    public Stream<Integer> iterateEx() {
        Stream<Integer> str3 = Stream.iterate(0, n -> n + 2);
        return str3.skip(2).limit(10);
    }

    public Stream<String> flatMapEx() {
        List<String> empty = Collections.emptyList();
        List<String> twoElements = asList("java", "ajax");
        List<String> fourElements = asList("python", "machine learning", "java", "c++");
        Stream<List<String>> allElements = Stream.of(empty, twoElements, fourElements);
        return allElements.flatMap(Collection::stream);
    }

    public Stream<Integer> sortedEx() {

        Stream<Integer> str4 = Stream.of(6, 57, 4, 6, 61, 30, 6, 1, 2);
        return str4.sorted();
    }

    public Stream<Integer> sortedEx2() {
        Stream<Integer> str5 = Stream.of(6, 57, 4, 6, 61, 30, 6, 1, 2);
        return str5.sorted(Comparator.reverseOrder());
    }

    public List<Integer> peekEx() {
        Stream<Integer> numList = Stream.of(10, 11, 12);
        return numList.peek(i -> System.out.print(i * i)).collect(Collectors.toList());
    }
}
