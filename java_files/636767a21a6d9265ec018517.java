import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.
@throws IOException if there is a problem reading the buffer.
@return the bytes in this buffer.
@see #toByteArray(int)
*/
public final byte[] toByteArray() throws IOException {
return toByteArray(0);
}
/**
* Copy bytes from LinkedBuffer and return.
@param offset The number of bytes to skip at the beginning of the buffer.
@return the bytes in this buffer.
@throws IOException if there is a problem reading the buffer.
@since 1.2
*/ public final byte[] toByteArray(int offset) throws IOException {int len = length - offset;byte[] b = new byte[len];readBytes(b, 0, len);return b;}
/**
* Copy bytes from LinkedBuffer into a newly allocated array.
@return the bytes in this buffer.
@throws IOException if there is a problem reading the buffer.
@since 1.3
*/ public final byte[] toByteArrayNoCopy() throws IOException {return toByteArrayNoCopy(length);}
/**
* Copy bytes from LinkedBuffer into a newly allocated array.
@param size The number of bytes to copy.
@return the bytes in this buffer.
@throws IOException if there is a problem reading the buffer.
@since 1.3
*/ public final byte[] toByteArrayNoCopy(int size) throws IOException {if (size > length)throw new IllegalArgumentException("Size must be less than or equal to the buffer's length");byte[] b = new byte[size];readBytes(b, 0, size);return b;}
/**
* Copy bytes from LinkedBuffer into a newly allocated array.
@param size The number of bytes to copy.
@param offset The number of bytes to skip at the beginning of the buffer.
@return the bytes in this buffer.
@throws IOException if there is a problem reading the buffer.
@since 1.3
*/ public final byte[] toByteArrayNoCopy(int size, int offset) throws IOException {if (offset + size > length)throw new IllegalArgumentException("Offset plus size must be less than or equal to the buffer's length");byte[] b = new byte[size];readBytes(b, offset, size);return b;}
/**
* Copy bytes from LinkedBuffer into a newly allocated array.
@param size The number of bytes to copy.
@param offset The number of bytes to skip at the beginning of the buffer.
@return the bytes in this buffer.
@throws IOException if there is a problem reading the buffer.
@since 1.4
*/ public final byte[] toByteArrayNoCopy(long size, long
}