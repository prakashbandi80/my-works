package workouts;

import lambdas.unit1.PersonOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStreamData {

    public static List<PersonOne> getAllPersons(){

        return Stream.of(
                new PersonOne("Prakash","Bandi","prakash.bandi@gmail.com",42, Arrays.asList("1234","3456")),
                new PersonOne("Prathap Reddy","Bandi","prathap.bandi@gmail.com",39, Arrays.asList("123456","345678")),
                new PersonOne("Sreedevi","nune","devikash.bandi@gmail.com",38, Arrays.asList("23234","333456"))
        ).collect(Collectors.toList());

    }
}
