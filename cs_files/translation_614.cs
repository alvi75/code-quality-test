using System;
using System.Collections.Generic;

public class Translation614
{
    public java.nio.CharBuffer decode(java.nio.ByteBuffer buffer){
    try{
        return newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE).decode(buffer);
    }
    catch (java.nio.charset.CharacterCodingException ex){
        throw new java.nio.Error(ex.getMessage(), ex);
    }
}
}