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

import io.github.cloudiator.rest.ApiCallback;
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.ApiResponse;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.Pair;
import io.github.cloudiator.rest.ProgressRequestBody;
import io.github.cloudiator.rest.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.cloudiator.rest.model.Job;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YamlApi {
    private ApiClient localVarApiClient;

    public YamlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public YamlApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for parseYAML
     * @param yaml YAML payload (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parseYAMLCall(String yaml, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = yaml;

        // create path and map variables
        String localVarPath = "/yaml";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/yaml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call parseYAMLValidateBeforeCall(String yaml, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'yaml' is set
        if (yaml == null) {
            throw new ApiException("Missing the required parameter 'yaml' when calling parseYAML(Async)");
        }
        

        okhttp3.Call localVarCall = parseYAMLCall(yaml, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param yaml YAML payload (required)
     * @return Job
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Job parseYAML(String yaml) throws ApiException {
        ApiResponse<Job> localVarResp = parseYAMLWithHttpInfo(yaml);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param yaml YAML payload (required)
     * @return ApiResponse&lt;Job&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Job> parseYAMLWithHttpInfo(String yaml) throws ApiException {
        okhttp3.Call localVarCall = parseYAMLValidateBeforeCall(yaml, null);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param yaml YAML payload (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call parseYAMLAsync(String yaml, final ApiCallback<Job> _callback) throws ApiException {

        okhttp3.Call localVarCall = parseYAMLValidateBeforeCall(yaml, _callback);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
