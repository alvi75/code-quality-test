import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    private static String javaCharset(String charset){
		if(charset==null)return null;
		String java=standardToJava.get(charset);
		if(java!=null)return java;
		return charset;
	}
}