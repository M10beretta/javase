package com.mber.topic.structure.analysis;

/*public*/ abstract class AbstractClass {

    private int fieldPrivateInt;
    int fieldInt;
    protected int fieldProtectedInt;
    public int fieldPublicInt;
    private static int fieldPrivateStaticInt;
    static int fieldStaticInt;
    protected static int fieldProtectedStaticInt;
    public static int fieldPublicStaticInt;

    private int fieldPrivateIntInit = 0;
    int fieldIntInit = 0;
    protected int fieldProtectedIntInit = 0;
    public int fieldPublicIntInit = 0;
    private static int fieldPrivateStaticIntInit = 0;
    static int fieldStaticIntInit = 0;
    protected static int fieldProtectedStaticIntInit = 0;
    public static int fieldPublicStaticIntInit = 0;
    private final int fieldPrivateFinalIntInit = 0;
    final int fieldFinalIntInit = 0;
    protected final int fieldProtectedFinalIntInit = 0;
    public final int fieldPublicFinalIntInit = 0;
    private static final int fieldPrivateStaticFinalIntInit = 0;
    static final int fieldStaticFinalIntInit = 0;
    protected static final int fieldProtectedStaticFinalIntInit = 0;
    public static final int fieldPublicStaticFinalIntInit = 0;

    {
    }

    static {
    }

    private AbstractClass(byte a) {
    }

    AbstractClass() {
    }

    protected AbstractClass(short a) {
    }

    public AbstractClass(int a) {
    }

    abstract void methodAbstractVoid();

    private void methodPrivateVoid() {
    }

    void methodVoid() {
    }

    protected void methodProtectedVoid() {
    }

    public void methodPublicVoid() {
    }

    private static void methodPrivateStaticVoid() {
    }

    static void methodStaticVoid() {
    }

    protected static void methodProtectedStaticVoid() {
    }

    public static void methodPublicStaticVoid() {
    }

    private final void methodPrivateFinalVoid() {
    }

    final void methodFinalVoid() {
    }

    protected final void methodProtectedFinalVoid() {
    }

    public final void methodPublicFinalVoid() {
    }

    private static final void methodPrivateStaticFinalVoid() {
    }

    static final void methodStaticFinalVoid() {
    }

    protected static final void methodProtectedStaticFinalVoid() {
    }

    public static final void methodPublicStaticFinalVoid() {
    }

    public static void main(String[] args) {
        AbstractClass.methodPrivateStaticVoid();
        AbstractClass.methodStaticVoid();
        AbstractClass.methodProtectedStaticVoid();
        AbstractClass.methodPublicStaticVoid();

        AbstractClass.methodPrivateStaticFinalVoid();
        AbstractClass.methodStaticFinalVoid();
        AbstractClass.methodProtectedStaticFinalVoid();
        AbstractClass.methodPublicStaticFinalVoid();


        AbstractClass local = new AbstractClass() {
            @Override
            void methodAbstractVoid() {
            }

            @Override
            void methodVoid() {
                super.methodVoid();
            }

            @Override
            protected void methodProtectedVoid() {
                super.methodProtectedVoid();
            }

            @Override
            public void methodPublicVoid() {
                super.methodPublicVoid();
            }
        };

        local.methodAbstractVoid();

        local.methodPrivateVoid();
        local.methodVoid();
        local.methodProtectedVoid();
        local.methodPublicVoid();

        local.methodPrivateFinalVoid();
        local.methodFinalVoid();
        local.methodProtectedFinalVoid();
        local.methodPublicFinalVoid();
    }
}


