using System;
using System.Collections.Generic;

public class Translation785
{
    public Hashtable(int capacity, float loadFactor){
    this.capacity = capacity;
    this.loadFactor = loadFactor;
    if (capacity < java.util.HashMap.MINIMUM_CAPACITY){
        capacity = java.util.HashMap.MINIMUM_CAPACITY;
    }
    else if (capacity > java.util.HashMap.MAXIMUM_CAPACITY){
        capacity = java.util.HashMap.MAXIMUM_CAPACITY;
    }
    else{
        capacity = roundUpToPowerOfTwo(capacity);
    }
    makeTable(capacity);
}
}