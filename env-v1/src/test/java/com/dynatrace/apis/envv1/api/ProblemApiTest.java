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
import com.dynatrace.apis.envv1.model.ProblemCloseResult;
import com.dynatrace.apis.envv1.model.ProblemComment;
import com.dynatrace.apis.envv1.model.ProblemCommentList;
import com.dynatrace.apis.envv1.model.ProblemDetailsResultWrapper;
import com.dynatrace.apis.envv1.model.ProblemFeedResultWrapper;
import com.dynatrace.apis.envv1.model.ProblemStatusResultWrapper;
import com.dynatrace.apis.envv1.model.PushProblemComment;
import java.util.Set;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ProblemApi
 */
@Ignore
public class ProblemApiTest {

    private final ProblemApi api = new ProblemApi();

    
    /**
     * Closes the specified problem and adds a closing comment to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void closeProblemTest() throws ApiException {
        String problemId = null;
        String content = null;
        ProblemCloseResult response = 
        api.closeProblem(problemId, content);
        
        // TODO: test validations
    }
    
    /**
     * Deletes an existing comment to the specified problem.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        String problemId = null;
        String commentId = null;
        
        api.deleteComment(problemId, commentId);
        
        // TODO: test validations
    }
    
    /**
     * Gets all the comments to the specified problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentTest() throws ApiException {
        String problemId = null;
        ProblemCommentList response = 
        api.getComment(problemId);
        
        // TODO: test validations
    }
    
    /**
     * Gets the properties of the specified problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String problemId = null;
        ProblemDetailsResultWrapper response = 
        api.getDetails(problemId);
        
        // TODO: test validations
    }
    
    /**
     * Gets the information about problems within the specified timeframe
     *
     * A problem is included in the response, if either start or end timestamp of the problem is within the defined timeframe.   The output is limited to **5,000** problems. You can narrow it down by specifying query parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedTest() throws ApiException {
        String relativeTime = null;
        Long startTimestamp = null;
        Long endTimestamp = null;
        String status = null;
        String impactLevel = null;
        String severityLevel = null;
        Set<String> tag = null;
        Boolean expandDetails = null;
        ProblemFeedResultWrapper response = 
        api.getFeed(relativeTime, startTimestamp, endTimestamp, status, impactLevel, severityLevel, tag, expandDetails);
        
        // TODO: test validations
    }
    
    /**
     * Lists the number of open problems, split by impact level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProblemStatusTest() throws ApiException {
        ProblemStatusResultWrapper response = 
        api.getProblemStatus();
        
        // TODO: test validations
    }
    
    /**
     * Adds a new comment to the specified problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pushCommentTest() throws ApiException {
        String problemId = null;
        PushProblemComment pushProblemComment = null;
        ProblemComment response = 
        api.pushComment(problemId, pushProblemComment);
        
        // TODO: test validations
    }
    
    /**
     * Updates an existing comment to the specified problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        String problemId = null;
        String commentId = null;
        PushProblemComment pushProblemComment = null;
        ProblemComment response = 
        api.updateComment(problemId, commentId, pushProblemComment);
        
        // TODO: test validations
    }
    
}
