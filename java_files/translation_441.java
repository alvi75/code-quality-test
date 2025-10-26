import java.util.*;

public class Translation441 {
    ublic override String ToString(){
    StringBuilder r = new StringBuilder();
    r.Append("Commit");
    r.Append("={
        \n");
        r.Append("tree ");
        r.Append(treeId != null ? treeId.getName() : "NOT_SET");
        r.Append("\n");
        foreach (ObjectId p in parentIds){
            r.Append("parent ");
            r.Append(p.Name);
            r.Append("\n");
        }
        r.Append("author ");
        r.Append(author != null ? author.ToString() : "NOT_SET");
        r.Append("\n");
        r.Append("committer ");
        r.Append(committer != null ? committer.ToString() : "NOT_SET");
        r.Append("\n");
        if (encoding != null && encoding != Constants.CHARSET){
            r.Append("encoding ");
            r.Append(encoding.getName());
            r.Append("\n");
        }
        r.Append("\n");
        r.Append(message != null ? message : "");
        r.Append("}
        ");
        return r.ToString();
    }
}