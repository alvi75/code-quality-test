using System;
using System.Collections.Generic;

public class Translation587
{
    public static void Main(string[] args){
    bool printTree = false;
    string path = null;
    for (int i = 0;
    i < args.Length;
    i++){
        if (args[i].Equals("-printTree", StringComparison.Ordinal)){
            printTree = true;
        }
        else{
            path = args[i];
        }
    }
    if (args.Length != (printTree ? 2 : 1)){
        throw new ArgumentException();
    }
    Directory dir = FSDirectory.Open(new DirectoryInfo(path));
    ITaxonomyReader r = new DirectoryTaxonomyReader(dir);
    PrintStats(r, Console.Out, printTree);
    r.Dispose();
    dir.Dispose();
}
}