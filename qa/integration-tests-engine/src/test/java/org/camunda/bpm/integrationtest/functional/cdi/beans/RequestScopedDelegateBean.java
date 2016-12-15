package org.camunda.bpm.integrationtest.functional.cdi.beans;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * A {@link RequestScoped} bean
 * 
 * @author Daniel Meyer
 *
 */
@Named
@RequestScoped
public class RequestScopedDelegateBean implements JavaDelegate {

  private int invocationCounter = 0;
  
  @Override
  public void execute(DelegateExecution execution) throws Exception {
    invocationCounter++;
    execution.setVariable("invocationCounter", invocationCounter);
  }

}
