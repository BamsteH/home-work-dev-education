package com.github.OOPFirstLevel;

public class ProcessorX86 extends Processor{
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

