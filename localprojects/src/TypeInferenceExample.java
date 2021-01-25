public class TypeInferenceExample {

    public static void main(String[] args) {

        StringLength stringLengthLambda = (String a) -> a.length();

        // if it accepts only one arguement we need to specify the parenthesis
        StringLength stringLengthLambda1 = a -> a.length();

        printLambdas(a ->a.length());

    }

    public static int printLambdas(StringLength st){
       return st.getLength("Prakash");
    }

    interface StringLength{
        int getLength(String name);
    }
}
