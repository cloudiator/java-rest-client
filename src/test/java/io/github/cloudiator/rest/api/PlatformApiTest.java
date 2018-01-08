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
import io.github.cloudiator.rest.model.NewPlatform;
import io.github.cloudiator.rest.model.NewPlatformEnvironment;
import io.github.cloudiator.rest.model.NewPlatformHardware;
import io.github.cloudiator.rest.model.NewPlatformRuntime;
import io.github.cloudiator.rest.model.Platform;
import io.github.cloudiator.rest.model.PlatformEnvironment;
import io.github.cloudiator.rest.model.PlatformHardware;
import io.github.cloudiator.rest.model.PlatformRuntime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlatformApi
 */
@Ignore
public class PlatformApiTest {

    private final PlatformApi api = new PlatformApi();

    
    /**
     * 
     *
     * Creates a new platform.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPlatformTest() throws ApiException {
        NewPlatform platform = null;
        Platform response = api.addPlatform(platform);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new PlatformEnvironment 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPlatformEnvironmentTest() throws ApiException {
        NewPlatformEnvironment platformEnvironment = null;
        PlatformEnvironment response = api.addPlatformEnvironment(platformEnvironment);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new PlatformHardware 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPlatformHardwareTest() throws ApiException {
        NewPlatformHardware platformHardware = null;
        PlatformHardware response = api.addPlatformHardware(platformHardware);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new PlatformRuntime 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPlatformRuntimeTest() throws ApiException {
        NewPlatformRuntime platformRuntime = null;
        PlatformRuntime response = api.addPlatformRuntime(platformRuntime);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the platform identified by the given id paramater. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePlatformTest() throws ApiException {
        String id = null;
        api.deletePlatform(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the platform identified by the given id parameter 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformTest() throws ApiException {
        String id = null;
        Platform response = api.findPlatform(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the PlatformEnvironment identified by the id parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformEnvironmentTest() throws ApiException {
        String id = null;
        PlatformEnvironment response = api.findPlatformEnvironment(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all platform environment  visible to the user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformEnvironmentsTest() throws ApiException {
        List<PlatformEnvironment> response = api.findPlatformEnvironments();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the PlatformHardware identified by the id parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformHardwareTest() throws ApiException {
        String id = null;
        PlatformHardware response = api.findPlatformHardware(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all platform hardware visible to the user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformHardwaresTest() throws ApiException {
        List<PlatformHardware> response = api.findPlatformHardwares();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the PlatformRuntime identified by the id parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformRuntimeTest() throws ApiException {
        String id = null;
        PlatformRuntime response = api.findPlatformRuntime(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all platform runtime  visible to the user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformRuntimesTest() throws ApiException {
        List<PlatformRuntime> response = api.findPlatformRuntimes();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all platform from the system that the user has access to 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPlatformsTest() throws ApiException {
        List<Platform> response = api.findPlatforms();

        // TODO: test validations
    }
    
}
