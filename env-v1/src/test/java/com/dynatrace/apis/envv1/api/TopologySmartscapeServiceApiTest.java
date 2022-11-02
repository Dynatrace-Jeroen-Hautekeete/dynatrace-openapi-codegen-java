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
import com.dynatrace.apis.envv1.model.ErrorEnvelope;
import com.dynatrace.apis.envv1.model.Service;
import com.dynatrace.apis.envv1.model.ServiceBaselineValues;
import java.util.Set;
import com.dynatrace.apis.envv1.model.UpdateEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for TopologySmartscapeServiceApi
 */
@Ignore
public class TopologySmartscapeServiceApiTest {

    private final TopologySmartscapeServiceApi api = new TopologySmartscapeServiceApi();

    
    /**
     * Gets baseline data for the specified service | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaselineValuesForSingleServiceTest() throws ApiException {
        String meIdentifier = null;
        ServiceBaselineValues response = 
        api.getBaselineValuesForSingleService(meIdentifier);
        
        // TODO: test validations
    }
    
    /**
     * Lists all available services in your environment
     *
     * You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServicesTest() throws ApiException {
        Long startTimestamp = null;
        Long endTimestamp = null;
        String relativeTime = null;
        Set<String> tag = null;
        Set<String> entity = null;
        Long managementZone = null;
        Boolean includeDetails = null;
        Integer pageSize = null;
        String nextPageKey = null;
        List<Service> response = 
        api.getServices(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey);
        
        // TODO: test validations
    }
    
    /**
     * Gets parameters of the specified service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSingleServiceTest() throws ApiException {
        String meIdentifier = null;
        Service response = 
        api.getSingleService(meIdentifier);
        
        // TODO: test validations
    }
    
    /**
     * Updates parameters of the specified service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateServiceTest() throws ApiException {
        String meIdentifier = null;
        UpdateEntity updateEntity = null;
        
        api.updateService(meIdentifier, updateEntity);
        
        // TODO: test validations
    }
    
}