package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

import java.util.Comparator;

public class ScaryComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster a, Monster b) {
        return a.getScary() < b.getScary() ? -1 : a.getScary() == b.getScary() ? 0 : 1;
    }
}
