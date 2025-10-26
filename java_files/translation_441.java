import java.util.*;

public class Translation441 {
    public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit\n");
    r.append("tree ").append(treeId == null ? "NOT_SET" : treeId.getName()).append('\n');
    for (ObjectId p : parentIds) {
        r.append("parent ").append(p.getName()).append('\n');
    }
    r.append("author ").append(author == null ? "NOT_SET" : author.toString()).append('\n');
    r.append("committer ").append(committer == null ? "NOT_SET" : committer.toString()).append('\n');
    if (encoding != null && !encoding.equals(Constants.CHARSET)) {
        r.append("encoding ").append(encoding.name()).append('\n');
    }
    r.append("\n").append(message != null ? message : "").append('\n');
    return r.toString();
}
}