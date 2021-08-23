package com.mber.topic.structure;

/*public*/interface Interface {
                           int fieldIntInit = 0;
    public                 int fieldPublicIntInit = 0;
              static       int fieldStaticIntInit = 0;
    public    static       int fieldPublicStaticIntInit = 0;
                     final int fieldFinalIntInit = 0;
    public           final int fieldPublicFinalIntInit = 0;
              static final int fieldStaticFinalIntInit = 0;
    public    static final int fieldPublicStaticFinalIntInit = 0;

    abstract               void methodAbstractVoid();

    private                void methodPrivateVoid(){}
    private   static       void methodPrivateStaticVoid(){}
              static       void methodStaticVoid(){}
    public    static       void methodPublicStaticVoid(){}

           default void methodDefaultVoid(){}
    public default void methodPublicDefaultVoid(){}

    public static void main(String[] args) {
        ((Interface) () -> {}).methodAbstractVoid();

        ((Interface) () -> {}).methodPrivateVoid();
        methodPrivateStaticVoid();
        methodStaticVoid();
        methodPublicStaticVoid();

        ((Interface) () -> {}).methodDefaultVoid();
        ((Interface) () -> {}).methodPublicDefaultVoid();
    }
}
