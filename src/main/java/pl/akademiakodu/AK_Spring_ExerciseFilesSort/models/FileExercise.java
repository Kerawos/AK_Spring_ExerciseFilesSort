package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

import java.io.*;


public class FileExercise {
    private final String filePath = "files/FileToTest.txt";
    private File testFile;

    public void createFile(File fileToCreate){
        testFile = new File(filePath);
        if (!testFile.exists()){
            try {
                testFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveIntoFile(File fileToSave, char[] charListToSave){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileToSave);
            for (char c : charListToSave) {
                fileOutputStream.write(c);
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public char[] stringToCharArray(String textToArray){
        char[] result = new char[textToArray.length()];
        for (int i = 0; i < textToArray.length(); i++) {
            result[i] = (char)textToArray.indexOf(i);
        }
        return result;
    }

    public String readFromFile(File fileToRead){
        if (fileToRead.exists()){
            StringBuilder sb = new StringBuilder();
            try {
                FileInputStream fileInputStream = new FileInputStream(fileToRead);
                int content;
                while ((content = fileInputStream.read()) != -1) {
                    // convert to char and display it
                    sb.append((char) content);
                }
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return sb.toString();
        } else {
            return "";
        }
    }



}
