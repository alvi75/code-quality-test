import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
        int idx = -1;
        for (int i=0; i<names.length; i++){
            if (names[i].equals(oldName)){
                idx=i;
                break;
            }
        }

        //if found, change it.
        if (idx>=0){
            names[idx]=newName;
        }else{
            throw new IllegalArgumentException("Old name not found");
        }
    }
}