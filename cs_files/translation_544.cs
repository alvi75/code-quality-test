using System;
using System.Collections.Generic;

public class Translation544
{
    public virtual void Unpop(RevCommit c){
    BlockRevQueue.Block b = head;
    if (b == null){
        b = free.NewBlock();
        b.ResetToMiddle();
        b.Add(c);
        head = b;
        tail = b;
    }
    else{
        if (b.CanUnpop()){
            b.Unpop(c);
            return;
        }
        b = free.NewBlock();
        b.ResetToEnd();
        b.Unpop(c);
        b.next = head;
        head = b;
    }
}
}