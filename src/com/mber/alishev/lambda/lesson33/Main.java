package com.mber.alishev.lambda.lesson33;


interface Executable{
    void execute();
}

class Runner{
    public void run(Executable e){

    }
}

//class ExecutableImplementation implements Executable{
//
//}


public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
    }
}
