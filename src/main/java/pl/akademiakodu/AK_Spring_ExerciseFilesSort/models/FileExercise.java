package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


public class FileExercise {

    private File testFile;

    public File createNewFile(String filePath){
        testFile = new File(filePath);
        if (!testFile.exists()){
            try {
                testFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return testFile;
    }

    public void clearFile(File fileToClear){
        try {
            Files.newBufferedWriter(fileToClear.toPath(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(File fileToRead) {
        if (fileToRead.exists()) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String s : Files.readAllLines(fileToRead.toPath())) {
                    sb.append(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return sb.toString();
        }
        return "";
    }

    public void saveIntoFile(File fileToSave, String textToSave){
        try {
            Files.write(fileToSave.toPath(), textToSave.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteExistingFile(File file){
        if (file.exists()){
            file.delete();
        }
    }

}
