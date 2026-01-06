import java.util.*;

public class Translation869 {
    public final void write ( int oneByte ) {
    if ( _pos >= _buf . length - 1 ) {
        growBuf ( ) ;
    }
    _buf [ _pos ++ ] = ( byte ) oneByte ;
}
}