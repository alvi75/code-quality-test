using System;
using System.Collections.Generic;

public class Translation428
{
    public static SpatialStrategy GetSpatialStrategy(int roundNumber){
    lock (typeof(SpatialStrategy)){
        SpatialStrategy result = spatialStrategyCache.Get(roundNumber);
        if (result == null){
            throw new InvalidOperationException("Strategy should have been init'ed by SpatialDocMaker");
        }
        return result;
    }
}
}