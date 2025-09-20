using System;
using System.Collections.Generic;

public class Translation937
{
    public DirectoryReader GetIndexReader(){
    lock (this){
        if (indexReader != null){
            indexReader.IncRef();
        }
        return indexReader;
    }
}
}