package com.github.OOPFirstLevel;

public abstract class Processor {
    private double frequency;
    private double cache;
    private double bitCapacity;

    public Processor(double frequency, double cache, double bitCapacity) {
        this.frequency = frequency;
        this.cache = cache;
        this.bitCapacity = bitCapacity;
    }

    public String getDetails(){
        return ("frequency: " + frequency + "cache: " + cache + "bitCapaticy: " + bitCapacity);
    }

    abstract String dataProcess(String data);
    abstract Long dataProcess(Long data);

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void setBitCapacity(double bitCapacity) {
        this.bitCapacity = bitCapacity;
    }

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
