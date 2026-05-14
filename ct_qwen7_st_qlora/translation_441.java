import java.util.*;

public class Translation441 {
    public String toString() {
    final StringBuilder r = new StringBuilder();
    r.append("Commit");
    r.append("={
        \n");
        r.append("tree ");
        r.append(getTree().name());
        r.append("\n");
        for (AnyObjectId p : parents) {
            r.append("parent ");
            r.append(p.name());
            r.append("\n");
        }
        r.append("author ");
        r.append(authorIdent != null ? authorIdent.toString() : "NOT_SET");
        r.append("\n");
        r.append("committer ");
        r.append(committerIdent != null ? committerIdent.toString() : "NOT_SET");
        r.append("\n");
        if (encoding != null && encoding != UTF_8)r.append("encoding ").append(encoding.getName()).append('\n');
        r.append("\n");
        r.append(message != null ? message : "");
        r.append("}
        ");
        return r.toString();
    }
}