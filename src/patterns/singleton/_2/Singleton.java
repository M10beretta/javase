package patterns.singleton._2;
/*
Ленивая инициализация. Безопасность потоков. Высокая производительность в многопоточной среде.
Для корректной работы необходимо убедиться, что объект-синглтон инициализируется без ошибок.
 */
public class Singleton {
    private Singleton() {
    }

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
