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
import io.github.cloudiator.rest.model.Api;
import io.github.cloudiator.rest.model.CloudConfiguration;
import io.github.cloudiator.rest.model.CloudCredential;
import io.github.cloudiator.rest.model.CloudType;
import io.github.cloudiator.rest.model.NewCloud;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Representation of a cloud used by Cloudiator 
 */
@ApiModel(description = "Representation of a cloud used by Cloudiator ")

public class Cloud implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("cloudType")
  private CloudType cloudType = null;

  @SerializedName("api")
  private Api api = null;

  @SerializedName("credential")
  private CloudCredential credential = null;

  @SerializedName("cloudConfiguration")
  private CloudConfiguration cloudConfiguration = null;

  @SerializedName("id")
  private String id = null;

  public Cloud endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * URI where the api of this cloud provider can be accessed.
   * @return endpoint
  **/
  @ApiModelProperty(example = "https://endpoint.example.com", value = "URI where the api of this cloud provider can be accessed.")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Cloud cloudType(CloudType cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @ApiModelProperty(required = true, value = "")
  public CloudType getCloudType() {
    return cloudType;
  }

  public void setCloudType(CloudType cloudType) {
    this.cloudType = cloudType;
  }

  public Cloud api(Api api) {
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @ApiModelProperty(required = true, value = "")
  public Api getApi() {
    return api;
  }

  public void setApi(Api api) {
    this.api = api;
  }

  public Cloud credential(CloudCredential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @ApiModelProperty(required = true, value = "")
  public CloudCredential getCredential() {
    return credential;
  }

  public void setCredential(CloudCredential credential) {
    this.credential = credential;
  }

  public Cloud cloudConfiguration(CloudConfiguration cloudConfiguration) {
    this.cloudConfiguration = cloudConfiguration;
    return this;
  }

   /**
   * Get cloudConfiguration
   * @return cloudConfiguration
  **/
  @ApiModelProperty(value = "")
  public CloudConfiguration getCloudConfiguration() {
    return cloudConfiguration;
  }

  public void setCloudConfiguration(CloudConfiguration cloudConfiguration) {
    this.cloudConfiguration = cloudConfiguration;
  }

  public Cloud id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the cloud
   * @return id
  **/
  @ApiModelProperty(example = "1a79a4d60de6718e8e5b326e338ae533", value = "Unique identifier for the cloud")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.endpoint, cloud.endpoint) &&
        Objects.equals(this.cloudType, cloud.cloudType) &&
        Objects.equals(this.api, cloud.api) &&
        Objects.equals(this.credential, cloud.credential) &&
        Objects.equals(this.cloudConfiguration, cloud.cloudConfiguration) &&
        Objects.equals(this.id, cloud.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, cloudType, api, credential, cloudConfiguration, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    cloudConfiguration: ").append(toIndentedString(cloudConfiguration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

