package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        for (String item : thirdSet) {
            if (!firstSet.contains(item) && !secondSet.contains(item)) {
                set.add(item);
            }
        }
        for (String item : firstSet) {
            if (!set.contains(item) && secondSet.contains(item)) {
                set.add(item);
            }
        }
        for (String item : secondSet) {
            if (!set.contains(item) && firstSet.contains(item)) {
                set.add(item);
            }
        }
        return set;
    }
}
