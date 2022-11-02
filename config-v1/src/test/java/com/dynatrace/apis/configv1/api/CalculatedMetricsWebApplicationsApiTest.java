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
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import com.dynatrace.apis.configv1.model.StubList;
import com.dynatrace.apis.configv1.model.WebApplicationMetric;
import com.dynatrace.apis.configv1.model.WebApplicationMetricUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CalculatedMetricsWebApplicationsApi
 */
@Ignore
public class CalculatedMetricsWebApplicationsApiTest {

    private final CalculatedMetricsWebApplicationsApi api = new CalculatedMetricsWebApplicationsApi();

    
    /**
     * Creates a new calculated web application metric
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRumMetricTest() throws ApiException {
        WebApplicationMetric webApplicationMetric = null;
        EntityShortRepresentation response = 
        api.createRumMetric(webApplicationMetric);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified calculated web application metric
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRumMetricTest() throws ApiException {
        String metricKey = null;
        
        api.deleteRumMetric(metricKey);
        
        // TODO: test validations
    }
    
    /**
     * Gets the descriptor of the specified calculated web application metric
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRumMetricTest() throws ApiException {
        String metricKey = null;
        WebApplicationMetric response = 
        api.getRumMetric(metricKey);
        
        // TODO: test validations
    }
    
    /**
     * Lists all calculated web application metrics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRumMetricsTest() throws ApiException {
        StubList response = 
        api.listRumMetrics();
        
        // TODO: test validations
    }
    
    /**
     * Updates the specified calculated web application metric
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRumMetricTest() throws ApiException {
        String metricKey = null;
        WebApplicationMetricUpdate webApplicationMetricUpdate = null;
        
        api.updateRumMetric(metricKey, webApplicationMetricUpdate);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;POST /calculatedMetrics/rum&#x60; request
     *
     * The body must not provide an ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateCreateRumMetricTest() throws ApiException {
        WebApplicationMetric webApplicationMetric = null;
        
        api.validateCreateRumMetric(webApplicationMetric);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;PUT /calculatedMetrics/rum/{metricKey}&#x60; request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateUpdateRumMetricTest() throws ApiException {
        String metricKey = null;
        WebApplicationMetricUpdate webApplicationMetricUpdate = null;
        
        api.validateUpdateRumMetric(metricKey, webApplicationMetricUpdate);
        
        // TODO: test validations
    }
    
}
