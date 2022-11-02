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
import com.dynatrace.apis.envv1.model.CreateToken;
import com.dynatrace.apis.envv1.model.ErrorEnvelope;
import java.util.Set;
import com.dynatrace.apis.envv1.model.StubList;
import com.dynatrace.apis.envv1.model.Token;
import com.dynatrace.apis.envv1.model.TokenMetadata;
import com.dynatrace.apis.envv1.model.UpdateToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for TokensApi
 */
@Ignore
public class TokensApiTest {

    private final TokensApi api = new TokensApi();

    
    /**
     * Creates a new token
     *
     * The newly created token will be owned by the same user who owns the token used for authentication of the call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTokenTest() throws ApiException {
        CreateToken createToken = null;
        Token response = 
        api.createToken(createToken);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTokenTest() throws ApiException {
        String id = null;
        
        api.deleteToken(id);
        
        // TODO: test validations
    }
    
    /**
     * Lists token metadata by token ID
     *
     * The token itself is **not** exposed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenMetadataTest() throws ApiException {
        String id = null;
        TokenMetadata response = 
        api.getTokenMetadata(id);
        
        // TODO: test validations
    }
    
    /**
     * Lists token metadata by token itself
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenMetadataBySecretTest() throws ApiException {
        Token token = null;
        TokenMetadata response = 
        api.getTokenMetadataBySecret(token);
        
        // TODO: test validations
    }
    
    /**
     * Lists available tokens in your environment
     *
     * You can narrow down the output by adding parameters. The token has to match *all* the specified parameters.    You can also specify the limit of returned tokens.   **This list may contain tokens which were created automatically** (e.g. InstallerDownload, Mobile, ...) and are not visible on the &#x60;Settings&#x60; page. Deleting those might have unintended side-effects as they might still be in use.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTokensTest() throws ApiException {
        Integer limit = null;
        String user = null;
        Set<String> permissions = null;
        Long from = null;
        Long to = null;
        StubList response = 
        api.listTokens(limit, user, permissions, from, to);
        
        // TODO: test validations
    }
    
    /**
     * Updates the specified token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTokenTest() throws ApiException {
        String id = null;
        UpdateToken updateToken = null;
        
        api.updateToken(id, updateToken);
        
        // TODO: test validations
    }
    
}
