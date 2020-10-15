
package com.utility.reporting;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestCaseFinished;

public class JReporter implements ConcurrentEventListener {
    private static final String ELASTIC_SEARCH_URL = "http://localhost:9200/automation/suite";
    private static final String EXECUTION_ID = "12b27564-42c7-4824-ad90-8fba4bde2222";

    public void onTestCaseFinished(final TestCaseFinished event){
        ScenarioExecutionInfo scnarioExecution = new ScenarioExecutionInfo();
        scnarioExecution.setExecuteId(EXECUTION_ID);
        scnarioExecution.setId(event.getTestCase().getId().toString());
        scnarioExecution.setName(event.getTestCase().getName());
        scnarioExecution.setStatus(event.getResult().getStatus().toString());
        //hacer la peticion
//        //le manda el scenario y contenerr achivo json y mandar la url//
////        RestAssured
////                .given()
////                .body(scnarioExecution)
////                .contentType(ContentType.JSON)
////                .when()
////                .post(ELASTIC_SEARCH_URL);
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseFinished.class,this::onTestCaseFinished);
    }
}
