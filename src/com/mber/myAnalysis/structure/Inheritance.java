package com.mber.myAnalysis.structure;

public class Inheritance {}

abstract class AbstractClassExtendsAbstractClass extends AbstractClass {}
abstract class AbstractClassImplementsInterface implements Interface{}

class ClassExtendClass extends Class{
    public ClassExtendClass(short a) {
    }
}
class ClassExtendAbstractClass extends AbstractClass { @Override void methodAbstractVoid() { }}
class ClassImplementsInterface implements Interface{ @Override public void methodAbstractVoid() {}}

interface InterfaceExtendsInterface extends Interface{}

abstract class AbstractClassExtendsAbstractClassImplementsInterface extends AbstractClass implements Interface{ }
abstract class AbstractClassExtendsClassImplementsInterface extends Class implements Interface{ }

class ClassExtendsAbstractClassImplementsInterface extends AbstractClass implements Interface{ @Override public void methodAbstractVoid() { }}
class ClassExtendsClassImplementsInterface extends Class implements Interface{ @Override public void methodAbstractVoid() {}}
