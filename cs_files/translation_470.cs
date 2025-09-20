using System;
using System.Collections.Generic;

public class Translation470
{
    public virtual IToken RecoverInline(Parser recognizer){
    IParseCanceledException e = new ParseCanceledException(recognizer);
    while (true){
        IParseTree o = recognizer.ParseOne();
        if (o is IErrorNode){
            ((IErrorNode)o).Error = e;
        }
        else if (o is ITerminalNode){
            ((ITerminalNode)o).Context = recognizer.Context;
            ((ITerminalNode)o).Stop = recognizer.RuleContext.Stop;
            ((ITerminalNode)o).Start = recognizer.RuleContext.Start;
        }
        else{
            recognizer.AddChild(o);
        }
        if (recognizer.RuleIndex == -1){
            break;
        }
        if (recognizer.GetRuleIndex() == -1){
            continue;
        }
        int n = recognizer.RuleIndex + 1;
        if (n >= rules.Count){
            n = 0;
        }
        rules[n] = rule;
        recognizer.PushBack(1);
    }
}
}