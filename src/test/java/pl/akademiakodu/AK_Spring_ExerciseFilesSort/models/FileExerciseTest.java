package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileExerciseTest {
    private static FileExercise fileExercise;

    @BeforeClass
    public static void start() {
        fileExercise = new FileExercise();
    }

    @AfterClass
    public static void stop() throws Exception {
        fileExercise = null;
    }

    @Test
    public void testInOut() throws Exception {
        File file = new File("files"+ File.separator +"FileToTest.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        fileExercise.createFile(file);
        fileExercise.saveIntoFile(file, fileExercise.stringToCharArray("dupa jasia"));
        assertEquals(fileExercise.readFromFile(file), "dupa jasia");
        if (file.exists()){
            file.delete();
        }
    }
}