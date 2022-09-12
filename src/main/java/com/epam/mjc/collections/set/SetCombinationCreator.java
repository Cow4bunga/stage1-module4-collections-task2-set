package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> hSet = new HashSet<>(firstSet);
        Set<String> temporarySet=new HashSet<>(thirdSet);
        hSet.retainAll(secondSet);
        hSet.removeAll(thirdSet);
        temporarySet.removeAll(firstSet);
        temporarySet.removeAll(secondSet);
        hSet.addAll(temporarySet);
        return hSet;
    }
}
