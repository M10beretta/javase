package com.mber.topic.best_practice.husivm._384_why_you_need_to_use_Override;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Always use Overrider, except extends abstract classes
public class Main {
    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));

        System.out.println(s.size());

    }
}

abstract class A{
    public abstract void method();
}

class B extends A{

    public void method() {

    }
}



class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bigram bigram = (Bigram) o;
        return first == bigram.first && second == bigram.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}