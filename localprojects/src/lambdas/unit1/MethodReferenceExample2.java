package lambdas.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {

        List<PersonOne> personList = Arrays.asList(
                new PersonOne("Charles", "Dickens", "charles.dick@gmail.com",39,Arrays.asList("2345")),
                new PersonOne("Lewis", "Carroll", "charles.dick@gmail.com",39,Arrays.asList("2345")),
                new PersonOne("Thomas", "Carlyle", "charles.dick@gmail.com",39,Arrays.asList("2345")),
                new PersonOne("Charlotte", "Bronte", "charles.dick@gmail.com",39,Arrays.asList("2345")),
                new PersonOne("Mathew", "Arnold", "charles.dick@gmail.com",39,Arrays.asList("2345"))
        );


        printLastNameBeginwithC(personList,p ->true, p -> System.out.println(p));
        printLastNameBeginwithC(personList,p ->true, System.out::println);


    }

    private static void printLastNameBeginwithC(List<PersonOne> personList, Predicate<PersonOne> predicate, Consumer<PersonOne> consumer) {
        for(PersonOne p: personList){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
