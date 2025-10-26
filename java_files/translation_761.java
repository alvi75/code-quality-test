import java.util.*;

public class Translation761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sfh) {
    if (rec instanceof FormulaRecord ) {
        FormulaRecord formulaRec = ( FormulaRecord ) rec ;
        StringRecord cachedText = null ;
        Type nextClass = rs . peekNextClass ( ) ;
        if ( nextClass == STRING_RECORD ) {
            cachedText = ( StringRecord ) rs . getNext ( ) ;
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