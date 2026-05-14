import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                    final int byteOffset,
                                    final int byteLength) {
        if (byteArrayValue == null){
            return this.putNull();
        }
        else{
            try {
                // Increases size of internal buffer to accomodate new data.
                growInternalBuffer(byteLength);
                System.arraycopy(byteArrayValue, byteOffset, m_data, m_nextFreeByte, byteLength);
                m_nextFreeByte += byteLength;
                return this;
            } catch (SystemException se) {
                throw new RuntimeException(se.getMessage());
            }
        }
    }
}