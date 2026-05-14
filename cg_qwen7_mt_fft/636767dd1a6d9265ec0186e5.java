import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    public void addNewTarget(Channels channels,IConsumer consumer){
        if (log.isTraceEnabled()){
            log.trace("addNewTarget - entry");
        }
        
        // Get a list of all current targets for this application.
        List<Target> appTargets = getTargets(channels.getApplication());
        
        Target newTarget = null;
        boolean isNewTarget=false;

        synchronized(appTargets) {
            // Iterate through existing targets, see whether we already have a target with our channel names.
            Iterator<Target> iter = appTargets.iterator();
            while(iter.hasNext()) {
                Target t = iter.next();

                // If it's not dynamic, but has exactly the same set of non-null channel names as ours,
                // then don't bother creating another one.
                if(!t.isDynamic() && equalsNonDynamic(t)){
                    newTarget=t;
                    isNewTarget=false;
                    break;
                }

                // Otherwise create a new target, since either:
                // 1. This is a dynamic target that matches by name wildcard or regular expression; OR
                // 2. We've got different sets of channel names.
                else if(
                        ((t.isDynamic() || !equalsNonDynamic(t)) &&
                                matchTarget(t,channels))
                        ){
                    newTarget=new Target(consumer,t);
                    isNewTarget=true;
                    break;
                }
            }
        }

        if(isNewTarget){
            addTarget(newTarget);
        }else{
            updateTargetConsumers(newTarget);
        }

        if(log.isTraceEnabled()){
            log.trace("addNewTarget - exit");
        }
    }
}