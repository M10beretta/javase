package com.mber.topic.best_practice.husivm._386_parameter_validation;

import java.math.BigInteger;

//validate params in methods and constructors //i.e. int > 0, Object != null //@NonNull - lombok
//document is //use @throw IllegalArgumentException IndexOutOfBoundsException NullPointerException
//big stack trace // hard to find //if we store value, it will occur some time
//wrong exception //fail in middle //silently return wrong result //leave object in some middle state, cause errors in future
//make rollback
//if check we find out error quick and trow appropriate exception
//use asserts in private methods
public class Main {
    public static void main(String[] args) {
        new ValidateParams().doJob(-5, null);
        BigInteger bigInteger = new BigInteger("5");
    }
}

class ValidateParams {

    void doJob(int i, String s) {
        if (i <= 0) throw new ArithmeticException("i= " + i);
        if (s == null) throw new IllegalArgumentException("s is null");
        //some job
        otherMethod(s);
    }

    private void otherMethod(String s) {
        oneMoreMethod(s);
    }

    private void oneMoreMethod(String s) {
        System.out.println(s.length());
    }

    private void method(String s) {
        assert s != null;
    }
}

