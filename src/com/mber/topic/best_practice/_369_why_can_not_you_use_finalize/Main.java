package com.mber.topic.best_practice._369_why_can_not_you_use_finalize;

public class Main {
}

//1.1
class MyClass1{
    Resource resource;

    @Override
    protected void finalize() throws Throwable {
        try {
            /*if (resource.isOpen()) logger.log(logger.getLevel(), "...");*/
        } finally {
            super.finalize();   // is commonly called, for protection, but it is better to use an anonymous class
        }
    }
}

//1.2 best
class MyClass2{
    // anonimous
    private final Object finalizerGuardian = new Object(){
        @Override
        protected void finalize() throws Throwable {
            // logic for logging
        }
    };
}


//2 for native methods


class Resource {
}