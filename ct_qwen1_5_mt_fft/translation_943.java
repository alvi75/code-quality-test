import java.util.*;

public class Translation943 {
    public void run() {
    final long[] nextReopenTimes = new long[2];
    final ReentrantLock reopenCond = this.reopenCond;
    final int numTasks = tasks.length;
    for (;
    ;
    ) {
        boolean hasWaiting = false;
        for (int j = 0;
        j < numTasks;
        ++j ) {
            Runnable r = tasks[j];
            if ( r == null ) continue ;
            if ( r instanceof Callable ) {
                try {
                    // NOTE: all calls to "call" are passed to ForkJoinPool.commonSubmit // which will serialize them into a single batch by using // synchronized(this) as needed. This is one of the chief // goals of this class. return (V) ((Callable<? extends V>) r).call();
                }
                catch (Throwable rex ) {
                    reportException(rex);
                }
            }
            else {
                if ( r instanceof ForkJoinTask ) {
                    // avoid extra stack creation on common path ForkJoinTask<?> ft = (ForkJoinTask<?>)r;
                    assert ft.pool == this || isStealing(ft);
                    if ( ft.status >= 0 ) {
                        // not submitted or stolen if ( ft.status <= 0 ) // not submitted addWorker(ft);
                        // may block }
                        else if ( ft.status == STATUS_FORCED ) // forcibly queued break ;
                        // possibly blocked }
                        else if ( r instanceof ForkJoinTaskGroup . WorkQueue ) throw new IllegalStateException("pool terminated");
                        else if ( r instanceof CountedCompleter ) {
                            CountedCompleter c = (CountedCompleter)r;
                            if ( c instanceof UNTHREAD_CAPABLE ) {
                                // ensure counts are updated atomically AtomicInteger h = c.holdsBeingComplied;
                                if ( h != null && h.compareAndSet(0, Integer.MAX_VALUE)) {
                                    // force counts to MAX_VALUE try {
                                        Thread.yield();
                                    }
                                    catch ( InterruptedException e ) {
                                    }
                                }
                            }
                        }
                        else if ( r instanceof ForkJoinTask ) {
                            // recheck status after running if ( (r = tasks[j]) == null ) continue;
                            if ( r instanceof ForkJoinTask ) {
                                // recheck status after running if ( (r = tasks[j]) == null ) continue;
                                if ( r instanceof ForkJoinTask ) {
                                    // recheck status after running if ( (r = tasks[j]) == null ) continue;
                                    if ( r instanceof ForkJoinTask ) {
                                        // recheck status after running if ( (r = tasks[j]) == null ) continue;
                                        if ( r instanceof ForkJoinTask ) {
                                            //
}