package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer item : sourceList) {
            if (item % 2 == 0) {
                int elem = item;
                set.add(elem);
                while (elem % 2 != 1 && elem != 0) {
                    set.add(elem);
                    elem /= 2;
                }
            } else {
                set.add(item);
                set.add(item * 2);
            }

        }
        return set;
    }
}
