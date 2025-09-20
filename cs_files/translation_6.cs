using System;
using System.Collections.Generic;

public class Translation6
{
    public string GetFullMessage(){
    byte[] raw = buffer;
    int msgB = RawParseUtils.TagMessage(raw, 0);
    if (msgB < 0){
        return string.Empty;
    }
    System.Text.Encoding enc = RawParseUtils.ParseEncoding(raw);
    return RawParseUtils.Decode(enc, raw, msgB, raw.Length);
}
}