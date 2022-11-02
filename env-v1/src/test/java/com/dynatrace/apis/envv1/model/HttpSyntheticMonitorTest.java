/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/xc03k3c).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv1.model;

import com.dynatrace.apis.envv1.model.AnomalyDetection;
import com.dynatrace.apis.envv1.model.ManagementZone;
import com.dynatrace.apis.envv1.model.RequestDto;
import com.dynatrace.apis.envv1.model.SyntheticMonitor;
import com.dynatrace.apis.envv1.model.TagWithSourceInfo;
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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for HttpSyntheticMonitor
 */
public class HttpSyntheticMonitorTest {
    private final HttpSyntheticMonitor model = new HttpSyntheticMonitor();

    /**
     * Model tests for HttpSyntheticMonitor
     */
    @Test
    public void testHttpSyntheticMonitor() {
        // TODO: test HttpSyntheticMonitor
    }

    /**
     * Test the property 'entityId'
     */
    @Test
    public void entityIdTest() {
        // TODO: test entityId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'frequencyMin'
     */
    @Test
    public void frequencyMinTest() {
        // TODO: test frequencyMin
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'createdFrom'
     */
    @Test
    public void createdFromTest() {
        // TODO: test createdFrom
    }

    /**
     * Test the property 'script'
     */
    @Test
    public void scriptTest() {
        // TODO: test script
    }

    /**
     * Test the property 'locations'
     */
    @Test
    public void locationsTest() {
        // TODO: test locations
    }

    /**
     * Test the property 'anomalyDetection'
     */
    @Test
    public void anomalyDetectionTest() {
        // TODO: test anomalyDetection
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'managementZones'
     */
    @Test
    public void managementZonesTest() {
        // TODO: test managementZones
    }

    /**
     * Test the property 'automaticallyAssignedApps'
     */
    @Test
    public void automaticallyAssignedAppsTest() {
        // TODO: test automaticallyAssignedApps
    }

    /**
     * Test the property 'manuallyAssignedApps'
     */
    @Test
    public void manuallyAssignedAppsTest() {
        // TODO: test manuallyAssignedApps
    }

    /**
     * Test the property 'requests'
     */
    @Test
    public void requestsTest() {
        // TODO: test requests
    }

}