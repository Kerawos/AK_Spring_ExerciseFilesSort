package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

/**
 * Import section
 */
import java.util.Comparator;

/**
 * Responsible for monster comparations by name
 */
public class NameComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster a, Monster b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
