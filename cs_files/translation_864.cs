using System;
using System.Collections.Generic;

public class Translation864
{
    public override string ToString(){
    string coll = _collectionModel.Name;
    if (coll != null){
        return string.Format("LM {
            0}
            - {
                1}
                ", GetName(), coll);
            }
            else{
                return string.Format("LM {
                    0}
                    ", GetName());
                }
            }
}