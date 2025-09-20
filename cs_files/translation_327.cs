using System;
using System.Collections.Generic;

public class Translation327
{
    public sealed override long getLong(){
    int newPosition = _position + libcore.io.SizeOf.LONG;
    if (newPosition > _limit){
        throw new java.nio.BufferUnderflowException();
    }
    long result = libcore.io.Memory.peekLong(backingArray, offset + _position,_order);
    _position = newPosition;
    return result;
}
}