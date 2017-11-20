package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

import java.util.Comparator;

public class NameComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster a, Monster b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
