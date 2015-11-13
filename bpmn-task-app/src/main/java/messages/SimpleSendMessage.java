/**
 * 
 */
package messages;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @author Psyko
 *
 */
public class SimpleSendMessage implements JavaDelegate {

	/* (non-Javadoc)
	 * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
	 */
	public void execute(DelegateExecution arg0) throws Exception {
		arg0.getProcessEngineServices()
	      .getRuntimeService()
	      .createMessageCorrelation("someMessage")
	      .processInstanceBusinessKey("someBusinessKey")
	      .correlate();
		//Huge lack of documentation
	}

}
