package lambdas.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {

        List<PersonOne> personList = Arrays.asList(
                new PersonOne("Charles", "Dickens", 60),
                new PersonOne("Lewis", "Carroll", 42),
                new PersonOne("Thomas", "Carlyle", 51),
                new PersonOne("Charlotte", "Bronte", 45),
                new PersonOne("Mathew", "Arnold", 39)
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
