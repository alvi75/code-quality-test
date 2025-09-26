import java.util.*;

public class Translation457 {
    1 public void setDate( DateTime date ) {
    if ( date != null ) {
        this . date = DateTools . dateToString ( date , DateTools . Resolution . SECOND ) ;
    }
    else {
        this . date = null ;
    }
}
}