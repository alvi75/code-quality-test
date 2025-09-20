using System;
using System.Collections.Generic;

public class Translation942
{
    public HashMap(int capacity, float loadFactor){
    this.capacity = capacity;
    this.loadFactor = loadFactor;
    if (capacity < 0 || capacity > int.MaxValue){
        throw new System.ArgumentException("Capacity: " + capacity);
    }
    if (float.IsNaN(loadFactor)){
        throw new System.ArgumentException("Load Factor: " + loadFactor);
    }
    if (capacity == 0 && float.IsNaN(loadFactor)){
        java.util.HashMap.HashMapEntry<K, V>[] tab = (java.util.HashMap.HashMapEntry<K, V>[])EMPTY_TABLE;
        table = tab;
        threshold = -1;
        return;
    }
    if (capacity < java.util.HashMap.MINIMUM_CAPACITY){
        capacity = java.util.HashMap.MINIMUM_CAPACITY;
    }
    else{
        if (capacity > java.util.HashMap.MAXIMUM_CAPACITY){
            capacity = java.util.HashMap.MAXIMUM_CAPACITY;
        }
        else{
            capacity = roundUpToPowerOfTwo(capacity);
        }
    }
    makeTable(capacity);
}
}