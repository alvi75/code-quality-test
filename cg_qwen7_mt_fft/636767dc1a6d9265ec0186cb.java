import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
		if (this.initialized){
			return;
		}
		
		this.initialized = true;
		
		try{
			
			// create directories
			createDirectories();
			
			// initialize properties file
			initializePropertiesFile();
			
			// load configuration from properties file
			loadConfigurationFromPropertiesFile();
			
			// validate configuration
			validateConfiguration();
			
			// initialize data source
			initializeDataSource();
			
			// initialize pool manager if configured to do so
			if(this.poolManager != null && this.poolManager.initialize()){
				logger.info("Initialized pool manager");
				
				// start monitor thread for DataSource
				startMonitorThreadForDataSource();
				
				// initialize event dispatcher service, which is responsible for dispatching events to listeners
				initializeEventDispatcherService();
				
				// initialize quartz scheduler instance
				initializeQuartzSchedulerInstance();
				
				// register all quartz jobs with quartz scheduler
				registerAllQuartzJobsAndTriggers();
				
				// start up jvm metrics collection
				startJVMGaugeCollection();
				
				// start up collector threads 
				startCollectorThreads();
				
				// start up purge stale entries task
				startPurgeStaleEntriesTask();

			}else{
				logger.error("Pool Manager failed initialization");
			}

		}catch(Exception ex){
			logger.error("Error initializing",ex);
			throw new RuntimeException(ex);
		}
	}
}