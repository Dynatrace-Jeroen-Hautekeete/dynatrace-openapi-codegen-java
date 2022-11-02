/*
 * Dynatrace Environment API
 *  Documentation of the Dynatrace Environment API v2. Resources here generally supersede those in v1. Migration of resources from v1 is in progress.   If you miss a resource, consider using the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/2u23k1k) .  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv2.api;

import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.model.ActiveGateAutoUpdateConfig;
import com.dynatrace.apis.envv2.model.ActiveGateGlobalAutoUpdateConfig;
import com.dynatrace.apis.envv2.model.ErrorEnvelope;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ActiveGatesAutoUpdateConfigurationApi
 */
@Ignore
public class ActiveGatesAutoUpdateConfigurationApiTest {

    private final ActiveGatesAutoUpdateConfigurationApi api = new ActiveGatesAutoUpdateConfigurationApi();

    
    /**
     * Gets the configuration of auto-update for the specified ActiveGate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAutoUpdateConfigByIdTest() throws ApiException {
        String agId = null;
        ActiveGateAutoUpdateConfig response = 
        api.getAutoUpdateConfigById(agId);
        
        // TODO: test validations
    }
    
    /**
     * Gets the global auto-update configuration of environment ActiveGates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGlobalAutoUpdateConfigForTenantTest() throws ApiException {
        ActiveGateGlobalAutoUpdateConfig response = 
        api.getGlobalAutoUpdateConfigForTenant();
        
        // TODO: test validations
    }
    
    /**
     * Updates the configuration of auto-update for the specified ActiveGate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAutoUpdateConfigByIdTest() throws ApiException {
        String agId = null;
        ActiveGateAutoUpdateConfig activeGateAutoUpdateConfig = null;
        
        api.putAutoUpdateConfigById(agId, activeGateAutoUpdateConfig);
        
        // TODO: test validations
    }
    
    /**
     * Puts the global auto-update configuration of environment ActiveGates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putGlobalAutoUpdateConfigForTenantTest() throws ApiException {
        ActiveGateGlobalAutoUpdateConfig activeGateGlobalAutoUpdateConfig = null;
        
        api.putGlobalAutoUpdateConfigForTenant(activeGateGlobalAutoUpdateConfig);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;POST /activeGates/{agId}/autoUpdate&#x60; request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateAutoUpdateConfigByIdTest() throws ApiException {
        String agId = null;
        ActiveGateAutoUpdateConfig activeGateAutoUpdateConfig = null;
        
        api.validateAutoUpdateConfigById(agId, activeGateAutoUpdateConfig);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;POST /activeGates/autoUpdate&#x60; request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateGlobalAutoUpdateConfigForTenantTest() throws ApiException {
        ActiveGateGlobalAutoUpdateConfig activeGateGlobalAutoUpdateConfig = null;
        
        api.validateGlobalAutoUpdateConfigForTenant(activeGateGlobalAutoUpdateConfig);
        
        // TODO: test validations
    }
    
}