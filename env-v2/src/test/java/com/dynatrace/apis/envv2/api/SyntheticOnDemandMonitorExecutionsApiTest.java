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
import com.dynatrace.apis.envv2.model.SyntheticOnDemandBatchStatus;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecution;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecutionRequest;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecutionResult;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecutions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SyntheticOnDemandMonitorExecutionsApi
 */
@Ignore
public class SyntheticOnDemandMonitorExecutionsApiTest {

    private final SyntheticOnDemandMonitorExecutionsApi api = new SyntheticOnDemandMonitorExecutionsApi();

    
    /**
     * Triggers on-demand executions for synthetic monitors | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        SyntheticOnDemandExecutionRequest syntheticOnDemandExecutionRequest = null;
        SyntheticOnDemandExecutionResult response = 
        api.execute(syntheticOnDemandExecutionRequest);
        
        // TODO: test validations
    }
    
    /**
     * Gets summary information and the list of failed executions for the given batch ID | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTest() throws ApiException {
        Long batchId = null;
        SyntheticOnDemandBatchStatus response = 
        api.getBatch(batchId);
        
        // TODO: test validations
    }
    
    /**
     * Gets basic results of the specified on-demand execution | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExecutionTest() throws ApiException {
        Long executionId = null;
        SyntheticOnDemandExecution response = 
        api.getExecution(executionId);
        
        // TODO: test validations
    }
    
    /**
     * Gets detailed results of the specified on-demand execution | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExecutionFullReportTest() throws ApiException {
        Long executionId = null;
        SyntheticOnDemandExecution response = 
        api.getExecutionFullReport(executionId);
        
        // TODO: test validations
    }
    
    /**
     * Gets the list of all on-demand executions of synthetic monitors | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExecutionsTest() throws ApiException {
        String executionStage = null;
        String schedulingFrom = null;
        String schedulingTo = null;
        String executionFrom = null;
        String executionTo = null;
        String dataDeliveryFrom = null;
        String dataDeliveryTo = null;
        Long batchId = null;
        String monitorId = null;
        String locationId = null;
        String userId = null;
        String source = null;
        SyntheticOnDemandExecutions response = 
        api.getExecutions(executionStage, schedulingFrom, schedulingTo, executionFrom, executionTo, dataDeliveryFrom, dataDeliveryTo, batchId, monitorId, locationId, userId, source);
        
        // TODO: test validations
    }
    
}