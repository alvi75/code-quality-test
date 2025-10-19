import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
		try{
			String len = getHeaderField("Content-Length");
			if(len!=null){
				return Integer.parseInt(len);
			}
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		return 0;
	}
}