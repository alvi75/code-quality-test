using System;
using System.Collections.Generic;

public class Translation526
{
    public static java.nio.FloatBuffer allocate(int capacity_1){
    if (capacity_1 < 0){
        throw new System.ArgumentException();
    }
    return new java.nio.ReadWriteFloatArrayBuffer(capacity_1);
}
}