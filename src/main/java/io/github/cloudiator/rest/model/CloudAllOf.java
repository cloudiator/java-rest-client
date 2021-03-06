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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * CloudAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class CloudAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

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


  public CloudAllOf id(String id) {
    
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


  public CloudAllOf owner(String owner) {
    
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


  public CloudAllOf state(StateEnum state) {
    
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


  public CloudAllOf diagnostic(String diagnostic) {
    
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
    CloudAllOf cloudAllOf = (CloudAllOf) o;
    return Objects.equals(this.id, cloudAllOf.id) &&
        Objects.equals(this.owner, cloudAllOf.owner) &&
        Objects.equals(this.state, cloudAllOf.state) &&
        Objects.equals(this.diagnostic, cloudAllOf.diagnostic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, state, diagnostic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAllOf {\n");
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

