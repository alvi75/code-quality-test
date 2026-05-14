import java.util.*;

public class Generated_636767861a6d9265ec01844c {
    public void removeAppender(String name) {
        if(name == null){
            return;
        }
        for (Iterator<Appender> it = appenderList.iterator(); it.hasNext();) {
            if (name.equals(it.next().getName())) {
                it.remove();
                break;
            }
        }
    }
}