import java.util.*;

public class Translation755 {
    public boolean equals(Object o) {
    if (!(o instanceof Property)) return false ;
    Property p = (Property ) o ;
    Object pValue = p . getValue ( ) ;
    long pId = p . getId ( ) ;
    if ( id != pId || ( id != 0 && ! TypesAreEqual ( type , p . getType ( ) ) ) ) return false ;
    if ( value == null && pValue == null ) return true ;
    if ( value == null || pValue == null ) return false ;
    Type valueClass = value . getClass ( ) ;
    Type pValueClass = pValue . getClass ( ) ;
    if ( !( valueClass . isAssignableFrom ( pValueClass ) ) && !( pValueClass . isAssignableFrom ( valueClass ) ) ) return false ;
    if ( value instanceof byte [ ] ) return Arrays . equals ( ( byte [ ] ) value , ( byte [ ] ) pValue ) ;
    return value . equals ( pValue ) ;
}
}