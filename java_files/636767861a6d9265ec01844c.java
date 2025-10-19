import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name){
        if (appenderList != null) {
            for (int i = 0; i < appenderList.size(); i++) {
                if (appenderList.get(i).getName().equals(name)) {
                    appenderList.remove(i);
                    return;
                }
            }
        }
    }
}