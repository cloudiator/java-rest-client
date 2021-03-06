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


import io.github.cloudiator.rest.model.ByonNode;
import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.NewNode;
import io.github.cloudiator.rest.model.Node;
import io.github.cloudiator.rest.model.NodeRequest;
import io.github.cloudiator.rest.model.Queue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeApi {
    private ApiClient localVarApiClient;

    public NodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NodeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addByon
     * @param newNode Node to be registered (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addByonCall(NewNode newNode, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = newNode;

        // create path and map variables
        String localVarPath = "/byon";

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
    private okhttp3.Call addByonValidateBeforeCall(NewNode newNode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'newNode' is set
        if (newNode == null) {
            throw new ApiException("Missing the required parameter 'newNode' when calling addByon(Async)");
        }
        

        okhttp3.Call localVarCall = addByonCall(newNode, _callback);
        return localVarCall;

    }

    /**
     * 
     * Registers an already existing node for usage
     * @param newNode Node to be registered (required)
     * @return ByonNode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ByonNode addByon(NewNode newNode) throws ApiException {
        ApiResponse<ByonNode> localVarResp = addByonWithHttpInfo(newNode);
        return localVarResp.getData();
    }

    /**
     * 
     * Registers an already existing node for usage
     * @param newNode Node to be registered (required)
     * @return ApiResponse&lt;ByonNode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ByonNode> addByonWithHttpInfo(NewNode newNode) throws ApiException {
        okhttp3.Call localVarCall = addByonValidateBeforeCall(newNode, null);
        Type localVarReturnType = new TypeToken<ByonNode>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Registers an already existing node for usage
     * @param newNode Node to be registered (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addByonAsync(NewNode newNode, final ApiCallback<ByonNode> _callback) throws ApiException {

        okhttp3.Call localVarCall = addByonValidateBeforeCall(newNode, _callback);
        Type localVarReturnType = new TypeToken<ByonNode>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addNode
     * @param nodeRequest Node Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addNodeCall(NodeRequest nodeRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = nodeRequest;

        // create path and map variables
        String localVarPath = "/node";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "code", "message", 
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
    private okhttp3.Call addNodeValidateBeforeCall(NodeRequest nodeRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'nodeRequest' is set
        if (nodeRequest == null) {
            throw new ApiException("Missing the required parameter 'nodeRequest' when calling addNode(Async)");
        }
        

        okhttp3.Call localVarCall = addNodeCall(nodeRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create a new node request
     * @param nodeRequest Node Request (required)
     * @return Queue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public Queue addNode(NodeRequest nodeRequest) throws ApiException {
        ApiResponse<Queue> localVarResp = addNodeWithHttpInfo(nodeRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a new node request
     * @param nodeRequest Node Request (required)
     * @return ApiResponse&lt;Queue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Queue> addNodeWithHttpInfo(NodeRequest nodeRequest) throws ApiException {
        okhttp3.Call localVarCall = addNodeValidateBeforeCall(nodeRequest, null);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a new node request
     * @param nodeRequest Node Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> ACCEPTED </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addNodeAsync(NodeRequest nodeRequest, final ApiCallback<Queue> _callback) throws ApiException {

        okhttp3.Call localVarCall = addNodeValidateBeforeCall(nodeRequest, _callback);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteByon
     * @param id Unique identifier of the resource (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteByonCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/byon/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "code", "message", 
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteByonValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteByon(Async)");
        }
        

        okhttp3.Call localVarCall = deleteByonCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Deletes the already existing node from cloudiator, if not allocated.
     * @param id Unique identifier of the resource (required)
     * @return Queue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
     </table>
     */
    public Queue deleteByon(String id) throws ApiException {
        ApiResponse<Queue> localVarResp = deleteByonWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Deletes the already existing node from cloudiator, if not allocated.
     * @param id Unique identifier of the resource (required)
     * @return ApiResponse&lt;Queue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Queue> deleteByonWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = deleteByonValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Deletes the already existing node from cloudiator, if not allocated.
     * @param id Unique identifier of the resource (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Item not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteByonAsync(String id, final ApiCallback<Queue> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteByonValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNode
     * @param id Unique identifier of the resource (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteNodeCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/node/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteNodeValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteNode(Async)");
        }
        

        okhttp3.Call localVarCall = deleteNodeCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Deletes the node with the given id.
     * @param id Unique identifier of the resource (required)
     * @return Queue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public Queue deleteNode(String id) throws ApiException {
        ApiResponse<Queue> localVarResp = deleteNodeWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Deletes the node with the given id.
     * @param id Unique identifier of the resource (required)
     * @return ApiResponse&lt;Queue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Queue> deleteNodeWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = deleteNodeValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Deletes the node with the given id.
     * @param id Unique identifier of the resource (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteNodeAsync(String id, final ApiCallback<Queue> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNodeValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findByons
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findByonsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/byon";

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
    private okhttp3.Call findByonsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = findByonsCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Retrieve all BYONs the current user has access to
     * @return List&lt;ByonNode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<ByonNode> findByons() throws ApiException {
        ApiResponse<List<ByonNode>> localVarResp = findByonsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieve all BYONs the current user has access to
     * @return ApiResponse&lt;List&lt;ByonNode&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ByonNode>> findByonsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = findByonsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ByonNode>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve all BYONs the current user has access to
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findByonsAsync(final ApiCallback<List<ByonNode>> _callback) throws ApiException {

        okhttp3.Call localVarCall = findByonsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ByonNode>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findNodes
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findNodesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/node";

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
    private okhttp3.Call findNodesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = findNodesCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Retrieve all nodes the current user has access to
     * @return List&lt;Node&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Node> findNodes() throws ApiException {
        ApiResponse<List<Node>> localVarResp = findNodesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieve all nodes the current user has access to
     * @return ApiResponse&lt;List&lt;Node&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Node>> findNodesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = findNodesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Node>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve all nodes the current user has access to
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findNodesAsync(final ApiCallback<List<Node>> _callback) throws ApiException {

        okhttp3.Call localVarCall = findNodesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Node>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNode
     * @param id Unique identifier of the resource (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNodeCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/node/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call getNodeValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getNode(Async)");
        }
        

        okhttp3.Call localVarCall = getNodeCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Retrieves the node with the given id.
     * @param id Unique identifier of the resource (required)
     * @return Node
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public Node getNode(String id) throws ApiException {
        ApiResponse<Node> localVarResp = getNodeWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieves the node with the given id.
     * @param id Unique identifier of the resource (required)
     * @return ApiResponse&lt;Node&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Node> getNodeWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getNodeValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Node>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieves the node with the given id.
     * @param id Unique identifier of the resource (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNodeAsync(String id, final ApiCallback<Node> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNodeValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Node>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
