/*
 * Cloudiator REST Api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.rest.model.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Represents a hardware offer by a cloud 
 */
@ApiModel(description = "Represents a hardware offer by a cloud ")

public class Hardware implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("providerId")
  private String providerId = null;

  @SerializedName("cores")
  private Integer cores = null;

  @SerializedName("ram")
  private Long ram = null;

  @SerializedName("disk")
  private Double disk = null;

  @SerializedName("location")
  private Location location = null;

  public Hardware id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the hardware
   * @return id
  **/
  @ApiModelProperty(example = "1a79a4d60de6718e8e5b326e338ae533/RegionOne/1", required = true, value = "Unique identifier for the hardware")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Hardware name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human-readable name for the hardware
   * @return name
  **/
  @ApiModelProperty(example = "m1.medium", required = true, value = "Human-readable name for the hardware")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hardware providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Original id issued by the provider
   * @return providerId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Original id issued by the provider")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public Hardware cores(Integer cores) {
    this.cores = cores;
    return this;
  }

   /**
   * Number of cores
   * @return cores
  **/
  @ApiModelProperty(example = "4", required = true, value = "Number of cores")
  public Integer getCores() {
    return cores;
  }

  public void setCores(Integer cores) {
    this.cores = cores;
  }

  public Hardware ram(Long ram) {
    this.ram = ram;
    return this;
  }

   /**
   * Amount of RAM
   * @return ram
  **/
  @ApiModelProperty(example = "2048", required = true, value = "Amount of RAM")
  public Long getRam() {
    return ram;
  }

  public void setRam(Long ram) {
    this.ram = ram;
  }

  public Hardware disk(Double disk) {
    this.disk = disk;
    return this;
  }

   /**
   * Amount of disk space
   * @return disk
  **/
  @ApiModelProperty(example = "100.0", value = "Amount of disk space")
  public Double getDisk() {
    return disk;
  }

  public void setDisk(Double disk) {
    this.disk = disk;
  }

  public Hardware location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hardware hardware = (Hardware) o;
    return Objects.equals(this.id, hardware.id) &&
        Objects.equals(this.name, hardware.name) &&
        Objects.equals(this.providerId, hardware.providerId) &&
        Objects.equals(this.cores, hardware.cores) &&
        Objects.equals(this.ram, hardware.ram) &&
        Objects.equals(this.disk, hardware.disk) &&
        Objects.equals(this.location, hardware.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, providerId, cores, ram, disk, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hardware {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

