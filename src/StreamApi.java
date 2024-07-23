import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream().forEach(integer -> {
            System.out.println(integer);
        });

        List<Integer> newList = list.stream().filter(NumberUtils::isEven).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> evenNumbers = list.stream().filter(integer -> integer % 2 ==0).map(NumberUtils::square).collect(Collectors.toList());
        System.out.println(evenNumbers);

        Predicate<Integer> isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(3));
        Optional<List<Integer>> oddNumbers = Optional.ofNullable(list.stream()
                .filter(isOdd)
                .collect(Collectors.toList()));
        oddNumbers.ifPresent(n -> n.forEach(System.out::println));



    }
}

class NumberUtils {
    // Static method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Static method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }
}
