package pizzaapp.log;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class TaskListenerLogger implements TaskListener {
	
	private final static Logger LOGGER = Logger.getLogger("TASK-LOGGER");

	public void notify(DelegateTask arg0) {
		LOGGER.info(arg0.getEventName()+" has been called");
	}

}
