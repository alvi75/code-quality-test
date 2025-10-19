import java.util.*;

public class Generated_636767dd1a6d9265ec0186f3 {
    public void overrideName(String oldName,String newName){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getValue().equals(oldName)){
                this.set(i, new Column(newName));
            }
        }
    }
}