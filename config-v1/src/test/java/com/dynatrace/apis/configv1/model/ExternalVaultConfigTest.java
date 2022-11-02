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

import com.dynatrace.apis.configv1.model.AzureClientSecretConfig;
import com.dynatrace.apis.configv1.model.HashicorpApproleConfig;
import com.dynatrace.apis.configv1.model.HashicorpCertificateConfig;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ExternalVaultConfig
 */
public class ExternalVaultConfigTest {
    private final ExternalVaultConfig model = new ExternalVaultConfig();

    /**
     * Model tests for ExternalVaultConfig
     */
    @Test
    public void testExternalVaultConfig() {
        // TODO: test ExternalVaultConfig
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
     * Test the property 'credentialsUsedForExternalSynchronization'
     */
    @Test
    public void credentialsUsedForExternalSynchronizationTest() {
        // TODO: test credentialsUsedForExternalSynchronization
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
