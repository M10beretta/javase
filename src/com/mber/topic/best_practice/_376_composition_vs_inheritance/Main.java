package com.mber.topic.best_practice._376_composition_vs_inheritance;

//inheritance is bad //in package is norm or good documented //interface is good
//inheritance violates encapsulation //subclass depends on the implementation details of its superclass
//override and verify all methods problem
//add new method could override in the future and we don't know the contract
//it's wrapper//no performance and memory issues
//inheritance only if a is b //stack is not a vector //Properties-> Hashtable
//inheritance propagates any flaws, while composition lets you design a new API that hides these flaws
public class Main {
}
