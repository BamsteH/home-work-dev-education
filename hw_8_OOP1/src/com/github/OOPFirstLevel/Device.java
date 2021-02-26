package com.github.OOPFirstLevel;

public class Device {
    public Processor processor;
    public Memory memory;

    public void save(String[] data){
        for (String input :data) {
            memory.save(input);
        }
    }

    public String[] readAll(){
        String[] reader = new String[memory.memoryCell.length];
        for (int i = 0; i < memory.memoryCell.length; i++) {
            reader[i] = memory.memoryCell[i];
            memory.memoryCell[i] = null;
        }
        return reader;
    }

    public void dataProcessing(){
    }

    public String getSystemInfo(){
        double cache = processor.getCache();
        double frequency = processor.getFrequency();
        double bitCapacity = processor.getBitCapacity();
        return new String("cache "+ cache + "\nfrequency "+ frequency + "\n bitCapacity" + bitCapacity);
    }
}
