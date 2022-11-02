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


package com.dynatrace.apis.configv1.model;

import com.dynatrace.apis.configv1.model.AzureClientSecret;
import com.dynatrace.apis.configv1.model.ExternalVault;
import com.dynatrace.apis.configv1.model.HashicorpApprole;
import com.dynatrace.apis.configv1.model.HashicorpCertificate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for AzureClientSecret
 */
public class AzureClientSecretTest {
    private final AzureClientSecret model = new AzureClientSecret();

    /**
     * Model tests for AzureClientSecret
     */
    @Test
    public void testAzureClientSecret() {
        // TODO: test AzureClientSecret
    }

    /**
     * Test the property 'sourceAuthMethod'
     */
    @Test
    public void sourceAuthMethodTest() {
        // TODO: test sourceAuthMethod
    }

    /**
     * Test the property 'vaultUrl'
     */
    @Test
    public void vaultUrlTest() {
        // TODO: test vaultUrl
    }

    /**
     * Test the property 'usernameSecretName'
     */
    @Test
    public void usernameSecretNameTest() {
        // TODO: test usernameSecretName
    }

    /**
     * Test the property 'passwordSecretName'
     */
    @Test
    public void passwordSecretNameTest() {
        // TODO: test passwordSecretName
    }

    /**
     * Test the property 'tokenSecretName'
     */
    @Test
    public void tokenSecretNameTest() {
        // TODO: test tokenSecretName
    }

    /**
     * Test the property 'tenantId'
     */
    @Test
    public void tenantIdTest() {
        // TODO: test tenantId
    }

    /**
     * Test the property 'clientId'
     */
    @Test
    public void clientIdTest() {
        // TODO: test clientId
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    public void clientSecretTest() {
        // TODO: test clientSecret
    }

}