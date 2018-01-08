/*
 * Cloudiator REST Api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.LongRunningRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LongRunningRequestApi
 */
@Ignore
public class LongRunningRequestApiTest {

    private final LongRunningRequestApi api = new LongRunningRequestApi();

    
    /**
     * 
     *
     * Returns all running LLRs visible to the user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllLongRunningRequestTest() throws ApiException {
        List<LongRunningRequest> response = api.findAllLongRunningRequest();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the LRR identified by the id parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findLongRunningRequestTest() throws ApiException {
        String id = null;
        LongRunningRequest response = api.findLongRunningRequest(id);

        // TODO: test validations
    }
    
}
