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
import com.dynatrace.apis.envv2.model.RemediationItemList;
import com.dynatrace.apis.envv2.model.RemediationItemMuteStateChange;
import com.dynatrace.apis.envv2.model.SecurityProblemDetails;
import com.dynatrace.apis.envv2.model.SecurityProblemList;
import com.dynatrace.apis.envv2.model.SecurityProblemMute;
import com.dynatrace.apis.envv2.model.SecurityProblemUnmute;
import com.dynatrace.apis.envv2.model.VulnerableFunctionsContainer;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SecurityProblemsApi
 */
@Ignore
public class SecurityProblemsApiTest {

    private final SecurityProblemsApi api = new SecurityProblemsApi();

    
    /**
     * Lists remediation items of a third-party security problem | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemediationItemsTest() throws ApiException {
        String id = null;
        String remediationItemSelector = null;
        RemediationItemList response = 
        api.getRemediationItems(id, remediationItemSelector);
        
        // TODO: test validations
    }
    
    /**
     * Gets parameters of a security problem | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityProblemTest() throws ApiException {
        String id = null;
        String fields = null;
        String from = null;
        SecurityProblemDetails response = 
        api.getSecurityProblem(id, fields, from);
        
        // TODO: test validations
    }
    
    /**
     * Lists all security problems | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityProblemsTest() throws ApiException {
        String nextPageKey = null;
        Long pageSize = null;
        String securityProblemSelector = null;
        String sort = null;
        String fields = null;
        String from = null;
        String to = null;
        SecurityProblemList response = 
        api.getSecurityProblems(nextPageKey, pageSize, securityProblemSelector, sort, fields, from, to);
        
        // TODO: test validations
    }
    
    /**
     * Lists all vulnerable functions and their usage for a third-party security problem | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVulnerableFunctionsTest() throws ApiException {
        String id = null;
        String vulnerableFunctionsSelector = null;
        String groupBy = null;
        VulnerableFunctionsContainer response = 
        api.getVulnerableFunctions(id, vulnerableFunctionsSelector, groupBy);
        
        // TODO: test validations
    }
    
    /**
     * Mutes a security problem | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void muteSecurityProblemTest() throws ApiException {
        String id = null;
        SecurityProblemMute securityProblemMute = null;
        
        api.muteSecurityProblem(id, securityProblemMute);
        
        // TODO: test validations
    }
    
    /**
     * Sets the mute state of a remediation item | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRemediationItemMuteStateTest() throws ApiException {
        String id = null;
        String itemId = null;
        RemediationItemMuteStateChange remediationItemMuteStateChange = null;
        
        api.setRemediationItemMuteState(id, itemId, remediationItemMuteStateChange);
        
        // TODO: test validations
    }
    
    /**
     * Un-mutes a security problem | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unmuteSecurityProblemTest() throws ApiException {
        String id = null;
        SecurityProblemUnmute securityProblemUnmute = null;
        
        api.unmuteSecurityProblem(id, securityProblemUnmute);
        
        // TODO: test validations
    }
    
}