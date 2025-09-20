import java.util.*;

public class Translation441 {
    public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit");
    r.append("={
        \n");
        r.append("tree ");
        r.append(treeId != null ? treeId.getName() : "NOT_SET");
        r.append("\n");
        for (ObjectId p : parentIds) {
            r.append("parent ");
            r.append(p.getName());
            r.append("\n");
        }
        r.append("author ");
        r.append(author != null ? author.toString() : "NOT_SET");
        r.append("\n");
        r.append("committer ");
        r.append(committer != null ? committer.toString() : "NOT_SET");
        r.append("\n");
        if (encoding != null && encoding != Constants.CHARSET) {
            r.append("encoding ");
            r.append(encoding.getName());
            r.append("\n");
        }
        r.append("\n");
        r.append(message != null ? message : "");
        r.append("}
        ");
        return r.toString();
    }
}