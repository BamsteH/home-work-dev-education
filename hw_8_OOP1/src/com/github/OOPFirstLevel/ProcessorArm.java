package com.github.OOPFirstLevel;

public class ProcessorArm extends Processor {
    public ProcessorArm(double frequency, double cache, double bitCapacity){
        super(frequency,cache,bitCapacity);
    }

    @Override
    String dataProcess(String data) {
        try {
            return (data.toLowerCase());
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    Long dataProcess(Long data) {
        try {
            return data;
        } catch (Exception e) {
            return null;
        }
    }
}