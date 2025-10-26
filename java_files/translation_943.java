import java.util.*;

public class Translation943 {
    ublic override void run(){
    long lastReopenStartNS = DateTime.UtcNow.ToUnixTime() * 100;
    while (!finish){
        bool hasWaiting;
        lock (this){
            hasWaiting = waitingGen > searchingGen;
        }
        long nextReopenStartNS = lastReopenStartNS + (hasWaiting ? targetMinStaleNS : targetMaxStaleNS);
        long sleepNS = nextReopenStartNS - Time.Now().ToUnixTime();
        if (sleepNS > 0) {
            if (Thread.IsInterlocked){
                Thread.SetInterlocked(false);
            }
            try{
                waiterCondition.WaitOne(TimeSpan.FromMilliseconds(sleepNS / Time.MILLISECONDS_PER_NANOSECOND));
            }
            catch (ThreadInterruptedException){
                Thread.CurrentThread.Interrupt();
                return;
            }
            finally{
                if (Thread.IsInterlocked){
                    Thread.SetInterlocked(true);
                }
            }
        }
        else if (finish){
            break;
        }
        lastReopenStartNS = Time.Now().ToUnixTime();
        refreshStartGen = writer.GetAndIncrementGeneration();
        try{
            manager.MaybeRefreshBlocking();
        }
        catch (IOException ioe){
            throw new Exception(ioe.ToString(), ioe);
        }
        finally{
            refreshDone();
        }
    }
}