package com.github.OOPFirstLevel;

public class ProcessorX86 extends Processor{

    public ProcessorX86(double frequency, double cache, double bitCapacity){
        super(frequency, cache, bitCapacity);
    }

    @Override
    String dataProcess(String data) {
        try {
            return (data.toUpperCase());
        } catch (Exception e){
            return null;
        }
    }

    @Override
    Long dataProcess(Long data) {
        try {
            return data;
        } catch (Exception e){
            return null;
        }
    }
}

