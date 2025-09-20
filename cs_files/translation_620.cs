using System;
using System.Collections.Generic;

public class Translation620
{
    public virtual void Inform(IResourceLoader loader){
    try{
        if (chunkerModelFile != null){
            chunkerOp = OpenNLPOpsFactory.GetChunkerModel(chunkerModelFile, loader);
        }
        else{
            chunkerOp = new OpenNLPChunkerFilter.Chunker(chunkerModel, analyzer);
        }
    }
    catch (IOException e){
        throw new ArgumentException(e.ToString(), e);
    }
}
}