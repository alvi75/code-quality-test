import java.util.*;

public class Translation175 {
    public void copyRawTo(final byte[] b, int o) {
    LittleEndian.putInt( b, o, w1 );
    LittleEndian.putInt( b, o+4, w2 );
    LittleEndian.putInt( b, o+8, w3 );
    LittleEndian.putInt( b, o+12, w4 );
    LittleEndian.putInt( b, o+16, w5 );
}
}