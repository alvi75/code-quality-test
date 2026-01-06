import java.util.*;

public class Translation441 {
    public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit").append("={
        \n");
        r.append("tree ").append(getTreeId()).append("\n");
        for (ObjectId p : getParentIds()) {
            r.append("parent ").append(p.getName()).append("\n");
        }
        r.append("author ").append(getAuthor()).append("\n");
        r.append("committer ").append(getCommitter()).append("\n");
        if (getEncoding() != null) {
            r.append("encoding ").append(getEncoding().getName()).append("\n");
        }
        if (getMessage() != null) {
            r.append("message ").append(getMessage()).append("\n");
        }
        r.append("\n");
        r.append("}
        \n");
        return r.toString();
    }
}