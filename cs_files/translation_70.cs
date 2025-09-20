using System;
using System.Collections.Generic;

public class Translation70
{
    public virtual void remove(){
    if (this.expectedModCount == this.list.modCount){
        if (this.lastLink != null){
            this.link = this.lastLink;
            this.lastLink = this.link;
            this.link = this.previous;
            this.previous.next = this.link;
            this.link = this.previous;
            this.expectedModCount++;
            this.list._size--;
            this.list.modCount++;
        }
    }
    else{
        throw new java.util.ConcurrentModificationException();
    }
}
}
}