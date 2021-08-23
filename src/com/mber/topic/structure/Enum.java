package com.mber.topic.structure;

public enum Enum {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,
    ONE(1), TWO(2);


    private                int fieldPrivateInt;
                           int fieldInt;
    protected              int fieldProtectedInt;
    public                 int fieldPublicInt;
    private   static       int fieldPrivateStaticInt;
              static       int fieldStaticInt;
    protected static       int fieldProtectedStaticInt;
    public    static       int fieldPublicStaticInt;

    private                int fieldPrivateIntInit = 0;
                           int fieldIntInit = 0;
    protected              int fieldProtectedIntInit = 0;
    public                 int fieldPublicIntInit = 0;
    private   static       int fieldPrivateStaticIntInit = 0;
              static       int fieldStaticIntInit = 0;
    protected static       int fieldProtectedStaticIntInit = 0;
    public    static       int fieldPublicStaticIntInit = 0;
    private          final int fieldPrivateFinalIntInit = 0;
                     final int fieldFinalIntInit = 0;
    protected        final int fieldProtectedFinalIntInit = 0;
    public           final int fieldPublicFinalIntInit = 0;
    private   static final int fieldPrivateStaticFinalIntInit = 0;
              static final int fieldStaticFinalIntInit = 0;
    protected static final int fieldProtectedStaticFinalIntInit = 0;
    public    static final int fieldPublicStaticFinalIntInit = 0;

           {}
    static {}

    private   Enum(int a) {}
              Enum() {}


    private                void methodPrivateVoid(){}
                           void methodVoid(){}
    protected              void methodProtectedVoid(){}
    public                 void methodPublicVoid(){}
    private   static       void methodPrivateStaticVoid(){}
              static       void methodStaticVoid(){}
    protected static       void methodProtectedStaticVoid(){}
    public    static       void methodPublicStaticVoid(){}
    private          final void methodPrivateFinalVoid(){}
                     final void methodFinalVoid(){}
    protected        final void methodProtectedFinalVoid(){}
    public           final void methodPublicFinalVoid(){}
    private   static final void methodPrivateStaticFinalVoid(){}
              static final void methodStaticFinalVoid(){}
    protected static final void methodProtectedStaticFinalVoid(){}
    public    static final void methodPublicStaticFinalVoid(){}


    public static void main(String[] args) {
        methodPrivateStaticVoid();
        methodStaticVoid();
        methodProtectedStaticVoid();
        methodPublicStaticVoid();
        methodPrivateStaticFinalVoid();
        methodStaticFinalVoid();
        methodProtectedStaticFinalVoid();
        methodPublicStaticFinalVoid();

        Enum[] values = Enum.values();
    }
}
