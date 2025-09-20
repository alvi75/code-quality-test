using System;
using System.Collections.Generic;

public class Translation448
{
    public override java.nio.CharBuffer asReadOnlyBuffer(){
    java.nio.CharToByteBufferAdapter buf = new java.nio.CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer());
    buf._limit = _limit;
    buf._position = _position;
    buf._mark = _mark;
    buf.byteBuffer._order = byteBuffer._order;
    return buf;
}
}