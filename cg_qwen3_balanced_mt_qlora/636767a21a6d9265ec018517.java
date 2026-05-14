import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    /**Copy bytes from LinkedBuffer and return.**/
	public final byte[] toByteArray(){
		int size = 0;
		for (int i = 0; i < _buffers.length; i++){
			size += _buffers[i].length();
		}
		
		byte[] result = new byte[size];
		int offset = 0;
		for (int i = 0; i < _buffers.length; i++){
			System.arraycopy(_buffers[i].get(), 0, result, offset, _buffers[i].length());
			offset += _buffers[i].length();
		}
		
		return result;
	}
}