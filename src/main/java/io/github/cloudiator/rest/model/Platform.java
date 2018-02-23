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
import io.github.cloudiator.rest.model.CloudCredential;
import io.github.cloudiator.rest.model.NewPlatform;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Representation of a platform used by Cloudiator
 */
@ApiModel(description = "Representation of a platform used by Cloudiator")

public class Platform implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

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

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("api")
  private Api api = null;

  @SerializedName("credential")
  private CloudCredential credential = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("id")
  private String id = null;

  public Platform name(String name) {
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

  public Platform type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * PaaS stack type
   * @return type
  **/
  @ApiModelProperty(value = "PaaS stack type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Platform api(Api api) {
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

  public Platform credential(CloudCredential credential) {
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

  public Platform endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * URI where the api of this platform provider can be accessed.
   * @return endpoint
  **/
  @ApiModelProperty(example = "https://endpoint.example.com", value = "URI where the api of this platform provider can be accessed.")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Platform id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the platform
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the platform")
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
    Platform platform = (Platform) o;
    return Objects.equals(this.name, platform.name) &&
        Objects.equals(this.type, platform.type) &&
        Objects.equals(this.api, platform.api) &&
        Objects.equals(this.credential, platform.credential) &&
        Objects.equals(this.endpoint, platform.endpoint) &&
        Objects.equals(this.id, platform.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, api, credential, endpoint, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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

