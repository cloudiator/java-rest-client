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


import io.github.cloudiator.rest.model.Monitor;
import io.github.cloudiator.rest.model.MonitoringTarget;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonitoringApi {
    private ApiClient localVarApiClient;

    public MonitoringApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonitoringApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addMonitor
     * @param monitor Monitor to be created  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addMonitorCall(Monitor monitor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = monitor;

        // create path and map variables
        String localVarPath = "/monitors";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addMonitorValidateBeforeCall(Monitor monitor, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'monitor' is set
        if (monitor == null) {
            throw new ApiException("Missing the required parameter 'monitor' when calling addMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = addMonitorCall(monitor, _callback);
        return localVarCall;

    }

    /**
     * 
     * Creates a monitor 
     * @param monitor Monitor to be created  (required)
     * @return Monitor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public Monitor addMonitor(Monitor monitor) throws ApiException {
        ApiResponse<Monitor> localVarResp = addMonitorWithHttpInfo(monitor);
        return localVarResp.getData();
    }

    /**
     * 
     * Creates a monitor 
     * @param monitor Monitor to be created  (required)
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Monitor> addMonitorWithHttpInfo(Monitor monitor) throws ApiException {
        okhttp3.Call localVarCall = addMonitorValidateBeforeCall(monitor, null);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Creates a monitor 
     * @param monitor Monitor to be created  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addMonitorAsync(Monitor monitor, final ApiCallback<Monitor> _callback) throws ApiException {

        okhttp3.Call localVarCall = addMonitorValidateBeforeCall(monitor, _callback);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteMonitor
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMonitorCall(String metric, MonitoringTarget target, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = target;

        // create path and map variables
        String localVarPath = "/monitors/{metric}"
            .replaceAll("\\{" + "metric" + "\\}", localVarApiClient.escapeString(metric.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteMonitorValidateBeforeCall(String metric, MonitoringTarget target, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new ApiException("Missing the required parameter 'metric' when calling deleteMonitor(Async)");
        }
        
        // verify the required parameter 'target' is set
        if (target == null) {
            throw new ApiException("Missing the required parameter 'target' when calling deleteMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = deleteMonitorCall(metric, target, _callback);
        return localVarCall;

    }

    /**
     * 
     * Deletes the monitor identified by the given metric name. 
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void deleteMonitor(String metric, MonitoringTarget target) throws ApiException {
        deleteMonitorWithHttpInfo(metric, target);
    }

    /**
     * 
     * Deletes the monitor identified by the given metric name. 
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteMonitorWithHttpInfo(String metric, MonitoringTarget target) throws ApiException {
        okhttp3.Call localVarCall = deleteMonitorValidateBeforeCall(metric, target, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Deletes the monitor identified by the given metric name. 
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteMonitorAsync(String metric, MonitoringTarget target, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteMonitorValidateBeforeCall(metric, target, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for findMonitors
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMonitorsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/monitors";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findMonitorsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = findMonitorsCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Returns all monitors visible to the user 
     * @return List&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public List<Monitor> findMonitors() throws ApiException {
        ApiResponse<List<Monitor>> localVarResp = findMonitorsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Returns all monitors visible to the user 
     * @return ApiResponse&lt;List&lt;Monitor&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Monitor>> findMonitorsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = findMonitorsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Monitor>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns all monitors visible to the user 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findMonitorsAsync(final ApiCallback<List<Monitor>> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMonitorsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Monitor>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMonitor
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMonitorCall(String metric, MonitoringTarget target, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = target;

        // create path and map variables
        String localVarPath = "/monitors/{metric}"
            .replaceAll("\\{" + "metric" + "\\}", localVarApiClient.escapeString(metric.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMonitorValidateBeforeCall(String metric, MonitoringTarget target, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new ApiException("Missing the required parameter 'metric' when calling getMonitor(Async)");
        }
        
        // verify the required parameter 'target' is set
        if (target == null) {
            throw new ApiException("Missing the required parameter 'target' when calling getMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = getMonitorCall(metric, target, _callback);
        return localVarCall;

    }

    /**
     * 
     * Retrieves the monitor with the given metric name 
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @return Monitor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public Monitor getMonitor(String metric, MonitoringTarget target) throws ApiException {
        ApiResponse<Monitor> localVarResp = getMonitorWithHttpInfo(metric, target);
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieves the monitor with the given metric name 
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Monitor> getMonitorWithHttpInfo(String metric, MonitoringTarget target) throws ApiException {
        okhttp3.Call localVarCall = getMonitorValidateBeforeCall(metric, target, null);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieves the monitor with the given metric name 
     * @param metric Unique identifier of a monitor (required)
     * @param target Target of the Monitor  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMonitorAsync(String metric, MonitoringTarget target, final ApiCallback<Monitor> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMonitorValidateBeforeCall(metric, target, _callback);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateMonitor
     * @param metric Unique identifier of a monitor (required)
     * @param monitor Monitor to be updated  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMonitorCall(String metric, Monitor monitor, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = monitor;

        // create path and map variables
        String localVarPath = "/monitors/{metric}"
            .replaceAll("\\{" + "metric" + "\\}", localVarApiClient.escapeString(metric.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateMonitorValidateBeforeCall(String metric, Monitor monitor, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new ApiException("Missing the required parameter 'metric' when calling updateMonitor(Async)");
        }
        
        // verify the required parameter 'monitor' is set
        if (monitor == null) {
            throw new ApiException("Missing the required parameter 'monitor' when calling updateMonitor(Async)");
        }
        

        okhttp3.Call localVarCall = updateMonitorCall(metric, monitor, _callback);
        return localVarCall;

    }

    /**
     * 
     * Updating a monitor 
     * @param metric Unique identifier of a monitor (required)
     * @param monitor Monitor to be updated  (required)
     * @return Monitor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public Monitor updateMonitor(String metric, Monitor monitor) throws ApiException {
        ApiResponse<Monitor> localVarResp = updateMonitorWithHttpInfo(metric, monitor);
        return localVarResp.getData();
    }

    /**
     * 
     * Updating a monitor 
     * @param metric Unique identifier of a monitor (required)
     * @param monitor Monitor to be updated  (required)
     * @return ApiResponse&lt;Monitor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Monitor> updateMonitorWithHttpInfo(String metric, Monitor monitor) throws ApiException {
        okhttp3.Call localVarCall = updateMonitorValidateBeforeCall(metric, monitor, null);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updating a monitor 
     * @param metric Unique identifier of a monitor (required)
     * @param monitor Monitor to be updated  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMonitorAsync(String metric, Monitor monitor, final ApiCallback<Monitor> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateMonitorValidateBeforeCall(metric, monitor, _callback);
        Type localVarReturnType = new TypeToken<Monitor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
