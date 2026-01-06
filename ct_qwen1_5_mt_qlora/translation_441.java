import java.util.*;

public class Translation441 {
    public String toString() {
    StringBuilder r = new StringBuilder();
    r.append("Commit\n");
    r.append("tree ").append(treeId!=null?treeId.getName(): "NOT_SET").append("\n");
    for(ObjectId p : parentIds) {
        r.append("parent ").append(p.getName()).append("\n");
    }
    r.append("author ").append(author!=null?author.toString(): "NOT_SET").append("\n");
    r.append("committer ").append(committer!=null?committer.toString(): "NOT_SET").append("\n");
    if(encoding!=null&&encoding!=Constants.CHARSET) {
        r.append("encoding ").append(encoding.name()).append("\n");
    }
    r.append("\n");
    r.append(message!=null?message:"").append("\n");
    return r.toString();
}
}