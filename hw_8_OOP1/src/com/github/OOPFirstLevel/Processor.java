package com.github.OOPFirstLevel;

public abstract class Processor {
    private double frequency;
    private double cache;
    private double bitCapacity;


    public String getDetails(){
        return ("frequency: " + frequency + "cache: " + cache + "bitCapaticy: " + bitCapacity);
    }

    abstract String dataProcess(String data);
    abstract Long dataProcess(Long data);

    public double getFrequency() {
        return frequency;
    }

    public double getCache() {
        return cache;
    }

    public double getBitCapacity() {
        return bitCapacity;
    }
}
