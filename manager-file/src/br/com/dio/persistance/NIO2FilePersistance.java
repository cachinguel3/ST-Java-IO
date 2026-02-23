package br.com.dio.persistance;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NIO2FilePersistance extends FilePersistence{



    public NIO2FilePersistance(final String fileName) throws IOException {
        super(fileName, "/managedFiles/NIO2/");
        var path = Paths.get(currentDir + storedDir);
        if (!Files.exists(path)){
            Files.createDirectories(path);
        }
        clearFile();
    }

    @Override
    public String write(String data) {
        var path = Paths.get(currentDir + storedDir + fileName);
        try{
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
            Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return data;
    }



    @Override
    public String findAll() {
        var path = Paths.get(currentDir + storedDir + fileName);
        var content = "";
        try(var lines = Files.lines(path)){
             content = lines.collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException ex) {
             ex.printStackTrace();
        }
        return content;
    }

    @Override
    public String findBy(String sentence) {
        var content = findAll();
        return Stream.of(content.split(System.lineSeparator()))
                .filter(c -> c.contains(sentence))
                .findFirst()
                .orElse("");
    }
}
