using System;
using System.Collections.Generic;

public class Translation77
{
    public virtual string GetHumanishName(){
    string s = Path;
    if (s.Length == 0){
        s = GetType().FullName;
    }
    int idx = s.LastIndexOf('.');
    if (idx == -1){
        return s;
    }
    string name = s.Substring(idx + 1, s.Length - (idx + 1));
    s = s.Substring(0, idx);
    return $"{
        s}
        .{
            name}
            ";
        }
}