package com.mber.topic.pattern.singleton.class_holder_singleton;
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
public class MySingleton {
    private MySingleton(){
    }

    public static class SingletonHolder{
        public static final MySingleton HOLDER_INSTANCE = new MySingleton();

    }
    public static MySingleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }

}
