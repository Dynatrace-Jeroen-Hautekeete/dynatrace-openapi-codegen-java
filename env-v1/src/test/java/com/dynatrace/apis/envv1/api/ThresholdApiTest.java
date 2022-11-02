/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/xc03k3c).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv1.api;

import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.model.Threshold;
import com.dynatrace.apis.envv1.model.ThresholdRegistrationMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ThresholdApi
 */
@Ignore
public class ThresholdApiTest {

    private final ThresholdApi api = new ThresholdApi();

    
    /**
     * Creates or updates an existing threshold for a plugin or a custom event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomThresholdTest() throws ApiException {
        String thresholdId = null;
        ThresholdRegistrationMessage thresholdRegistrationMessage = null;
        Threshold response = 
        api.createCustomThreshold(thresholdId, thresholdRegistrationMessage);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified threshold
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomThresholdTest() throws ApiException {
        String thresholdId = null;
        
        api.deleteCustomThreshold(thresholdId);
        
        // TODO: test validations
    }
    
    /**
     * Gets all configured thresholds for plugins and custom events in your environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCustomThresholdsTest() throws ApiException {
        String filter = null;
        List<Threshold> response = 
        api.readCustomThresholds(filter);
        
        // TODO: test validations
    }
    
}