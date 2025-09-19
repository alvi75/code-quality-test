import java.util.*;

public class Translation441 {
    ublic String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit");
    r.append("={
        \n");
        r.append("tree ");
        r.append(treeId != null ? treeId.name() : "NOT_SET");
        r.append("\n");
        for (ObjectId p : parentIds) {
            r.append("parent ");
            r.append(p != null ? p.name() : "NOT_SET");
            r.append("\n");
        }
        r.append("author ");
        r.append(author != null ? author.toExternalString() : "NOT_SET");
        r.append("\n");
        r.append("committer ");
        r.append(committer != null ? committer.toExternalString() : "NOT_SET");
        r.append("\n");
        if (encoding != null && encoding != UTF_8)r.append("encoding ");
        r.append(encoding.name());
        r.append("\n");
        r.append("\n");
        r.append(message != null ? message : "");
        r.append("}
        ");
        return r.toString();
    }
}