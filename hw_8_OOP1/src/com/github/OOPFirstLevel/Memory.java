package com.github.OOPFirstLevel;

public class Memory {
    final String[] memoryCell;

    public Memory(String[] memoryCell) {
        this.memoryCell = memoryCell;
    }

    public Memory(int i) {
        memoryCell = new String[i];
    }

    public String readLast() {
        for (int k = memoryCell.length - 1; k >= 0; k--) {
            if (memoryCell[k] != null) {
                return memoryCell[k];
            }
        }
        return null;
    }

    public String removeLast(){
        memoryCell[memoryCell.length-1] = null;
        return "done";
    }

    public boolean save(String input){
        int lastCell = memoryCell.length-1;
        if (memoryCell[lastCell] == null){
            return false;
        } else {
            memoryCell[lastCell] = input;
            return true;
        }
    }

    public String[] getMemoryInfo(){
        String[] outputMemoryInfo = new String[2];
        outputMemoryInfo[0] = ("" + memoryCell.length);
        int countOfNull = 0;
        for (String s : memoryCell) {
            if (s == null) {
                countOfNull++;
            }
        }
        outputMemoryInfo[1] = ("" + countOfNull / memoryCell.length * 100);
        return outputMemoryInfo;
    }
}