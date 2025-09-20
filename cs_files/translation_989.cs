using System;
using System.Collections.Generic;

public class Translation989
{
    public bool Find(int start){
    findPos = start;
    if (findPos < m_regionStart){
        findPos = m_regionStart;
    }
    else{
        if (findPos >= m_regionEnd){
            matchFound = false;
            return false;
        }
    }
    matchFound = FindImpl(address, input, findPos, m_matchOffsets);
    if (matchFound){
        findPos = m_matchOffsets[1];
    }
    return matchFound;
}
}