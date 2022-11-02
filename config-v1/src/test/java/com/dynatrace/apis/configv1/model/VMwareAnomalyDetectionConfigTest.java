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
import com.dynatrace.apis.configv1.model.DroppedPacketsDetectionConfig;
import com.dynatrace.apis.configv1.model.EsxiHighCpuSaturationConfig;
import com.dynatrace.apis.configv1.model.EsxiHighMemoryDetectionConfig;
import com.dynatrace.apis.configv1.model.GuestCPULimitReachedConfig;
import com.dynatrace.apis.configv1.model.LowDatastoreSpaceDetectionConfig;
import com.dynatrace.apis.configv1.model.OverloadedStorageDetectionConfig;
import com.dynatrace.apis.configv1.model.SlowPhysicalStorageDetectionConfig;
import com.dynatrace.apis.configv1.model.UndersizedStorageDetectionConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for VMwareAnomalyDetectionConfig
 */
public class VMwareAnomalyDetectionConfigTest {
    private final VMwareAnomalyDetectionConfig model = new VMwareAnomalyDetectionConfig();

    /**
     * Model tests for VMwareAnomalyDetectionConfig
     */
    @Test
    public void testVMwareAnomalyDetectionConfig() {
        // TODO: test VMwareAnomalyDetectionConfig
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'esxiHighCpuSaturation'
     */
    @Test
    public void esxiHighCpuSaturationTest() {
        // TODO: test esxiHighCpuSaturation
    }

    /**
     * Test the property 'guestCpuLimitReached'
     */
    @Test
    public void guestCpuLimitReachedTest() {
        // TODO: test guestCpuLimitReached
    }

    /**
     * Test the property 'esxiHighMemoryDetection'
     */
    @Test
    public void esxiHighMemoryDetectionTest() {
        // TODO: test esxiHighMemoryDetection
    }

    /**
     * Test the property 'overloadedStorageDetection'
     */
    @Test
    public void overloadedStorageDetectionTest() {
        // TODO: test overloadedStorageDetection
    }

    /**
     * Test the property 'undersizedStorageDetection'
     */
    @Test
    public void undersizedStorageDetectionTest() {
        // TODO: test undersizedStorageDetection
    }

    /**
     * Test the property 'slowPhysicalStorageDetection'
     */
    @Test
    public void slowPhysicalStorageDetectionTest() {
        // TODO: test slowPhysicalStorageDetection
    }

    /**
     * Test the property 'droppedPacketsDetection'
     */
    @Test
    public void droppedPacketsDetectionTest() {
        // TODO: test droppedPacketsDetection
    }

    /**
     * Test the property 'lowDatastoreSpaceDetection'
     */
    @Test
    public void lowDatastoreSpaceDetectionTest() {
        // TODO: test lowDatastoreSpaceDetection
    }

}