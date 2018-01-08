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
import io.github.cloudiator.rest.model.OperatingSystemArchitecture;
import io.github.cloudiator.rest.model.OperatingSystemFamily;
import io.github.cloudiator.rest.model.OperatingSystemType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the operating system of an image 
 */
@ApiModel(description = "Represents the operating system of an image ")

public class OperatingSystem {
  @SerializedName("operatingSystemType")
  private OperatingSystemType operatingSystemType = null;

  @SerializedName("operatingSystemFamily")
  private OperatingSystemFamily operatingSystemFamily = null;

  @SerializedName("operatingSystemArchitecture")
  private OperatingSystemArchitecture operatingSystemArchitecture = null;

  @SerializedName("operatingSystemVersion")
  private String operatingSystemVersion = null;

  public OperatingSystem operatingSystemType(OperatingSystemType operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
    return this;
  }

   /**
   * Get operatingSystemType
   * @return operatingSystemType
  **/
  @ApiModelProperty(value = "")
  public OperatingSystemType getOperatingSystemType() {
    return operatingSystemType;
  }

  public void setOperatingSystemType(OperatingSystemType operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
  }

  public OperatingSystem operatingSystemFamily(OperatingSystemFamily operatingSystemFamily) {
    this.operatingSystemFamily = operatingSystemFamily;
    return this;
  }

   /**
   * Get operatingSystemFamily
   * @return operatingSystemFamily
  **/
  @ApiModelProperty(value = "")
  public OperatingSystemFamily getOperatingSystemFamily() {
    return operatingSystemFamily;
  }

  public void setOperatingSystemFamily(OperatingSystemFamily operatingSystemFamily) {
    this.operatingSystemFamily = operatingSystemFamily;
  }

  public OperatingSystem operatingSystemArchitecture(OperatingSystemArchitecture operatingSystemArchitecture) {
    this.operatingSystemArchitecture = operatingSystemArchitecture;
    return this;
  }

   /**
   * Get operatingSystemArchitecture
   * @return operatingSystemArchitecture
  **/
  @ApiModelProperty(value = "")
  public OperatingSystemArchitecture getOperatingSystemArchitecture() {
    return operatingSystemArchitecture;
  }

  public void setOperatingSystemArchitecture(OperatingSystemArchitecture operatingSystemArchitecture) {
    this.operatingSystemArchitecture = operatingSystemArchitecture;
  }

  public OperatingSystem operatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
    return this;
  }

   /**
   * Version of the OS
   * @return operatingSystemVersion
  **/
  @ApiModelProperty(example = "16.04 LTS", value = "Version of the OS")
  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }

  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingSystem operatingSystem = (OperatingSystem) o;
    return Objects.equals(this.operatingSystemType, operatingSystem.operatingSystemType) &&
        Objects.equals(this.operatingSystemFamily, operatingSystem.operatingSystemFamily) &&
        Objects.equals(this.operatingSystemArchitecture, operatingSystem.operatingSystemArchitecture) &&
        Objects.equals(this.operatingSystemVersion, operatingSystem.operatingSystemVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingSystemType, operatingSystemFamily, operatingSystemArchitecture, operatingSystemVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingSystem {\n");
    
    sb.append("    operatingSystemType: ").append(toIndentedString(operatingSystemType)).append("\n");
    sb.append("    operatingSystemFamily: ").append(toIndentedString(operatingSystemFamily)).append("\n");
    sb.append("    operatingSystemArchitecture: ").append(toIndentedString(operatingSystemArchitecture)).append("\n");
    sb.append("    operatingSystemVersion: ").append(toIndentedString(operatingSystemVersion)).append("\n");
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

