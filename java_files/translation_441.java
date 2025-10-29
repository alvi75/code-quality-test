import java.util.*;

public class Translation441 {
    01 public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit\n");
    r.append("tree ").append(treeId).append('\n');
    for (ObjectId p : parentIds) {
        r.append("parent ").append(p).append('\n');
    }
    r.append("author ").append(author).append('\n');
    r.append("committer ").append(committer).append('\n');
    if (encoding != null && !encoding.equals(Constants.CHARSET)) {
        r.append("encoding ").append(encoding).append('\n');
    }
    r.append(message).append('\n');
    return r.toString();
}
}