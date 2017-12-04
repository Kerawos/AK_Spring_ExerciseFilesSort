package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

/**
 * Import section
 */
import java.util.Comparator;

/**
 * Responsible for monster comparations by scary
 */
public class ScaryComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster a, Monster b) {
        return a.getScary() < b.getScary() ? -1 : a.getScary() == b.getScary() ? 0 : 1;
    }
}
