using System;
using System.Collections.Generic;

public class Translation288
{
    public override bool Equals(object @object){
    if (@object == this){
        return true;
    }
    if (@object is java.util.Set){
        java.util.Set<object> s = (java.util.Set<object>)@object;
        try{
            return _size == s.size() && _containsAll(s);
        }
        catch (System.NullReferenceException){
            return false;
        }
        catch (System.ArgumentException){
            return false;
        }
    }
    return false;
}
}