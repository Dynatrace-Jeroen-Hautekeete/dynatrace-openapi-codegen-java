/*
 * Dynatrace Configuration API
 * Documentation of the Dynatrace Configuration API. To read about use-cases and examples, see [Dynatrace Documentation](https://dt-url.net/4u43kxw).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.configv1.api;

import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.model.CloudFoundryCredentials;
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import com.dynatrace.apis.configv1.model.StubList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CloudFoundryCredentialsConfigurationApi
 */
@Ignore
public class CloudFoundryCredentialsConfigurationApiTest {

    private final CloudFoundryCredentialsConfigurationApi api = new CloudFoundryCredentialsConfigurationApi();

    
    /**
     * Create new credentials for a single foundation. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudFoundryCredentialsConfigTest() throws ApiException {
        CloudFoundryCredentials cloudFoundryCredentials = null;
        EntityShortRepresentation response = 
        api.createCloudFoundryCredentialsConfig(cloudFoundryCredentials);
        
        // TODO: test validations
    }
    
    /**
     * Delete the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCloudFoundryCredentialsConfigTest() throws ApiException {
        String id = null;
        
        api.deleteCloudFoundryCredentialsConfig(id);
        
        // TODO: test validations
    }
    
    /**
     * Show the properties for the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudFoundryCredentialsConfigTest() throws ApiException {
        String id = null;
        CloudFoundryCredentials response = 
        api.getCloudFoundryCredentialsConfig(id);
        
        // TODO: test validations
    }
    
    /**
     * List all the Cloud Foundry foundations credentials. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudFoundryCredentialsConfigsTest() throws ApiException {
        StubList response = 
        api.listCloudFoundryCredentialsConfigs();
        
        // TODO: test validations
    }
    
    /**
     * Create or update credentials for a single Cloud Foundry foundation. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudFoundryCredentialsConfigTest() throws ApiException {
        String id = null;
        CloudFoundryCredentials cloudFoundryCredentials = null;
        EntityShortRepresentation response = 
        api.updateCloudFoundryCredentialsConfig(id, cloudFoundryCredentials);
        
        // TODO: test validations
    }
    
    /**
     * Validate that creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateCreateCloudFoundryCredentialsConfigTest() throws ApiException {
        CloudFoundryCredentials cloudFoundryCredentials = null;
        
        api.validateCreateCloudFoundryCredentialsConfig(cloudFoundryCredentials);
        
        // TODO: test validations
    }
    
    /**
     * Validate that updating or creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateUpdateCloudFoundryCredentialsConfigTest() throws ApiException {
        String id = null;
        CloudFoundryCredentials cloudFoundryCredentials = null;
        
        api.validateUpdateCloudFoundryCredentialsConfig(id, cloudFoundryCredentials);
        
        // TODO: test validations
    }
    
}