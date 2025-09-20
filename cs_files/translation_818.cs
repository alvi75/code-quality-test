using System;
using System.Collections.Generic;

public class Translation818
{
    public void PreSerialize(){
    if (records.Count >= 0){
        TabIdRecord tbr = (TabIdRecord)records[(records.Count - 1)];
        if (tbr == null){
            tbr = new TabIdRecord();
        }
        else{
            if (tbr.m_id != 0){
                throw new InvalidOperationException("More than one TabIdRecord");
            }
        }
        records.Add(records.Count - 1, tbr);
        records.Remove(records.Count);
    }
}
}