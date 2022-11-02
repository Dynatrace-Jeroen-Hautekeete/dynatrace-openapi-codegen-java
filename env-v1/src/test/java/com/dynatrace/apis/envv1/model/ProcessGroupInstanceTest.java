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

import com.dynatrace.apis.envv1.model.AgentVersion;
import com.dynatrace.apis.envv1.model.EntityShortRepresentation;
import com.dynatrace.apis.envv1.model.MonitoringState;
import com.dynatrace.apis.envv1.model.ProcessGroupInstanceFromRelationships;
import com.dynatrace.apis.envv1.model.ProcessGroupInstanceModule;
import com.dynatrace.apis.envv1.model.ProcessGroupInstanceToRelationships;
import com.dynatrace.apis.envv1.model.ProcessGroupMetadata;
import com.dynatrace.apis.envv1.model.TagInfo;
import com.dynatrace.apis.envv1.model.TechnologyInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Model tests for ProcessGroupInstance
 */
public class ProcessGroupInstanceTest {
    private final ProcessGroupInstance model = new ProcessGroupInstance();

    /**
     * Model tests for ProcessGroupInstance
     */
    @Test
    public void testProcessGroupInstance() {
        // TODO: test ProcessGroupInstance
    }

    /**
     * Test the property 'entityId'
     */
    @Test
    public void entityIdTest() {
        // TODO: test entityId
    }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
        // TODO: test displayName
    }

    /**
     * Test the property 'customizedName'
     */
    @Test
    public void customizedNameTest() {
        // TODO: test customizedName
    }

    /**
     * Test the property 'discoveredName'
     */
    @Test
    public void discoveredNameTest() {
        // TODO: test discoveredName
    }

    /**
     * Test the property 'firstSeenTimestamp'
     */
    @Test
    public void firstSeenTimestampTest() {
        // TODO: test firstSeenTimestamp
    }

    /**
     * Test the property 'lastSeenTimestamp'
     */
    @Test
    public void lastSeenTimestampTest() {
        // TODO: test lastSeenTimestamp
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'fromRelationships'
     */
    @Test
    public void fromRelationshipsTest() {
        // TODO: test fromRelationships
    }

    /**
     * Test the property 'toRelationships'
     */
    @Test
    public void toRelationshipsTest() {
        // TODO: test toRelationships
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'monitoringState'
     */
    @Test
    public void monitoringStateTest() {
        // TODO: test monitoringState
    }

    /**
     * Test the property 'listenPorts'
     */
    @Test
    public void listenPortsTest() {
        // TODO: test listenPorts
    }

    /**
     * Test the property 'agentVersions'
     */
    @Test
    public void agentVersionsTest() {
        // TODO: test agentVersions
    }

    /**
     * Test the property 'azureHostName'
     */
    @Test
    public void azureHostNameTest() {
        // TODO: test azureHostName
    }

    /**
     * Test the property 'azureSiteName'
     */
    @Test
    public void azureSiteNameTest() {
        // TODO: test azureSiteName
    }

    /**
     * Test the property 'versionedModules'
     */
    @Test
    public void versionedModulesTest() {
        // TODO: test versionedModules
    }

    /**
     * Test the property 'bitness'
     */
    @Test
    public void bitnessTest() {
        // TODO: test bitness
    }

    /**
     * Test the property 'modules'
     */
    @Test
    public void modulesTest() {
        // TODO: test modules
    }

    /**
     * Test the property 'softwareTechnologies'
     */
    @Test
    public void softwareTechnologiesTest() {
        // TODO: test softwareTechnologies
    }

    /**
     * Test the property 'managementZones'
     */
    @Test
    public void managementZonesTest() {
        // TODO: test managementZones
    }

}
