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

import com.dynatrace.apis.configv1.model.ExceptionPattern;
import com.dynatrace.apis.configv1.model.FdpTagCondition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Model tests for FailureDetectionParameterSet
 */
public class FailureDetectionParameterSetTest {
    private final FailureDetectionParameterSet model = new FailureDetectionParameterSet();

    /**
     * Model tests for FailureDetectionParameterSet
     */
    @Test
    public void testFailureDetectionParameterSet() {
        // TODO: test FailureDetectionParameterSet
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'clientSideMissingHttpCodeIsFailure'
     */
    @Test
    public void clientSideMissingHttpCodeIsFailureTest() {
        // TODO: test clientSideMissingHttpCodeIsFailure
    }

    /**
     * Test the property 'serverSideMissingHttpCodeIsFailure'
     */
    @Test
    public void serverSideMissingHttpCodeIsFailureTest() {
        // TODO: test serverSideMissingHttpCodeIsFailure
    }

    /**
     * Test the property 'failingHttpCodesClientSide'
     */
    @Test
    public void failingHttpCodesClientSideTest() {
        // TODO: test failingHttpCodesClientSide
    }

    /**
     * Test the property 'failingHttpCodesServerSide'
     */
    @Test
    public void failingHttpCodesServerSideTest() {
        // TODO: test failingHttpCodesServerSide
    }

    /**
     * Test the property 'http404NotFoundFailureEnabled'
     */
    @Test
    public void http404NotFoundFailureEnabledTest() {
        // TODO: test http404NotFoundFailureEnabled
    }

    /**
     * Test the property 'brokenLinkDomains'
     */
    @Test
    public void brokenLinkDomainsTest() {
        // TODO: test brokenLinkDomains
    }

    /**
     * Test the property 'ignoreAllExceptions'
     */
    @Test
    public void ignoreAllExceptionsTest() {
        // TODO: test ignoreAllExceptions
    }

    /**
     * Test the property 'successForcingExceptionPatterns'
     */
    @Test
    public void successForcingExceptionPatternsTest() {
        // TODO: test successForcingExceptionPatterns
    }

    /**
     * Test the property 'ignoredExceptionPatterns'
     */
    @Test
    public void ignoredExceptionPatternsTest() {
        // TODO: test ignoredExceptionPatterns
    }

    /**
     * Test the property 'exceptionOnAnyNodeExceptionPatterns'
     */
    @Test
    public void exceptionOnAnyNodeExceptionPatternsTest() {
        // TODO: test exceptionOnAnyNodeExceptionPatterns
    }

    /**
     * Test the property 'tagConditions'
     */
    @Test
    public void tagConditionsTest() {
        // TODO: test tagConditions
    }

    /**
     * Test the property 'ignoreSpanFailureDetection'
     */
    @Test
    public void ignoreSpanFailureDetectionTest() {
        // TODO: test ignoreSpanFailureDetection
    }

}