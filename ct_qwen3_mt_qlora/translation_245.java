import java.util.*;

public class Translation245 {
    1 public boolean equals ( Object o ) {
    if ( this == o ) return true ;
    if ( o == null || getClass ( ) != o . getClass ( ) ) return false ;
    Toffs toffs = ( Toffs ) o ;
    return startOffset == toffs . startOffset && endOffset == toffs . endOffset ;
}
}