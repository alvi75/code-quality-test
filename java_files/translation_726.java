ublic override java.nio.CharBuffer put(char[] src, int srcOffset, int charCount){
    byteBuffer.limit(_limit * libcore.io.SizeOf.CHAR);
    byteBuffer.position(_position * libcore.io.SizeOf.CHAR);
    if (byteBuffer instanceof java.nio.ReadWriteDirectByteBuffer){
        ((java.nio.ReadWriteDirectByteBuffer)byteBuffer).put(src, srcOffset, charCount);
    }
    else{
        ((java.nio.ReadWriteHeapByteBuffer)byteBuffer).put(src, srcOffset, charCount);
    }
    this._position += charCount;
    return this;
}