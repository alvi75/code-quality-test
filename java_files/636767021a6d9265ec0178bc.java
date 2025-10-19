import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    public static int indexOf(String str,String searchStr)
	{
		int i=0;
		for(i=str.length();i>0;i--)
			if(str.charAt(i-1)==searchStr.charAt(0))
				return i-1;
		return -1;
	}
}