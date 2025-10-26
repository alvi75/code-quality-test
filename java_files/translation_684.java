import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    long max , total , free ;
    try ( final Process proc = Process . current ( ) ) {
        max = proc . getPeakVirtualMemorySize64 ( ) ;
        total = proc . getVirtualMemorySize64 ( ) ;
        free = proc . getPrivateMemorySize64 ( ) ;
    }
    catch ( IOException e ) {
        throw new RuntimeException ( "Failed to determine process memory" , e ) ;
    }
    long totalAvailableBytes = max - total + free ;
    long sortBufferByteSize = free / 2 ;
    if ( sortBufferByteSize < MIN_BUFFER_SIZE_MB * MB || totalAvailableBytes > 10 * MIN_BUFFER_SIZE_MB ) {
        if ( totalAvailableBytes / 2 > MIN_BUFFER_SIZE_MB ) {
            sortBufferByteSize = totalAvailableBytes / 2 ;
        }
        else {
            sortBufferByteSize = Math . max ( ABSOLUTE_MIN_SORT_BUFFER_SIZE , sortBufferByteSize ) ;
        }
    }
    return new BufferSize ( Math . min ( Integer . MAX_VALUE , sortBufferByteSize ) ) ;
}
}