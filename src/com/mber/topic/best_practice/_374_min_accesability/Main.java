package com.mber.topic.best_practice._374_min_accesability;

//modules developed, tested, optimized, used, understood, and modified in isolation
//this is speedup development
//easier to understand
//easier find bugs and performance issues
//make each class or member as inaccessible as possible
//classes and fields
//package vs protected
//make all private, if need package, if need protected -> public //maybe redesign
//public = forever -> all interfaces is public
/*It is acceptable to make a private member of a public class package-private in order to test it,
  but it is not acceptable to raise the access*/
//Instance fields should never be public //except final and immutable //make static
public class Main {
}

