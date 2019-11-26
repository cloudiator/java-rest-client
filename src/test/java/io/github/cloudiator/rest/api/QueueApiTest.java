/*
 * Cloudiator REST Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.Queue;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueueApi
 */
@Ignore
public class QueueApiTest {

    private final QueueApi api = new QueueApi();

    
    /**
     * 
     *
     * Returns the queued task with the given id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findQueuedTaskTest() throws ApiException {
        String id = null;
        Queue response = api.findQueuedTask(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all running queued tasks visible to the user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQueuedTasksTest() throws ApiException {
        List<Queue> response = api.getQueuedTasks();

        // TODO: test validations
    }
    
}
