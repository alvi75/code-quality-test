using System;
using System.Collections.Generic;

public class Translation563
{
    public static Format ById(int id){
    foreach (Format format in _formats){
        if (format.Id == id){
            return format;
        }
    }
    throw new ArgumentException("Unknown format id: " + id);
}
}