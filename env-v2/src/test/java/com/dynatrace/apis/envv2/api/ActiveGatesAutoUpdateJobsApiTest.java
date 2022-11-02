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
import com.dynatrace.apis.envv2.model.ErrorEnvelope;
import com.dynatrace.apis.envv2.model.UpdateJob;
import com.dynatrace.apis.envv2.model.UpdateJobList;
import com.dynatrace.apis.envv2.model.UpdateJobsAll;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ActiveGatesAutoUpdateJobsApi
 */
@Ignore
public class ActiveGatesAutoUpdateJobsApiTest {

    private final ActiveGatesAutoUpdateJobsApi api = new ActiveGatesAutoUpdateJobsApi();

    
    /**
     * Creates a new update job for the specified ActiveGate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUpdateJobForAgTest() throws ApiException {
        String agId = null;
        UpdateJob updateJob = null;
        UpdateJob response = 
        api.createUpdateJobForAg(agId, updateJob);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified update job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUpdateJobByJobIdForAgTest() throws ApiException {
        String agId = null;
        String jobId = null;
        
        api.deleteUpdateJobByJobIdForAg(agId, jobId);
        
        // TODO: test validations
    }
    
    /**
     * List ActiveGates with update jobs
     *
     * The response includes ActiveGates that have both completed (successful and failed) jobs and jobs in progress.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUpdateJobListTest() throws ApiException {
        String from = null;
        String to = null;
        String startVersionCompareType = null;
        String startVersion = null;
        String updateType = null;
        String targetVersionCompareType = null;
        String targetVersion = null;
        Boolean lastUpdates = null;
        UpdateJobsAll response = 
        api.getAllUpdateJobList(from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates);
        
        // TODO: test validations
    }
    
    /**
     * Gets the parameters of the specified update job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpdateJobByJobIdForAgTest() throws ApiException {
        String agId = null;
        String jobId = null;
        UpdateJob response = 
        api.getUpdateJobByJobIdForAg(agId, jobId);
        
        // TODO: test validations
    }
    
    /**
     * Lists update jobs for the specified ActiveGate
     *
     * The job can update the ActiveGate to the specified version or the latest available one.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpdateJobListByAgIdTest() throws ApiException {
        String agId = null;
        String from = null;
        String to = null;
        String startVersionCompareType = null;
        String startVersion = null;
        String updateType = null;
        String targetVersionCompareType = null;
        String targetVersion = null;
        Boolean lastUpdates = null;
        UpdateJobList response = 
        api.getUpdateJobListByAgId(agId, from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;POST /activeGates/{agId}/updateJobs&#x60; request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateUpdateJobForAgTest() throws ApiException {
        String agId = null;
        UpdateJob updateJob = null;
        
        api.validateUpdateJobForAg(agId, updateJob);
        
        // TODO: test validations
    }
    
}
