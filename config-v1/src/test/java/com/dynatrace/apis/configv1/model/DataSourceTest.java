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

import com.dynatrace.apis.configv1.model.CapturedMethod;
import com.dynatrace.apis.configv1.model.ScopeConditions;
import com.dynatrace.apis.configv1.model.ValueCondition;
import com.dynatrace.apis.configv1.model.ValueProcessing;
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
 * Model tests for DataSource
 */
public class DataSourceTest {
    private final DataSource model = new DataSource();

    /**
     * Model tests for DataSource
     */
    @Test
    public void testDataSource() {
        // TODO: test DataSource
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'valueProcessing'
     */
    @Test
    public void valueProcessingTest() {
        // TODO: test valueProcessing
    }

    /**
     * Test the property 'technology'
     */
    @Test
    public void technologyTest() {
        // TODO: test technology
    }

    /**
     * Test the property 'sessionAttributeTechnology'
     */
    @Test
    public void sessionAttributeTechnologyTest() {
        // TODO: test sessionAttributeTechnology
    }

    /**
     * Test the property 'serverVariableTechnology'
     */
    @Test
    public void serverVariableTechnologyTest() {
        // TODO: test serverVariableTechnology
    }

    /**
     * Test the property 'methods'
     */
    @Test
    public void methodsTest() {
        // TODO: test methods
    }

    /**
     * Test the property 'parameterName'
     */
    @Test
    public void parameterNameTest() {
        // TODO: test parameterName
    }

    /**
     * Test the property 'scope'
     */
    @Test
    public void scopeTest() {
        // TODO: test scope
    }

    /**
     * Test the property 'capturingAndStorageLocation'
     */
    @Test
    public void capturingAndStorageLocationTest() {
        // TODO: test capturingAndStorageLocation
    }

    /**
     * Test the property 'iibNodeType'
     */
    @Test
    public void iibNodeTypeTest() {
        // TODO: test iibNodeType
    }

    /**
     * Test the property 'iibMethodNodeCondition'
     */
    @Test
    public void iibMethodNodeConditionTest() {
        // TODO: test iibMethodNodeCondition
    }

    /**
     * Test the property 'cicsSDKMethodNodeCondition'
     */
    @Test
    public void cicsSDKMethodNodeConditionTest() {
        // TODO: test cicsSDKMethodNodeCondition
    }

    /**
     * Test the property 'iibLabelMethodNodeCondition'
     */
    @Test
    public void iibLabelMethodNodeConditionTest() {
        // TODO: test iibLabelMethodNodeCondition
    }

    /**
     * Test the property 'spanAttributeKey'
     */
    @Test
    public void spanAttributeKeyTest() {
        // TODO: test spanAttributeKey
    }

    /**
     * Test the property 'cicsTransactionCallType'
     */
    @Test
    public void cicsTransactionCallTypeTest() {
        // TODO: test cicsTransactionCallType
    }

    /**
     * Test the property 'imsTransactionCallType'
     */
    @Test
    public void imsTransactionCallTypeTest() {
        // TODO: test imsTransactionCallType
    }

}