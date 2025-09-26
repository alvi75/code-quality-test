import java.util.*;

public class Translation726 {
    2019-05-24, updated to use libcore.io.SizeOf.CHAR instead of 2. public CharBuffer put ( char [ ] src , int srcOffset , int charCount ) {
    byteBuffer . limit ( _limit * SizeOf . CHAR ) ;
    byteBuffer . position ( _position * SizeOf . CHAR ) ;
    if ( byteBuffer instanceof ReadWriteDirectByteBuffer ) {
        ( ( ReadWriteDirectByteBuffer ) byteBuffer ) . put ( src , srcOffset , charCount ) ;
    }
    else {
        ( ( ReadWriteHeapByteBuffer ) byteBuffer ) . put ( src , srcOffset , charCount ) ;
    }
    this . _position += charCount ;
    return this ;
}
}