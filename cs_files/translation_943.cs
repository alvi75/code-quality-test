using System;
using System.Collections.Generic;

public class Translation943
{
    public virtual void Run(){
    long lastReopenStartNS = Time.NanoTime();
    while (!Finish){
        while (!Finish){
            reopenLock.Lock();
            try{
                bool hasWaiting = waitingGen > searchingGen;
                long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
                long sleepMS = nextReopenStartNS - Time.NanoTime();
                if (sleepMS > 0){
                    Thread.Sleep((int)sleepMS);
                }
                else{
                    break;
                }
            }
            catch (ThreadInterruptedException){
                Thread.Interrupt();
                return;
            }
            finally{
                reopenLock.Unlock();
            }
        }
        if (Finish){
            return;
        }
        lastReopenStartNS = Time.NanoTime();
        var timeout = new WaitForSeconds(timeoutInMilliseconds);
        while (!Finish){
            if (timeout.IsExpired()){
                throw new OperationCanceledException();
            }
            var result = await innerCapacityOperations.CreateWithHttpMessagesAsync(resourceGroupName, workspaceName, capacityParameters, customHeaders, cancellationToken).ConfigureAwait(false);
            if (result.Response.Status != 201){
                throw new ClientException(string.Format("Failed to create capacity: {
                    0}
                    ", result.Response));
                }
                AddToResults(result.Value);
                lastReopenStartNS = Time.NanoTime();
            }
        }
    }
}