package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> navigableSet=new TreeSet<>();
        for(Integer item:sourceList){
            navigableSet.add(item*item);
        }
        return navigableSet.subSet(lowerBound,upperBound+1);
    }
}
