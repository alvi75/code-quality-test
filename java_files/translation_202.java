import java.util.*;

public class Translation202 {
    public static final int getNearestSetSize( int maxNumberOfValuesExpected , float desiredSaturation ) {
    for ( int i = 0 ;
    i < _usableBitSetSizes . length ;
    i ++ ) {
        if ( _usableBitSetSizes [ i ] * desiredSaturation >= maxNumberOfValuesExpected ) return _usableBitSetSizes [ i ] ;
    }
    return - 1 ;
}
}