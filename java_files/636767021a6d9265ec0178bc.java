import java.util.*;

public class Generated_636767021a6d9265ec0178bc {
    public static int indexOf(String str,String searchStr)
    {
        if(searchStr.length() == 0) return 0;
        
        char[] chArray = str.toCharArray();
        char[] toSearchArray = searchStr.toCharArray();
        
        for(int i=0;i<chArray.length - searchStr.length()+1;i++)
        {
            boolean found=true;
            
            for(int j=0;j<toSearchArray.length;j++)
            {
                if(chArray[i+j] != toSearchArray[j])
                {
                    found=false;
                    break;
                }
            }
            
            if(found) return i;
        }
        
        return -1;
    }
}