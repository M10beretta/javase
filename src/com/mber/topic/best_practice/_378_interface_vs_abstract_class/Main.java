package com.mber.topic.best_practice._378_interface_vs_abstract_class;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;

//Existing classes can be easily retrofitted to implement a new interface
//Interfaces are ideal for defining mixin
//With abstract classes we shall use inheritance - it's dangerous
//providing an abstract skeletal implementation //AbstractName
//add new method to abstract class in new release
public class Main {
    public static void main(String[] args) {
        AbstractCollection abstractCollection;
        AbstractSet abstractSet;
        AbstractList abstractList;
        AbstractMap abstractMap;
    }
}


interface Artist{

}

interface Singer{

}
interface ArtistSinger extends Artist, Singer{

}

class MyList extends AbstractList<Integer>{
    final int[] a;

    public MyList(int[] a) {
        this.a = a;
    }

    @Override
    public Integer get(int index) {
        return a[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        int oldVal = a[index];
        a[index] = element;
        return oldVal;
    }

    @Override
    public int size() {
        return a.length;
    }
}