using System;
using System.Collections.Generic;

public class Translation200
{
    public override void Write(byte[] b){
    int len = b.Length;
    CheckPosition(len);
    System.Array.Copy(b, 0, _buf, _writeIndex, len);
    _writeIndex += len;
}
}