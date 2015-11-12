package gateway;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Gateway App")
public class GatewayBPMNApplication extends ServletProcessApplication {

}
