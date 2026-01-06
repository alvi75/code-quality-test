import java.util.*;

public class Translation761 {
    public void construct( CellValueRecordInterface rec , RecordStream rs , SharedValueManager sfh ) {
    if ( rec instanceof FormulaRecord ) {
        FormulaRecord formulaRec = ( FormulaRecord ) rec ;
        StringRecord cachedText = null ;
        Type nextClass = rs . peekNextClass ( ) ;
        if ( nextClass == typeof ( StringRecord ) ) {
            cachedText = ( StringRecord ) rs . get ( ) ;
        }
        else {
            cachedText = null ;
        }
        insertCell ( new FormulaRecordAggregate ( formulaRec , cachedText , sfh ) ) ;
    }
    else {
        insertCell ( rec ) ;
    }
}
}