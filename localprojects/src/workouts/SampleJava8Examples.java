package workouts;

import lambdas.unit1.PersonOne;

import java.util.List;
import java.util.stream.Collectors;

public class SampleJava8Examples {

    public static void main(String[] args) {

        List<PersonOne> personOneList = SampleStreamData.getAllPersons();

        List<String> emailIds = personOneList.stream()
                .map(personOne -> personOne.getEmailId())
                .collect(Collectors.toList());

        List<List<String>> phonenumbers = personOneList.stream()
                .map(personOne -> personOne.getPhoneNumbers())
                .collect(Collectors.toList());

        //flatmap is used both map and data flattering.
        List<String> phoneNumber = personOneList.stream()
                .flatMap(personOne -> personOne.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        int averageAge = personOneList.stream()
                .mapToInt(personOne -> personOne.getAge())
                .reduce(0, Integer::sum);

        /*
            Consumer Interface - it passes in parameters and then output the values with out returning it.
            accept(T t);

            Supplier Interface - is a supply interface and it can be used to store data and then be used by other methods.

            Predicate Interface - its a judgment interface similar to boolean type
         */

        //Function Interface which used to convert the data and apply method to the conversion.


        System.out.println(emailIds);
        System.out.println(phonenumbers);
        System.out.println(averageAge);
    }
}
