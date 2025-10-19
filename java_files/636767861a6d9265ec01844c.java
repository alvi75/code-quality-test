import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name){
        for (int i = 0; i < this.appenderList.size(); i++) {
            if(this.appenderList.get(i).getName().equals(name)){
                this.appenderList.remove(i);
                break;
            }
        }
    }
}