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
import com.dynatrace.apis.envv1.model.EntityIdDto;
import com.dynatrace.apis.envv1.model.Monitors;
import java.util.Set;
import com.dynatrace.apis.envv1.model.SyntheticMonitor;
import com.dynatrace.apis.envv1.model.SyntheticMonitorUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SyntheticMonitorsApi
 */
@Ignore
public class SyntheticMonitorsApiTest {

    private final SyntheticMonitorsApi api = new SyntheticMonitorsApi();

    
    /**
     * Creates a new synthetic monitor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMonitorTest() throws ApiException {
        SyntheticMonitorUpdate syntheticMonitorUpdate = null;
        EntityIdDto response = 
        api.addMonitor(syntheticMonitorUpdate);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified synthetic monitor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitorTest() throws ApiException {
        String monitorId = null;
        
        api.deleteMonitor(monitorId);
        
        // TODO: test validations
    }
    
    /**
     * Gets parameters of the specified synthetic monitor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMonitorTest() throws ApiException {
        String monitorId = null;
        SyntheticMonitor response = 
        api.getMonitor(monitorId);
        
        // TODO: test validations
    }
    
    /**
     * Lists all synthetic monitors in your Dynatrace environment
     *
     * The full list can be lengthy, but you can narrow it down by specifying filter query parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMonitorsCollectionTest() throws ApiException {
        Long managementZone = null;
        Set<String> tag = null;
        String location = null;
        Set<String> assignedApps = null;
        String type = null;
        Boolean enabled = null;
        String credentialId = null;
        String credentialOwner = null;
        Monitors response = 
        api.getMonitorsCollection(managementZone, tag, location, assignedApps, type, enabled, credentialId, credentialOwner);
        
        // TODO: test validations
    }
    
    /**
     * Updates parameters of the specified synthetic monitor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMonitorTest() throws ApiException {
        String monitorId = null;
        SyntheticMonitorUpdate syntheticMonitorUpdate = null;
        
        api.replaceMonitor(monitorId, syntheticMonitorUpdate);
        
        // TODO: test validations
    }
    
}
