package com.mber.topic.structure.analysis;

public class Internal {
    abstract class AbstractClassInner {
        abstract class AbstractClassInner1 {}
        class ClassInner {}
    }
    abstract static class AbstractStaticClassNested {
        abstract class AbstractClassInner {}
        abstract static class AbstractStaticClassNested1 {}
        class ClassInner {}
        static class ClassStaticNested {}
        interface Interface {}
    }
    class ClassInner {
        abstract class AbstractClassInner {}
        class ClassInner1 {}
    }
    static class ClassStaticNested {
        abstract class AbstractClassInner {}
        abstract static class AbstractStaticClassNested {}
        class ClassInner {}
        static class ClassStaticNested1 {}
        interface Interface {}
    }
    interface Interface {
        abstract class AbstractClassInner {}
        abstract static class AbstractStaticClassNested {}
        class ClassInner {}
        static class ClassStaticNested {}
        interface Interface1 {}
    }

    public static void main(String[] args) {
    }
}
