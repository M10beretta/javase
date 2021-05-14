package com.mber.patterns.singleton;
/*
Class Holder Singleton

Плюсы:
Ленивая инициализация.
Потокобезопасность.
Высокая производительность в многопоточной среде.

Минусы:
Для корректной работы необходима гарантия,
что объект класса Singleton инициализируется без ошибок.
Иначе первый вызов метода getInstance закончится ошибкой
ExceptionInInitializerError, а все последующие NoClassDefFoundError.

 */
public class ClassHolderSingleton {
    private ClassHolderSingleton(){
    }

    public static class SingletonHolder{
        public static final ClassHolderSingleton HOLDER_INSTANCE = new ClassHolderSingleton();

    }
    public static ClassHolderSingleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }

}
