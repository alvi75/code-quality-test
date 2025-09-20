using System;
using System.Collections.Generic;

public class Translation922
{
    public static string Join(ICollection<string> parts, string separator){
    StringBuilder sb = new StringBuilder();
    int i = 0;
    foreach (string part in parts){
        if (part == null){
            throw new System.ArgumentException("part " + i + " is null");
        }
        sb.Append(part);
        if (i < parts.Count - 1){
            sb.Append(separator);
        }
        i++;
    }
    return sb.ToString();
}
}