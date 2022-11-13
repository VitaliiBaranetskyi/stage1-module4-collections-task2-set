package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer elem : sourceList){
            if(elem % 2 == 0){
                while (elem % 2 == 0){
                    hashSet.add(elem);
                    elem /= 2;
                }
                hashSet.add(elem);
            } else {
                hashSet.add(elem);
                hashSet.add(2*elem);
            }
        }
        return hashSet;
    }
}
