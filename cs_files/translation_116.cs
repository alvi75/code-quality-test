using System;
using System.Collections.Generic;

public class Translation116
{
    public override bool Equals(object obj){
    if (this == obj){
        return true;
    }
    if (!base.Equals(obj)){
        return false;
    }
    if (this.GetType() != obj.GetType()){
        return false;
    }
    AutomatonQuery other = (AutomatonQuery)obj;
    if (m_compiled != other.m_compiled){
        return false;
    }
    if (m_term == null){
        if (other.m_term != null){
            return false;
        }
    }
    else if (!m_term.Equals(other.m_term)){
        return false;
    }
    return true;
}
}