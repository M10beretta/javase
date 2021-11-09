package com.mber.topic.structure.analysis.modifiers_in_inheritanc_and_this;

public class Main extends OakFurniture {
    public static void main(String[] args) {
        new Main();                  // сразу появляется this
    }
}

class OakFurniture extends Wood {
    public OakFurniture() {
        super("oak");
    }

    @Override
    public void protectedMethod() {   // может быть только protected и public
        super.protectedMethod();
    }

    @Override
    public void packageMethod() {     // может быть только protected package public
        super.packageMethod();
    }

    @Override
    public void publicMethod() {      // может быть только public
        super.publicMethod();
    }
}

class Wood {
    private String type;

    public Wood(String type) {
        this.type = type;
        System.out.println(this.getClass().getSimpleName());  // вывод: Main
    }

    protected void protectedMethod() {
    }

    void packageMethod() {
    }

    public void publicMethod() {
    }

    private void privateMethod() {     // нельзя переопределить
    }
}


