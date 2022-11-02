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


package com.dynatrace.apis.envv2.model;

import com.dynatrace.apis.envv2.model.CredentialUsageHandler;
import com.dynatrace.apis.envv2.model.CredentialsDetailsCertificateResponseElement;
import com.dynatrace.apis.envv2.model.CredentialsDetailsTokenResponseElement;
import com.dynatrace.apis.envv2.model.CredentialsDetailsUsernamePasswordResponseElement;
import com.dynatrace.apis.envv2.model.ExternalVaultConfig;
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
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for AbstractCredentialsResponseElement
 */
public class AbstractCredentialsResponseElementTest {
    private final AbstractCredentialsResponseElement model = new AbstractCredentialsResponseElement();

    /**
     * Model tests for AbstractCredentialsResponseElement
     */
    @Test
    public void testAbstractCredentialsResponseElement() {
        // TODO: test AbstractCredentialsResponseElement
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'owner'
     */
    @Test
    public void ownerTest() {
        // TODO: test owner
    }

    /**
     * Test the property 'ownerAccessOnly'
     */
    @Test
    public void ownerAccessOnlyTest() {
        // TODO: test ownerAccessOnly
    }

    /**
     * Test the property 'scope'
     */
    @Test
    public void scopeTest() {
        // TODO: test scope
    }

    /**
     * Test the property 'externalVault'
     */
    @Test
    public void externalVaultTest() {
        // TODO: test externalVault
    }

    /**
     * Test the property 'credentialUsageSummary'
     */
    @Test
    public void credentialUsageSummaryTest() {
        // TODO: test credentialUsageSummary
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
