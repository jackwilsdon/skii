package me.jackwilsdon.ecs.util;

import me.jackwilsdon.ecs.core.SubSystem;

import java.util.Comparator;

public class SubSystemComparator implements Comparator<SubSystem> {

    @Override
    public int compare(SubSystem o1, SubSystem o2) {
        int p1 = o1.getPriority();
        int p2 = o2.getPriority();

        if (p1 < p2) {
            return -1;
        } else if (p1 > p2) {
            return 1;
        }

        return 0;
    }
}