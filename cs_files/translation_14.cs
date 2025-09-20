using System;
using System.Collections.Generic;

public class Translation14
{
    public override bool ready(){
    lock (@lock){
        if (@in == null){
            throw new System.IO.IOException("InputStreamReader is closed");
        }
        try{
            return @in.ready() || @in.available() > 0;
        }
        catch (System.IO.IOException){
            return false;
        }
    }
}
}