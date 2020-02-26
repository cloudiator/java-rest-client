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
import io.github.cloudiator.rest.model.CloudAllOf;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class Cloud implements Serializable {
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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  /**
   * State of the cloud
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OK("OK"),
    
    ERROR("ERROR");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_DIAGNOSTIC = "diagnostic";
  @SerializedName(SERIALIZED_NAME_DIAGNOSTIC)
  private String diagnostic;


  public Cloud endpoint(String endpoint) {
    
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1a79a4d60de6718e8e5b326e338ae533", value = "Unique identifier for the cloud")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Cloud owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Id of the user owning this cloud. 
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the user owning this cloud. ")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public Cloud state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the cloud
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State of the cloud")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Cloud diagnostic(String diagnostic) {
    
    this.diagnostic = diagnostic;
    return this;
  }

   /**
   * Diagnostic information for the cloud
   * @return diagnostic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Diagnostic information for the cloud")

  public String getDiagnostic() {
    return diagnostic;
  }


  public void setDiagnostic(String diagnostic) {
    this.diagnostic = diagnostic;
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
        Objects.equals(this.id, cloud.id) &&
        Objects.equals(this.owner, cloud.owner) &&
        Objects.equals(this.state, cloud.state) &&
        Objects.equals(this.diagnostic, cloud.diagnostic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, cloudType, api, credential, cloudConfiguration, id, owner, state, diagnostic);
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
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    diagnostic: ").append(toIndentedString(diagnostic)).append("\n");
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

