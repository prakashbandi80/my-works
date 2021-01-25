public class RunnableExample {

    public static void main(String[] args) {

        Thread mythread = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread started!");
            }
        });

        mythread.run();

        Thread myThreadLambda = new Thread(()-> System.out.println("Lambda runnable"));

        myThreadLambda.run();
    }
}
