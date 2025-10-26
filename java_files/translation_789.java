ublic virtual bool lessThan(TextFragment fragA, TextFragment fragB){
    if (fragA.score() == fragB.score())return fragA.fragNum > fragB.fragNum;
    if (fragA.score() < fragB.score) return true;
    else return false;
}