using System;
using System.Collections.Generic;

public class Translation318
{
    public override long skip(long charCount){
    if (charCount < 0){
        throw new System.ArgumentException("charCount < 0: " + charCount);
    }
    lock (@lock){
        checkNotClosed();
        if (charCount == 0){
            return 0;
        }
        long inSkipped;
        int availableFromBuffer = buf.Length - pos;
        if (availableFromBuffer > 0){
            long requiredFromIn = charCount - availableFromBuffer;
            if (requiredFromIn <= 0){
                pos += charCount;
                return charCount;
            }
            pos += availableFromBuffer;
            inSkipped = @in.skip(requiredFromIn);
        }
        else{
            inSkipped = @in.skip(charCount);
        }
        return inSkipped + availableFromBuffer;
    }
}
}