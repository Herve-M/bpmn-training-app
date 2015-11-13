/**
 * 
 */
package delegates;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @author Psyko
 *
 */
public class SimpleDelegate implements JavaDelegate {

	private static Logger LOGGER = Logger.getAnonymousLogger("SimpleDelegateClass");
	/* (non-Javadoc)
	 * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
	 */
	public void execute(DelegateExecution arg0) throws Exception {
		LOGGER.info("Simple Delegate execution Method - Info : " + arg0.getCurrentActivityName() + " done !");
		
	}

}
