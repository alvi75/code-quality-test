using System;
using System.Collections.Generic;

public class Translation579
{
    public virtual bool Handles(string commandLine){
    return command.Length + 1 < commandLine.Length && commandLine.StartsWith(command, StringComparison.Ordinal) && !commandLine.Equals(command, StringComparison.Ordinal);
}
}