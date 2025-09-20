using System;
using System.Collections.Generic;

public class Translation21
{
    public override void ReadBytes(byte[] b, int offset, int len, bool useBuffer){
    int available = bufferLength - bufferPosition;
    if (len <= available){
        if (len > 0){
            Array.Copy(buffer, bufferPosition, b, offset, len);
        }
        bufferPosition += len;
    }
    else{
        if (available > 0){
            Array.Copy(buffer, bufferPosition, b, offset, available);
            bufferPosition += available;
            len -= available;
            bufferStart += available;
        }
        if (useBuffer && len < bufferSize){
            Refill();
            if (bufferLength < len){
                Array.Copy(buffer, 0, b, offset, bufferLength);
                throw new EndOfStreamException(this);
            }
            else{
                Array.Copy(buffer, 0, b, offset, len);
                bufferPosition = len;
            }
        }
        else{
            long after = bufferStart + bufferPosition + len;
            if (after > length){
                throw new EndOfStreamException(this);
            }
            ReadBytes(b, offset, len, true);
            bufferStart = after;
            bufferPosition = 0;
            bufferLength = 0;
        }
    }
}
}