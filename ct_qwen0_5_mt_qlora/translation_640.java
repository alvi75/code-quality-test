import java.util.*;

public class Translation640 {
    public LongBuffer get( long[] dst , int dstOffset , int longCount ) {
    byteBuffer . limit (_limit * SizeOf . LONG ) ;
    byteBuffer . position (_position * SizeOf . LONG ) ;
    if ( byteBuffer instanceof DirectByteBuffer ) {
        ((DirectByteBuffer ) byteBuffer ) . get ( dst , dstOffset , longCount ) ;
    }
    else {
        ((HeapByteBuffer ) byteBuffer ) . get ( dst , dstOffset , longCount ) ;
    }
    _position += longCount ;
    return this ;
}
}