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
import com.dynatrace.apis.envv1.model.ExtractFields;
import com.dynatrace.apis.envv1.model.FilterLogContent;
import com.dynatrace.apis.envv1.model.FilterTopLogRecords;
import com.dynatrace.apis.envv1.model.LogJobDeleteResult;
import com.dynatrace.apis.envv1.model.LogJobRecordsResult;
import com.dynatrace.apis.envv1.model.LogJobRecordsTopValuesRestResult;
import com.dynatrace.apis.envv1.model.LogJobStatusResult;
import com.dynatrace.apis.envv1.model.LogList4pgResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for LogMonitoringProcessGroupsApi
 */
@Ignore
public class LogMonitoringProcessGroupsApiTest {

    private final LogMonitoringProcessGroupsApi api = new LogMonitoringProcessGroupsApi();

    
    /**
     * Deletes or cancels the specified log analysis job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogJobDeleteTest() throws ApiException {
        String pgId = null;
        String jobId = null;
        LogJobDeleteResult response = 
        api.processGroupLogJobDelete(pgId, jobId);
        
        // TODO: test validations
    }
    
    /**
     * Gets the content of the analyzed log
     *
     * Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/wve3r83) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogJobRecordsTest() throws ApiException {
        String pgId = null;
        String jobId = null;
        String scrollToken = null;
        Integer pageSize = null;
        LogJobRecordsResult response = 
        api.processGroupLogJobRecords(pgId, jobId, scrollToken, pageSize);
        
        // TODO: test validations
    }
    
    /**
     * Gets the content of the analyzed log
     *
     * Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/wve3r83) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogJobRecordsFilteredTest() throws ApiException {
        String pgId = null;
        String jobId = null;
        String scrollToken = null;
        Integer pageSize = null;
        FilterLogContent filterLogContent = null;
        LogJobRecordsResult response = 
        api.processGroupLogJobRecordsFiltered(pgId, jobId, scrollToken, pageSize, filterLogContent);
        
        // TODO: test validations
    }
    
    /**
     * Gets the top values of fields present in the content of the analyzed log
     *
     * Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogJobRecordsTopTest() throws ApiException {
        String pgId = null;
        String jobId = null;
        FilterTopLogRecords filterTopLogRecords = null;
        LogJobRecordsTopValuesRestResult response = 
        api.processGroupLogJobRecordsTop(pgId, jobId, filterTopLogRecords);
        
        // TODO: test validations
    }
    
    /**
     * Starts analysis job for the specified process group log
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogJobStartTest() throws ApiException {
        String pgId = null;
        String logPath = null;
        String hostFilter = null;
        String query = null;
        Long startTimestamp = null;
        Long endTimestamp = null;
        ExtractFields extractFields = null;
        String response = 
        api.processGroupLogJobStart(pgId, logPath, hostFilter, query, startTimestamp, endTimestamp, extractFields);
        
        // TODO: test validations
    }
    
    /**
     * Gets status of the specified log analysis job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogJobStatusTest() throws ApiException {
        String pgId = null;
        String jobId = null;
        LogJobStatusResult response = 
        api.processGroupLogJobStatus(pgId, jobId);
        
        // TODO: test validations
    }
    
    /**
     * Lists all the available logs of the specified process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGroupLogListTest() throws ApiException {
        String pgId = null;
        LogList4pgResult response = 
        api.processGroupLogList(pgId);
        
        // TODO: test validations
    }
    
}