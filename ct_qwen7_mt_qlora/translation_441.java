import java.util.*;

public class Translation441 {
    1 public String toString() {
    2 final StringBuilder r = new StringBuilder();
    3 r.append("Commit");
    4 r.append("={
        \n");
        5 r.append("tree ");
        6 if (treeId == null)7 r.append("NOT_SET");
        8 else9 r.append(treeId.getName());
        10 r.append("\n");
        11 for (final ObjectId p : parentId) {
            12 r.append("parent ");
            13 r.append(p.getName());
            14 r.append("\n");
            15 }
            16 if (author != null)17 r.append(author.toString());
            18 else19 r.append("NOT_SET");
            20 r.append("\n");
            21 if (committer != null)22 r.append(committer.toString());
            23 else24 r.append("NOT_SET");
            25 r.append("\n");
            26 if (encoding != null && !encoding.equals(Constants.CHARSET)) {
                27 r.append("encoding ");
                28 r.append(encoding.name());
                29 r.append("\n");
                30 }
                31 r.append("\n");
                32 if (message != null)33 r.append(message);
                34 else35 r.append("");
                36 r.append("}
                ");
                37 return r.toString();
            }
}