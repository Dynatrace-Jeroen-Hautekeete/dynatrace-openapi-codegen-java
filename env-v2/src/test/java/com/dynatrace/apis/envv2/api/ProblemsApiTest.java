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
import com.dynatrace.apis.envv2.model.Comment;
import com.dynatrace.apis.envv2.model.CommentRequestDtoImpl;
import com.dynatrace.apis.envv2.model.CommentsList;
import com.dynatrace.apis.envv2.model.Problem;
import com.dynatrace.apis.envv2.model.ProblemCloseRequestDtoImpl;
import com.dynatrace.apis.envv2.model.ProblemCloseResult;
import com.dynatrace.apis.envv2.model.Problems;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ProblemsApi
 */
@Ignore
public class ProblemsApiTest {

    private final ProblemsApi api = new ProblemsApi();

    
    /**
     * Closes the specified problem and adds a closing comment on it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void closeProblemTest() throws ApiException {
        String problemId = null;
        ProblemCloseRequestDtoImpl problemCloseRequestDtoImpl = null;
        ProblemCloseResult response = 
        api.closeProblem(problemId, problemCloseRequestDtoImpl);
        
        // TODO: test validations
    }
    
    /**
     * Adds a new comment on the specified problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCommentTest() throws ApiException {
        String problemId = null;
        CommentRequestDtoImpl commentRequestDtoImpl = null;
        
        api.createComment(problemId, commentRequestDtoImpl);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified comment from a problem
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
     * Gets the specified comment on a problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentTest() throws ApiException {
        String problemId = null;
        String commentId = null;
        Comment response = 
        api.getComment(problemId, commentId);
        
        // TODO: test validations
    }
    
    /**
     * Gets all comments on the specified problem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        String problemId = null;
        String nextPageKey = null;
        Long pageSize = null;
        CommentsList response = 
        api.getComments(problemId, nextPageKey, pageSize);
        
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
    public void getProblemTest() throws ApiException {
        String problemId = null;
        String fields = null;
        Problem response = 
        api.getProblem(problemId, fields);
        
        // TODO: test validations
    }
    
    /**
     * Lists problems observed within the specified timeframe
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProblemsTest() throws ApiException {
        String fields = null;
        String nextPageKey = null;
        Long pageSize = null;
        String from = null;
        String to = null;
        String problemSelector = null;
        String entitySelector = null;
        String sort = null;
        Problems response = 
        api.getProblems(fields, nextPageKey, pageSize, from, to, problemSelector, entitySelector, sort);
        
        // TODO: test validations
    }
    
    /**
     * Updates the specified comment on a problem
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
        CommentRequestDtoImpl commentRequestDtoImpl = null;
        
        api.updateComment(problemId, commentId, commentRequestDtoImpl);
        
        // TODO: test validations
    }
    
}