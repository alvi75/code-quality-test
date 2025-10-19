import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
    public boolean hasNext(){
        if(!marked.isEmpty()){
            for(int i = 0; i < marked.size(); i++){
                if(marked.get(i) == null){
                    return true;
                }
            }
            return false;
        }else{
            return true;
        }
    }
}