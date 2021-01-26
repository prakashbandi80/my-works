import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaOneFunctions {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //step 1: sort list by lastname

        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //step 2: Create a method that prints all the elements in the list
        System.out.println("Printing from the step 1");
        printLastNameBeginwithC(personList,p ->true, p -> System.out.println(p));

        //step 3: Create a method that prints all people that have the last name beginning with C
        System.out.println("Printing from the step 1");
        printLastNameBeginwithC(personList, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
    }

    private static void printLastNameBeginwithC(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: personList){
            if(predicate.test(p)){
                consumer.accept(p);
            }
         }
    }
}
