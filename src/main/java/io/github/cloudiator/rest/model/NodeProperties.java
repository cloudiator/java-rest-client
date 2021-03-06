/*
 * Cloudiator REST Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.rest.model.GeoLocation;
import io.github.cloudiator.rest.model.OperatingSystem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Attributes defining this node
 */
@ApiModel(description = "Attributes defining this node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class NodeProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private String providerId;

  public static final String SERIALIZED_NAME_NUMBER_OF_CORES = "numberOfCores";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_CORES)
  private Integer numberOfCores;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_DISK = "disk";
  @SerializedName(SERIALIZED_NAME_DISK)
  private Float disk;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM = "operatingSystem";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private OperatingSystem operatingSystem;

  public static final String SERIALIZED_NAME_GEO_LOCATION = "geoLocation";
  @SerializedName(SERIALIZED_NAME_GEO_LOCATION)
  private GeoLocation geoLocation;


  public NodeProperties providerId(String providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Id of the provider where this node is managed. For virtual machines this e.g. the id of the cloud. 
   * @return providerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the provider where this node is managed. For virtual machines this e.g. the id of the cloud. ")

  public String getProviderId() {
    return providerId;
  }


  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public NodeProperties numberOfCores(Integer numberOfCores) {
    
    this.numberOfCores = numberOfCores;
    return this;
  }

   /**
   * Number of cores the node has. 
   * @return numberOfCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of cores the node has. ")

  public Integer getNumberOfCores() {
    return numberOfCores;
  }


  public void setNumberOfCores(Integer numberOfCores) {
    this.numberOfCores = numberOfCores;
  }


  public NodeProperties memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Amount of RAM this node has (in MB). 
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of RAM this node has (in MB). ")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public NodeProperties disk(Float disk) {
    
    this.disk = disk;
    return this;
  }

   /**
   * Amount of disk space this node has (in GB). 
   * @return disk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of disk space this node has (in GB). ")

  public Float getDisk() {
    return disk;
  }


  public void setDisk(Float disk) {
    this.disk = disk;
  }


  public NodeProperties operatingSystem(OperatingSystem operatingSystem) {
    
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }


  public void setOperatingSystem(OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public NodeProperties geoLocation(GeoLocation geoLocation) {
    
    this.geoLocation = geoLocation;
    return this;
  }

   /**
   * Get geoLocation
   * @return geoLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }


  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeProperties nodeProperties = (NodeProperties) o;
    return Objects.equals(this.providerId, nodeProperties.providerId) &&
        Objects.equals(this.numberOfCores, nodeProperties.numberOfCores) &&
        Objects.equals(this.memory, nodeProperties.memory) &&
        Objects.equals(this.disk, nodeProperties.disk) &&
        Objects.equals(this.operatingSystem, nodeProperties.operatingSystem) &&
        Objects.equals(this.geoLocation, nodeProperties.geoLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, numberOfCores, memory, disk, operatingSystem, geoLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeProperties {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    numberOfCores: ").append(toIndentedString(numberOfCores)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

