package taskapp;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Task App")
public class TaskBPMNApplication extends ServletProcessApplication {

}
