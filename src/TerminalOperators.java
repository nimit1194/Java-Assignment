
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperators {

    public Long countEX() {
        Stream<String> s = Stream.of("java", "scala", "clojure");
        return s.count();
    }
    public Optional<String> minEX() {
        Stream<String> s1 = Stream.of("java", "scala", "clojure");
        return s1.min(Comparator.comparingInt(String::length));
    }

    public Optional<String> maxEX() {
        Stream<String> s1 = Stream.of("java", "scala", "clojure");
        return s1.max(Comparator.comparingInt(String::length));
    }

    public Optional<Integer> findAnyEX() {

        Stream<Integer> infiniteNumbers = Stream.iterate(1, n -> n + 2);
        return infiniteNumbers.findAny();
    }

    public Boolean allMtachEX() {
        Stream<Integer> age = Stream.of(23, 56, 24, 17, 33);
        return age.allMatch(a -> a > 18);
    }

    public Boolean anyMatchEX() {
        Stream<String> numbers = Stream.of("two", "three", "five", "six", "aa_aa_aa_aa");
        return numbers.anyMatch(s -> s.length() > 8);
    }

    public Boolean noMatchEX() {
        Stream<Integer> ageAgain = Stream.of(23, 48, 29, 34, 67);
        return ageAgain.noneMatch(p -> p < 18);
    }
    public Integer reduceEx() {
        Stream<Integer> num1 = Stream.of(1, 2, 3, 3, 4, 5);
        return num1.reduce(2, (x, y) -> (x * y));
    }
    public Set<String> collectEx() {
        Stream<String> stringList = Stream.of("me", "one", "me", "one");
        return stringList.collect(Collectors.toSet());
    }
    public Boolean containsEX() {
        Stream<String> cookies = Stream.of("Hi Cookies", "bannana Cookies",
                "Mango Cookies");
        return cookies.allMatch(p -> p.contains("Cookies"));
    }
}

