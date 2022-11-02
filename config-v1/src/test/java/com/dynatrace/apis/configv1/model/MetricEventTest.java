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

import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
import com.dynatrace.apis.configv1.model.MetricEventAlertingScope;
import com.dynatrace.apis.configv1.model.MetricEventDimensions;
import com.dynatrace.apis.configv1.model.MetricEventMonitoringStrategy;
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
 * Model tests for MetricEvent
 */
public class MetricEventTest {
    private final MetricEvent model = new MetricEvent();

    /**
     * Model tests for MetricEvent
     */
    @Test
    public void testMetricEvent() {
        // TODO: test MetricEvent
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'metricId'
     */
    @Test
    public void metricIdTest() {
        // TODO: test metricId
    }

    /**
     * Test the property 'metricSelector'
     */
    @Test
    public void metricSelectorTest() {
        // TODO: test metricSelector
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
     * Test the property 'aggregationType'
     */
    @Test
    public void aggregationTypeTest() {
        // TODO: test aggregationType
    }

    /**
     * Test the property 'severity'
     */
    @Test
    public void severityTest() {
        // TODO: test severity
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'disabledReason'
     */
    @Test
    public void disabledReasonTest() {
        // TODO: test disabledReason
    }

    /**
     * Test the property 'warningReason'
     */
    @Test
    public void warningReasonTest() {
        // TODO: test warningReason
    }

    /**
     * Test the property 'alertingScope'
     */
    @Test
    public void alertingScopeTest() {
        // TODO: test alertingScope
    }

    /**
     * Test the property 'metricDimensions'
     */
    @Test
    public void metricDimensionsTest() {
        // TODO: test metricDimensions
    }

    /**
     * Test the property 'monitoringStrategy'
     */
    @Test
    public void monitoringStrategyTest() {
        // TODO: test monitoringStrategy
    }

    /**
     * Test the property 'primaryDimensionKey'
     */
    @Test
    public void primaryDimensionKeyTest() {
        // TODO: test primaryDimensionKey
    }

    /**
     * Test the property 'queryOffset'
     */
    @Test
    public void queryOffsetTest() {
        // TODO: test queryOffset
    }

}