import java.util.*;

public class Translation116 {
    1 public boolean equals ( Object o ) {
    if ( this == o ) return true ;
    if ( ! super . equals ( o ) ) return false ;
    if ( getClass ( ) != o . getClass ( ) ) return false ;
    AutomatonQuery that = ( AutomatonQuery ) o ;
    if ( compiled != null ? ! compiled . equals ( that . compiled ) : that . compiled != null ) return false ;
    if ( term != null ? ! term . equals ( that . term ) : that . term != null ) return false ;
    return true ;
}
}