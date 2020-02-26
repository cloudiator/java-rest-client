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
import io.github.cloudiator.rest.model.Api;
import io.github.cloudiator.rest.model.CloudConfiguration;
import io.github.cloudiator.rest.model.CloudCredential;
import io.github.cloudiator.rest.model.CloudType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Represents a new cloud that is to be created 
 */
@ApiModel(description = "Represents a new cloud that is to be created ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class NewCloud implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_CLOUD_TYPE = "cloudType";
  @SerializedName(SERIALIZED_NAME_CLOUD_TYPE)
  private CloudType cloudType;

  public static final String SERIALIZED_NAME_API = "api";
  @SerializedName(SERIALIZED_NAME_API)
  private Api api;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  private CloudCredential credential;

  public static final String SERIALIZED_NAME_CLOUD_CONFIGURATION = "cloudConfiguration";
  @SerializedName(SERIALIZED_NAME_CLOUD_CONFIGURATION)
  private CloudConfiguration cloudConfiguration;


  public NewCloud endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * URI where the api of this cloud provider can be accessed.
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://endpoint.example.com", value = "URI where the api of this cloud provider can be accessed.")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public NewCloud cloudType(CloudType cloudType) {
    
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


  public NewCloud api(Api api) {
    
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


  public NewCloud credential(CloudCredential credential) {
    
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


  public NewCloud cloudConfiguration(CloudConfiguration cloudConfiguration) {
    
    this.cloudConfiguration = cloudConfiguration;
    return this;
  }

   /**
   * Get cloudConfiguration
   * @return cloudConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudConfiguration getCloudConfiguration() {
    return cloudConfiguration;
  }


  public void setCloudConfiguration(CloudConfiguration cloudConfiguration) {
    this.cloudConfiguration = cloudConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewCloud newCloud = (NewCloud) o;
    return Objects.equals(this.endpoint, newCloud.endpoint) &&
        Objects.equals(this.cloudType, newCloud.cloudType) &&
        Objects.equals(this.api, newCloud.api) &&
        Objects.equals(this.credential, newCloud.credential) &&
        Objects.equals(this.cloudConfiguration, newCloud.cloudConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, cloudType, api, credential, cloudConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewCloud {\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    cloudConfiguration: ").append(toIndentedString(cloudConfiguration)).append("\n");
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

