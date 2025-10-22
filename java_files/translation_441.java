import java.util.*;

public class Translation441 {
    ublic String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit{
        ");
        r.append("tree ").append(treeId != null ? treeId.getName() : "NOT_SET");
        r.append("\n");
        for (ObjectId p : parentIds) {
            r.append("parent ").append(p.getName());
            r.append("\n");
        }
        r.append("author ").append(author != null ? author.toString() : "NOT_SET");
        r.append("\n");
        r.append("committer ").append(committer != null ? committer.toString() : "NOT_SET");
        r.append("\n");
        if (encoding != null && !encoding.equals(Constants.CHARSET)) {
            r.append("encoding ").append(encoding.getName());
            r.append("\n");
        }
        r.append(message != null ? message : "");
        r.append("}
        ");
        return r.toString();
    }
}