import java.util.*;

public class Translation441 {
    public String toString() {
    final StringBuilder r = new StringBuilder();
    r.append("Commit");
    r.append("{
        \n");
        r.append("tree ");
        r.append(getTreeId() != null ? getTreeId().getName() : "NOT_SET");
        r.append("\n");
        for (ObjectId p : getParentIds()) {
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
        if (encoding != null && !Objects.equals(encoding,Constants.CHARSET)) {
            r.append("encoding ");
            r.append(encoding.name());
            r.append("\n");
        }
        r.append("\n");
        r.append(message != null ? message : "");
        r.append("}
        ");
        return r.toString();
    }
}