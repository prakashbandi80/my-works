package lambdas.unit1;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<PersonOne> personList = Arrays.asList(
                new PersonOne("Charles", "Dickens", 60),
                new PersonOne("Lewis", "Carroll", 42),
                new PersonOne("Thomas", "Carlyle", 51),
                new PersonOne("Charlotte", "Bronte", 45),
                new PersonOne("Mathew", "Arnold", 39)
        );

        //source is the first elements in the stream
        //second is the perform operation
        //third is the terminal operation - the end condition

        //Lambda expression enables the parallel processing
        personList.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        Long count = personList.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();

        System.out.println(count);
    }
}
