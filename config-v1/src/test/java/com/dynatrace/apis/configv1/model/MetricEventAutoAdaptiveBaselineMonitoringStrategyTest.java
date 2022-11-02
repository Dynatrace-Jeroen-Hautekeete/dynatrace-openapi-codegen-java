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

import com.dynatrace.apis.configv1.model.MetricEventMonitoringStrategy;
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
 * Model tests for MetricEventAutoAdaptiveBaselineMonitoringStrategy
 */
public class MetricEventAutoAdaptiveBaselineMonitoringStrategyTest {
    private final MetricEventAutoAdaptiveBaselineMonitoringStrategy model = new MetricEventAutoAdaptiveBaselineMonitoringStrategy();

    /**
     * Model tests for MetricEventAutoAdaptiveBaselineMonitoringStrategy
     */
    @Test
    public void testMetricEventAutoAdaptiveBaselineMonitoringStrategy() {
        // TODO: test MetricEventAutoAdaptiveBaselineMonitoringStrategy
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'samples'
     */
    @Test
    public void samplesTest() {
        // TODO: test samples
    }

    /**
     * Test the property 'violatingSamples'
     */
    @Test
    public void violatingSamplesTest() {
        // TODO: test violatingSamples
    }

    /**
     * Test the property 'dealertingSamples'
     */
    @Test
    public void dealertingSamplesTest() {
        // TODO: test dealertingSamples
    }

    /**
     * Test the property 'alertCondition'
     */
    @Test
    public void alertConditionTest() {
        // TODO: test alertCondition
    }

    /**
     * Test the property 'alertingOnMissingData'
     */
    @Test
    public void alertingOnMissingDataTest() {
        // TODO: test alertingOnMissingData
    }

    /**
     * Test the property 'numberOfSignalFluctuations'
     */
    @Test
    public void numberOfSignalFluctuationsTest() {
        // TODO: test numberOfSignalFluctuations
    }

}
