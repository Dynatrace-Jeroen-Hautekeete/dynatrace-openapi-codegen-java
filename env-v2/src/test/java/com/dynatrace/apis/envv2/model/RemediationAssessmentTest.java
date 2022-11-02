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

import com.dynatrace.apis.envv2.model.VulnerableFunction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Model tests for RemediationAssessment
 */
public class RemediationAssessmentTest {
    private final RemediationAssessment model = new RemediationAssessment();

    /**
     * Model tests for RemediationAssessment
     */
    @Test
    public void testRemediationAssessment() {
        // TODO: test RemediationAssessment
    }

    /**
     * Test the property 'exposure'
     */
    @Test
    public void exposureTest() {
        // TODO: test exposure
    }

    /**
     * Test the property 'dataAssets'
     */
    @Test
    public void dataAssetsTest() {
        // TODO: test dataAssets
    }

    /**
     * Test the property 'numberOfDataAssets'
     */
    @Test
    public void numberOfDataAssetsTest() {
        // TODO: test numberOfDataAssets
    }

    /**
     * Test the property 'vulnerableFunctionUsage'
     */
    @Test
    public void vulnerableFunctionUsageTest() {
        // TODO: test vulnerableFunctionUsage
    }

    /**
     * Test the property 'vulnerableFunctionsInUse'
     */
    @Test
    public void vulnerableFunctionsInUseTest() {
        // TODO: test vulnerableFunctionsInUse
    }

    /**
     * Test the property 'vulnerableFunctionsNotInUse'
     */
    @Test
    public void vulnerableFunctionsNotInUseTest() {
        // TODO: test vulnerableFunctionsNotInUse
    }

    /**
     * Test the property 'vulnerableFunctionsNotAvailable'
     */
    @Test
    public void vulnerableFunctionsNotAvailableTest() {
        // TODO: test vulnerableFunctionsNotAvailable
    }

}