using System;
using System.Collections.Generic;

public class Translation978
{
    public override float CurrentScore(int docId, string field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore){
    if (numPayloadsSeen == 0){
        return currentPayloadScore;
    }
    else{
        return Math.Min(currentPayloadScore, currentScore);
    }
}
}