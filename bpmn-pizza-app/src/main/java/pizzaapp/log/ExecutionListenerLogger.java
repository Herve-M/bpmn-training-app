package pizzaapp.log;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class ExecutionListenerLogger implements ExecutionListener {
	
	private final static Logger LOGGER = Logger.getLogger("EXEC-LOGGER");

	public void notify(DelegateExecution arg0) throws Exception {
		LOGGER.info(arg0.getEventName()+" has been called");
	}

}
