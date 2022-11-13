package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        for(String string : thirdSet){
            if((!firstSet.contains(string) && !secondSet.contains(string))){
                set.add(string);
            }
        }
        for(String string: firstSet){
            if(secondSet.contains(string) && !thirdSet.contains(string)){
                set.add(string);
            }
        }
        return set;
    }
}
