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

import com.dynatrace.apis.configv1.model.FdpTagDoubleEquals;
import com.dynatrace.apis.configv1.model.FdpTagDoubleExists;
import com.dynatrace.apis.configv1.model.FdpTagDoubleGreaterThan;
import com.dynatrace.apis.configv1.model.FdpTagDoubleGreaterThanOrEqual;
import com.dynatrace.apis.configv1.model.FdpTagDoubleLessThan;
import com.dynatrace.apis.configv1.model.FdpTagDoubleLessThanOrEqual;
import com.dynatrace.apis.configv1.model.FdpTagIntegerEquals;
import com.dynatrace.apis.configv1.model.FdpTagIntegerExists;
import com.dynatrace.apis.configv1.model.FdpTagIntegerGreaterThan;
import com.dynatrace.apis.configv1.model.FdpTagIntegerGreaterThanOrEqual;
import com.dynatrace.apis.configv1.model.FdpTagIntegerLessThan;
import com.dynatrace.apis.configv1.model.FdpTagIntegerLessThanOrEqual;
import com.dynatrace.apis.configv1.model.FdpTagStringContainsSubstring;
import com.dynatrace.apis.configv1.model.FdpTagStringEndsWith;
import com.dynatrace.apis.configv1.model.FdpTagStringEquals;
import com.dynatrace.apis.configv1.model.FdpTagStringExists;
import com.dynatrace.apis.configv1.model.FdpTagStringStartsWith;
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
 * Model tests for FdpTagPredicate
 */
public class FdpTagPredicateTest {
    private final FdpTagPredicate model = new FdpTagPredicate();

    /**
     * Model tests for FdpTagPredicate
     */
    @Test
    public void testFdpTagPredicate() {
        // TODO: test FdpTagPredicate
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}