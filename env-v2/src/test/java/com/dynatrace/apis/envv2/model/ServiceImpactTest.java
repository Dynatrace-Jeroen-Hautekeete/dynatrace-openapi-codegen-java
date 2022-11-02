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

import com.dynatrace.apis.envv2.model.ApplicationImpact;
import com.dynatrace.apis.envv2.model.CustomApplicationImpact;
import com.dynatrace.apis.envv2.model.EntityStub;
import com.dynatrace.apis.envv2.model.Impact;
import com.dynatrace.apis.envv2.model.MobileImpact;
import com.dynatrace.apis.envv2.model.ServiceImpact;
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
 * Model tests for ServiceImpact
 */
public class ServiceImpactTest {
    private final ServiceImpact model = new ServiceImpact();

    /**
     * Model tests for ServiceImpact
     */
    @Test
    public void testServiceImpact() {
        // TODO: test ServiceImpact
    }

    /**
     * Test the property 'impactType'
     */
    @Test
    public void impactTypeTest() {
        // TODO: test impactType
    }

    /**
     * Test the property 'impactedEntity'
     */
    @Test
    public void impactedEntityTest() {
        // TODO: test impactedEntity
    }

    /**
     * Test the property 'estimatedAffectedUsers'
     */
    @Test
    public void estimatedAffectedUsersTest() {
        // TODO: test estimatedAffectedUsers
    }

    /**
     * Test the property 'numberOfPotentiallyAffectedServiceCalls'
     */
    @Test
    public void numberOfPotentiallyAffectedServiceCallsTest() {
        // TODO: test numberOfPotentiallyAffectedServiceCalls
    }

}
