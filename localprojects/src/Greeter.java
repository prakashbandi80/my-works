public class Greeter {

    public void greet(Greeting greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorld = new HelloWorldGreeting();
        MyLambda myLambdaFunction = () -> System.out.printf("HelloWorld from Lambda");

        myLambdaFunction.foo();
        helloWorld.greet();

    }
}

interface MyLambda {
    void foo();
}