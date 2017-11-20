package pl.akademiakodu.AK_Spring_ExerciseFilesSort.models;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExercise {

    public List<Monster> generateMonsterList(){
        List<Monster> monsterList = Arrays.asList(
                new Monster("Rainbowing Unicorn", 12),
                new Monster("Scary Harry", 3),
                new Monster("Red Butter", 6),
                new Monster("Dark Kitty", 14),
                new Monster("Sleeping Apple", 10)
        );
        return monsterList;
    }

    public String listToString(List<Monster> list){
        StringBuilder sb = new StringBuilder();
        for (Monster monster : list) {
            sb.append(monster.getName());
            sb.append(" = ");
            sb.append(monster.getScary());
            sb.append(" *** ");
        }
        return sb.toString();
    }
}

class NameComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster a, Monster b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}

class ScaryComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster a, Monster b) {
        return a.getScary() < b.getScary() ? -1 : a.getScary() == b.getScary() ? 0 : 1;
    }
}

