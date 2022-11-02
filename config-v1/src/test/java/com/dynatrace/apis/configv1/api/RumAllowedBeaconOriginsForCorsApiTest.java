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
import com.dynatrace.apis.configv1.model.AllowedBeaconOrigins;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for RumAllowedBeaconOriginsForCorsApi
 */
@Ignore
public class RumAllowedBeaconOriginsForCorsApiTest {

    private final RumAllowedBeaconOriginsForCorsApi api = new RumAllowedBeaconOriginsForCorsApi();

    
    /**
     * Gets the configuration of the allowed beacon origins for CORS requests
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllowedBeaconOriginsConfigTest() throws ApiException {
        AllowedBeaconOrigins response = 
        api.getAllowedBeaconOriginsConfig();
        
        // TODO: test validations
    }
    
    /**
     * Updates the configuration of the allowed beacon origins for CORS requests
     *
     * The request overwrites the existing configuration. Any rules not presented in the payload will be lost.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putAllowedBeaconOriginsConfigTest() throws ApiException {
        AllowedBeaconOrigins allowedBeaconOrigins = null;
        
        api.putAllowedBeaconOriginsConfig(allowedBeaconOrigins);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;PUT /allowedBeaconOriginsForCors&#x60; request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateAllowedBeaconOriginsConfigTest() throws ApiException {
        AllowedBeaconOrigins allowedBeaconOrigins = null;
        
        api.validateAllowedBeaconOriginsConfig(allowedBeaconOrigins);
        
        // TODO: test validations
    }
    
}
