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
import io.github.cloudiator.rest.model.CloudCredential;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Repesents a new PaaS provider to be created 
 */
@ApiModel(description = "Repesents a new PaaS provider to be created ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class NewPlatform implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * PaaS stack type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HEROKU("HEROKU"),
    
    OPENSHIFT("OPENSHIFT"),
    
    CLOUDFOUNDRY("CLOUDFOUNDRY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_API = "api";
  @SerializedName(SERIALIZED_NAME_API)
  private Api api;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  private CloudCredential credential;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;


  public NewPlatform name(String name) {
    
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


  public NewPlatform type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * PaaS stack type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PaaS stack type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public NewPlatform api(Api api) {
    
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


  public NewPlatform credential(CloudCredential credential) {
    
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


  public NewPlatform endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * URI where the api of this platform provider can be accessed.
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://endpoint.example.com", value = "URI where the api of this platform provider can be accessed.")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPlatform newPlatform = (NewPlatform) o;
    return Objects.equals(this.name, newPlatform.name) &&
        Objects.equals(this.type, newPlatform.type) &&
        Objects.equals(this.api, newPlatform.api) &&
        Objects.equals(this.credential, newPlatform.credential) &&
        Objects.equals(this.endpoint, newPlatform.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, api, credential, endpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPlatform {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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

