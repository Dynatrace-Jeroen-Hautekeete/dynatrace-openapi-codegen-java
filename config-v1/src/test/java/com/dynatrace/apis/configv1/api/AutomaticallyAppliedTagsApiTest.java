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
import com.dynatrace.apis.configv1.model.AutoTag;
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import com.dynatrace.apis.configv1.model.StubList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for AutomaticallyAppliedTagsApi
 */
@Ignore
public class AutomaticallyAppliedTagsApiTest {

    private final AutomaticallyAppliedTagsApi api = new AutomaticallyAppliedTagsApi();

    
    /**
     * Creates a new auto-tag
     *
     * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAutoTagTest() throws ApiException {
        AutoTag autoTag = null;
        EntityShortRepresentation response = 
        api.createAutoTag(autoTag);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified auto-tag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAutoTagTest() throws ApiException {
        UUID id = null;
        
        api.deleteAutoTag(id);
        
        // TODO: test validations
    }
    
    /**
     * Gets the properties of the specified auto-tag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAutoTagTest() throws ApiException {
        UUID id = null;
        Boolean includeProcessGroupReferences = null;
        AutoTag response = 
        api.getAutoTag(id, includeProcessGroupReferences);
        
        // TODO: test validations
    }
    
    /**
     * Lists all configured auto-tags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAutoTagsTest() throws ApiException {
        StubList response = 
        api.listAutoTags();
        
        // TODO: test validations
    }
    
    /**
     * Updates an existing auto-tag
     *
     * If the auto-tag with the specified ID does not exist, a new auto-tag is created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAutoTagTest() throws ApiException {
        UUID id = null;
        AutoTag autoTag = null;
        EntityShortRepresentation response = 
        api.updateAutoTag(id, autoTag);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;POST /autoTags&#x60; request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateCreateAutoTagTest() throws ApiException {
        AutoTag autoTag = null;
        
        api.validateCreateAutoTag(autoTag);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#x60;PUT /autoTags/{id}&#x60; request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateUpdateAutoTagTest() throws ApiException {
        UUID id = null;
        AutoTag autoTag = null;
        
        api.validateUpdateAutoTag(id, autoTag);
        
        // TODO: test validations
    }
    
}
