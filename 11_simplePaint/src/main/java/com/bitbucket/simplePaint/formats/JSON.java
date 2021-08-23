package com.bitbucket.simplePaint.formats;

import com.bitbucket.simplePaint.config.CustomLine;
import com.bitbucket.simplePaint.gui.PaintPanel;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSON {

    private PaintPanel paintPanel;

    public void save(String string) throws IOException {
        if (string != null){
            File file = new File("E:/Deveducation/hw_11_simplePaint/src/main/java/com/bitbucket/simplePaint/data/new.json");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(string);
            fileWriter.close();
        }
    }

    public String toString(List<CustomLine> line) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String str = objectMapper.writeValueAsString(line);
            save(str);
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
