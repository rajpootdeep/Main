package org.immutable;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Set<Integer> set;

    public ImmutableClass(int id, String name, Set<Integer> set){
        this.id=id;
        this.name = name;
//        this.set = set;
        this.set = new HashSet<>(set);// deep copy
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Set<Integer> getSet(){
        return new HashSet<>(set); // deep cloning
//        return set;
    }
}
