package lambdas.unit1;

import java.util.Arrays;
import java.util.List;

public class CollectionsIterationsExample {

    public static void main(String[] args) {

        List<PersonOne> personList = Arrays.asList(
                new PersonOne("Charles", "Dickens", 60),
                new PersonOne("Lewis", "Carroll", 42),
                new PersonOne("Thomas", "Carlyle", 51),
                new PersonOne("Charlotte", "Bronte", 45),
                new PersonOne("Mathew", "Arnold", 39)
        );

        //External iterators - we are controlling or managing the iteration.
        //Sequential operations
        System.out.println("for loop");
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        System.out.println("for each loop");
        for (PersonOne pe : personList) {
            System.out.println(pe);
        }

        //we are giving the control to runtime
        //This executes in run parallel -
        personList.forEach(System.out::println);
    }
}
