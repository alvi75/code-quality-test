using System;
using System.Collections.Generic;

public class Translation25
{
    public override void SetParams(string @params){
    base.SetParams(@params);
    language = country = variant = string.Empty;
    StringTokenizer st = new StringTokenizer(@params, ",");
    if (st.MoveNext()){
        language = st.Current;
    }
    st.MoveNext();
    country = st.Current;
}
if (st.MoveNext()){
    variant = st.Current;
}
else{
    throw new Exception("Not enough parameters: " + st.MoveNext());
}
}
}