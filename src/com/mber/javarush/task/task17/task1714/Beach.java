package com.mber.javarush.task.task17.task1714;

/*
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;
    private final float distance;
    private final int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized static void main(String[] args) {
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int rating = 0;
        if (o.getDistance() < getDistance()) rating++;
        if (o.getQuality() > getQuality()) rating++;
        return rating;
    }
}
