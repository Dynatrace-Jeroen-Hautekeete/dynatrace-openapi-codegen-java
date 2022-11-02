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
import com.dynatrace.apis.configv1.model.LogMetricConfig;
import com.dynatrace.apis.configv1.model.StubList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CalculatedMetricsLogMonitoringApi
 */
@Ignore
public class CalculatedMetricsLogMonitoringApiTest {

    private final CalculatedMetricsLogMonitoringApi api = new CalculatedMetricsLogMonitoringApi();

    
    /**
     * Deletes the specified custom log metric definition | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogMetricConfigTest() throws ApiException {
        String metricKey = null;
        
        api.deleteLogMetricConfig(metricKey);
        
        // TODO: test validations
    }
    
    /**
     * Gets the definition of the specified custom log metric | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogMetricConfigTest() throws ApiException {
        String metricKey = null;
        LogMetricConfig response = 
        api.getLogMetricConfig(metricKey);
        
        // TODO: test validations
    }
    
    /**
     * Lists all custom log metrics configured in your environment | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLogMetricConfigsTest() throws ApiException {
        StubList response = 
        api.listLogMetricConfigs();
        
        // TODO: test validations
    }
    
    /**
     * Creates a new custom log metric | maturity&#x3D;EARLY_ADOPTER
     *
     * If the metric definition with the specified key already exists, it is updated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrCreateLogMetricConfigTest() throws ApiException {
        String metricKey = null;
        LogMetricConfig logMetricConfig = null;
        EntityShortRepresentation response = 
        api.updateOrCreateLogMetricConfig(metricKey, logMetricConfig);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;PUT /calculatedMetrics/log/{metricKey}&#x60; request. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateMetricTest() throws ApiException {
        String metricKey = null;
        LogMetricConfig logMetricConfig = null;
        
        api.validateMetric(metricKey, logMetricConfig);
        
        // TODO: test validations
    }
    
}
