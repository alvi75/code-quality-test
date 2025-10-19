import java.util.*;

public class Generated_6367667f1a6d9265ec01745d {
    public static List<PathSegmentImpl> decodePath(URI u,boolean decode){
        String s=u.getRawPath();
        if(s==null || s.length()==0)
            return Collections.emptyList();

        int i=0;
        int j=0;

        //skip leading "/"
        while(i<s.length() && s.charAt(i)=='/'){
            ++i;
        }

        //find end of path segment
        while(j<s.length()){
            char c=s.charAt(j);
            if(c=='/' || c=='#')
                break;
            ++j;
        }
        if(j>=s.length())
            return Collections.emptyList();

        //decode each segment
        ArrayList<PathSegmentImpl> segments=new ArrayList<>(4);

        try{
            for(;i<j;++i){
                PathSegmentImpl pseg=new PathSegmentImpl(u.getScheme());
                pseg.setRawName(s.substring(i,j));
                if(decode){
                    pseg.setName(pseg.getRawName().replace("%2F","/").replace("%3A",":"));
                }else{
                    pseg.setName(pseg.getRawName());
                }
                segments.add(pseg);
            }
        }catch (CharacterCodingException e) {
            throw new IllegalArgumentException(e);
        }

        return segments;
    }
}