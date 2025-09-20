using System;
using System.Collections.Generic;

public class Translation178
{
    public override void close(){
    if (isOpen){
        isOpen = false;
        try{
            dump();
        }
        finally{
            try{
                channel.close();
            }
            finally{
                try{
                    channel = null;
                }
                finally{
                    if (out != null){
                        out.close();
                    }
                    out = null;
                }
            }
        }
    }
}
}