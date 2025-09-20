using System;
using System.Collections.Generic;

public class Translation650
{
    public virtual string GetFully(string key){
    StringBuilder result = new StringBuilder(m_tries.Count * 2);
    for (int i = 0;
    i < m_tries.Count;
    i++){
        string r = m_tries[i].GetFully(key);
        if (r == null || (r.Length == 1 && r[0] == EOM)){
            return result.ToString();
        }
        result.Append(r);
    }
    return result.ToString();
}
}