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
import com.dynatrace.apis.configv1.model.AnomalyDetectionPG;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for AnomalyDetectionProcessGroupsApi
 */
@Ignore
public class AnomalyDetectionProcessGroupsApiTest {

    private final AnomalyDetectionProcessGroupsApi api = new AnomalyDetectionProcessGroupsApi();

    
    /**
     * Switches off anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocalAvailabilityConfigTest() throws ApiException {
        String id = null;
        
        api.deleteLocalAvailabilityConfig(id);
        
        // TODO: test validations
    }
    
    /**
     * Gets the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocalAvailabilityConfigTest() throws ApiException {
        String id = null;
        AnomalyDetectionPG response = 
        api.getLocalAvailabilityConfig(id);
        
        // TODO: test validations
    }
    
    /**
     * Updates the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setLocalAvailabilityConfigTest() throws ApiException {
        String id = null;
        AnomalyDetectionPG anomalyDetectionPG = null;
        
        api.setLocalAvailabilityConfig(id, anomalyDetectionPG);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;PUT /anomalyDetection/processGroups/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateLocalPgAvailabilityAlertingEventTest() throws ApiException {
        String id = null;
        AnomalyDetectionPG anomalyDetectionPG = null;
        
        api.validateLocalPgAvailabilityAlertingEvent(id, anomalyDetectionPG);
        
        // TODO: test validations
    }
    
}
