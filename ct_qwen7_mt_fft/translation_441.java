import java.util.*;

public class Translation441 {
    public String toString() {
    final StringBuilder r = new StringBuilder();
    r.append("Commit");
    r.append("={
        \n");
        r.append("tree ");
        r.append(treeId != null ? treeId.name() : "NOT_SET");
        r.append("\n");
        for(ObjectId p : parentIds)r.append("parent ").append(p.name()).append("\n");
        r.append("author ");
        r.append(author != null ? author.toString() : "NOT_SET");
        r.append("\n");
        r.append("committer ");
        r.append(committer != null ? committer.toString() : "NOT_SET");
        r.append("\n");
        if (encoding != null && !encoding.equals(Constants.CHARSET))r.append("encoding ").append(encoding.getName()).append("\n");
        r.append("\n");
        r.append(message != null ? message.replace('\n', '\n' ) : "");
        r.append("}
        ");
        return r.toString();
    }
}