import java.util.*;

public class Translation21 {
    ublic override sealed void ReadBytes(byte[] b, int offset, int len, bool useBuffer){
    int available = bufferLength - bufferPosition;
    if (len <= available){
        if (len > 0){
            Buffer.BlockCopy(m_buffer, bufferPosition, b, offset, len);
        }
        bufferPosition += len;
    }
    else{
        if (available > 0){
            Buffer.BlockCopy(m_buffer, bufferPosition, b, offset, available);
            offset += available;
            len -= available;
            bufferPosition += available;
        }
        if (useBuffer && len < bufferSize){
            Refill();
            if (bufferLength < len){
                Buffer.BlockCopy(m_buffer, 0, b, offset, bufferLength);
                throw new EndOfStreamException("read past EOF: " + this);
            }
            else{
                Buffer.BlockCopy(m_buffer, 0, b, offset, len);
                bufferPosition = len;
            }
        }
        else{
            long after = bufferStart + bufferPosition + len;
            if (after > Length){
                throw new EndOfStreamException("read past EOF: " + this);
            }
            ReadInternal(b, offset, len);
            bufferStart = after;
            bufferPosition = 0;
            bufferLength = 0;
        }
    }
}
}