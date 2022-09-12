package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hSet = new HashSet<>();
        for (Integer item : sourceList) {
            if (item % 2 == 0) {
                int elem = item;
                hSet.add(elem);
                while (elem % 2 != 1 && elem != 0) {
                    hSet.add(elem);
                    elem /= 2;
                }
            } else {
                hSet.add(item);
                hSet.add(item * 2);
            }

        }
        return hSet;
    }
}
