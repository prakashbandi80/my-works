import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcersieOne {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //step 1: sort list by lastname

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getLastName().compareTo(t1.getLastName());
            }
        });

        //step 2: Create a method that prints all the elements in the list

        printAll(personList);

        //step 3: Create a method that prints all people that have the last name beginning with C
        printLastNameBeginwithC(personList, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });



    }

    private static void printLastNameBeginwithC(List<Person> personList, Condition condition) {

        for(Person p: personList){
            if(condition.test(p)){
                System.out.println(p);
            }

        }
    }

    private static void printAll(List<Person> personList) {

        for(Person p: personList){
            System.out.println(p);
        }
    }
}

interface Condition{
    boolean test(Person p);
}