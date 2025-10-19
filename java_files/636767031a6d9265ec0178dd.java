import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        try{
            int len = 0;
            String line = null;
            BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
            while ((line = in.readLine()) != null){
                len += line.length();
            }
            return len;
        }catch (NumberFormatException e){
            throw new RuntimeException("content length is not a number: " + e);
        }
    }
}