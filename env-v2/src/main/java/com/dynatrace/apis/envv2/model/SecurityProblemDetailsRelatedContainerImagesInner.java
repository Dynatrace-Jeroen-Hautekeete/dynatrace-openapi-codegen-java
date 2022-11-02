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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dynatrace.apis.envv2.model.RelatedContainerImage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of related container images.
 */
@ApiModel(description = "A list of related container images.")
@JsonPropertyOrder({
  SecurityProblemDetailsRelatedContainerImagesInner.JSON_PROPERTY_CONTAINER_IMAGES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SecurityProblemDetailsRelatedContainerImagesInner {
  public static final String JSON_PROPERTY_CONTAINER_IMAGES = "containerImages";
  private List<RelatedContainerImage> containerImages = null;

  public SecurityProblemDetailsRelatedContainerImagesInner() { 
  }

  @JsonCreator
  public SecurityProblemDetailsRelatedContainerImagesInner(
    @JsonProperty(JSON_PROPERTY_CONTAINER_IMAGES) List<RelatedContainerImage> containerImages
  ) {
  this();
    this.containerImages = containerImages;
  }

   /**
   * A list of related container images.
   * @return containerImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of related container images.")
  @JsonProperty(JSON_PROPERTY_CONTAINER_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RelatedContainerImage> getContainerImages() {
    return containerImages;
  }




  /**
   * Return true if this SecurityProblemDetails_relatedContainerImages_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityProblemDetailsRelatedContainerImagesInner securityProblemDetailsRelatedContainerImagesInner = (SecurityProblemDetailsRelatedContainerImagesInner) o;
    return Objects.equals(this.containerImages, securityProblemDetailsRelatedContainerImagesInner.containerImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerImages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityProblemDetailsRelatedContainerImagesInner {\n");
    sb.append("    containerImages: ").append(toIndentedString(containerImages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
