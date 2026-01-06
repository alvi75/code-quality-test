import java.util.*;

public class Translation441 {
    public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit{
        ");
        r.append("tree ");
        r.append(treeId == null ? "NOT_SET" : treeId.name);
        r.append('\n');
        for (ObjectId p : parentIds) {
            r.append("parent ");
            r.append(p.name);
        }
        r.append('\n');
        r.append("author ");
        r.append(author == null ? "NOT_SET" : author.toString());
        r.append('\n');
        r.append("committer ");
        r.append(committer == null ? "NOT_SET" : committer.toString());
        r.append('\n');
        if (encoding != null && encoding != Constants.CHARSET) {
            r.append("encoding ");
            r.append(encoding.name());
            r.append('\n');
        }
        r.append('\n');
        r.append(message != null ? message : "");
        r.append('}
        ');
        return r.toString();
    }
}