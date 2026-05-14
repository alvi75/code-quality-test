import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
	public void write(final byte b[],final int off,final int len)
	throws IOException
	{
		int newcount = count + len;
		if (newcount > buf.length){
			buf = Arrays.copyOf(buf,newcount);
		}
		System.arraycopy(b,off,buf,count,len);
		count = newcount;
	}
}