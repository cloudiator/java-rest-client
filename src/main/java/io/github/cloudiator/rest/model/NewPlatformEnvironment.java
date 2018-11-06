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
import io.github.cloudiator.rest.model.Platform;
import io.github.cloudiator.rest.model.PlatformHardware;
import io.github.cloudiator.rest.model.PlatformRuntime;
import io.github.cloudiator.rest.model.PlatformService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Repesents a PaaS environemnt to run an component 
 */
@ApiModel(description = "Repesents a PaaS environemnt to run an component ")

public class NewPlatformEnvironment implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  @SerializedName("platform")
  private Platform platform = null;

  @SerializedName("platformHardware")
  private PlatformHardware platformHardware = null;

  @SerializedName("platformRuntime")
  private PlatformRuntime platformRuntime = null;

  @SerializedName("platformService")
  private List<PlatformService> platformService = null;

  public NewPlatformEnvironment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human-readable name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Human-readable name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewPlatformEnvironment platform(Platform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public NewPlatformEnvironment platformHardware(PlatformHardware platformHardware) {
    this.platformHardware = platformHardware;
    return this;
  }

   /**
   * Get platformHardware
   * @return platformHardware
  **/
  @ApiModelProperty(required = true, value = "")
  public PlatformHardware getPlatformHardware() {
    return platformHardware;
  }

  public void setPlatformHardware(PlatformHardware platformHardware) {
    this.platformHardware = platformHardware;
  }

  public NewPlatformEnvironment platformRuntime(PlatformRuntime platformRuntime) {
    this.platformRuntime = platformRuntime;
    return this;
  }

   /**
   * Get platformRuntime
   * @return platformRuntime
  **/
  @ApiModelProperty(required = true, value = "")
  public PlatformRuntime getPlatformRuntime() {
    return platformRuntime;
  }

  public void setPlatformRuntime(PlatformRuntime platformRuntime) {
    this.platformRuntime = platformRuntime;
  }

  public NewPlatformEnvironment platformService(List<PlatformService> platformService) {
    this.platformService = platformService;
    return this;
  }

  public NewPlatformEnvironment addPlatformServiceItem(PlatformService platformServiceItem) {
    if (this.platformService == null) {
      this.platformService = new ArrayList<PlatformService>();
    }
    this.platformService.add(platformServiceItem);
    return this;
  }

   /**
   * Get platformService
   * @return platformService
  **/
  @ApiModelProperty(value = "")
  public List<PlatformService> getPlatformService() {
    return platformService;
  }

  public void setPlatformService(List<PlatformService> platformService) {
    this.platformService = platformService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPlatformEnvironment newPlatformEnvironment = (NewPlatformEnvironment) o;
    return Objects.equals(this.name, newPlatformEnvironment.name) &&
        Objects.equals(this.platform, newPlatformEnvironment.platform) &&
        Objects.equals(this.platformHardware, newPlatformEnvironment.platformHardware) &&
        Objects.equals(this.platformRuntime, newPlatformEnvironment.platformRuntime) &&
        Objects.equals(this.platformService, newPlatformEnvironment.platformService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, platform, platformHardware, platformRuntime, platformService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPlatformEnvironment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformHardware: ").append(toIndentedString(platformHardware)).append("\n");
    sb.append("    platformRuntime: ").append(toIndentedString(platformRuntime)).append("\n");
    sb.append("    platformService: ").append(toIndentedString(platformService)).append("\n");
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
