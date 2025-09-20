using System;
using System.Collections.Generic;

public class Translation441
{
    public override string ToString(){
    StringBuilder r = new StringBuilder();
    r.Append("Commit");
    r.Append("={
        \n");
        r.Append("tree ");
        r.Append(TreeId.ToString(TreeId));
        r.Append("\n");
        foreach (ObjectId p in ParentIds){
            r.Append("parent ");
            r.Append(p.ToString());
            r.Append("\n");
        }
        r.Append("author ");
        r.Append(Author != null ? Author.ToString() : "NOT_SET");
        r.Append("\n");
        r.Append("committer ");
        r.Append(Committer != null ? Committer.ToString() : "NOT_SET");
        r.Append("\n");
        r.Append("gpgSignature ");
        r.Append(GpgSignature != null ? GpgSignature.ToString() : "NOT_SET");
        r.Append("\n");
        if (Encoding != null && !References.IsSameObject(Encoding, Constants.OBJECT_ID_STRING)){
            r.Append("encoding ");
            r.Append(Encoding);
            r.Append("\n");
        }
        r.Append("\n");
        r.Append(Message != null ? Message : string.Empty);
        r.Append("}
        ");
        return r.ToString();
    }
}