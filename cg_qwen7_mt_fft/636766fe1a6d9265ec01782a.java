import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.
 * @param constantPoolEntryIndex index of utf-8 item to be read from cpStartOffsetToFirstConstantPoolEntry
 * @return string value for this Utf8 item or null if no such entry exists
 */
final String readUtf(final int constantPoolEntryIndex,
				     final char[] charBuffer) {
	// Check sanity
	if ((constantPoolEntryIndex > 0) && (constantPoolEntryIndex < cpEntries.length)) {
	    // Return data already present in buffer, if any; else copy it into buffer here.
	    if (cpEntries[constantPoolEntryIndex] != null)
		return cpEntries[constantPoolEntryIndex];
	    else {
		int offset = getConstantPoolStringOffset(constantPoolEntryIndex);
		if (offset == 0) return null;
		else {
		    // Copy UTF8 bytes into temp buffer first...
		    byte[] utf8Bytes = new byte[offset - 2];
		    System.arraycopy(classFileBuffer, offset + 2, utf8Bytes, 0, offset - 2);

		    // ...then convert them to chars, starting at position 1 (index=2), since two bytes were consumed above.
		    try {
			char utf8Chars[] = new char[offset - 1];
			for(int i = 0; i < offset - 1; ++i){
				utf8Chars[i] = (char)(utf8Bytes[i] & 0xff); 
			}
			
			// Store converted chars back into supplied char array provided by user.
			System.arraycopy(utf8Chars, 0, charBuffer, 1, offset - 1);
			cpEntries[constantPoolEntryIndex] = new String(charBuffer, 1, offset - 1);
			return cpEntries[constantPoolEntryIndex];
		    }
		    catch(OutOfMemoryError oom){
		    	System.err.println("ERROR: Couldn't allocate memory for decoding utf8");
		    	System.exit(-1);
		    	return null;
		    }
		    
		}
	    }
	}
	return null;
    }
}