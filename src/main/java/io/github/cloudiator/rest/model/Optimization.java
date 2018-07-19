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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Superclass for polymorphism, only subtypes are allowed
 */
@ApiModel(description = "Superclass for polymorphism, only subtypes are allowed")


public class Optimization implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("type")
  private String type = null;

  /**
   * Gets or Sets objective
   */
  @JsonAdapter(ObjectiveEnum.Adapter.class)
  public enum ObjectiveEnum {
    MAXIMIZE("MAXIMIZE"),
    
    MINIMIZE("MINIMIZE");

    private String value;

    ObjectiveEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectiveEnum fromValue(String text) {
      for (ObjectiveEnum b : ObjectiveEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectiveEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectiveEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectiveEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectiveEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("objective")
  private ObjectiveEnum objective = null;

  public Optimization type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Optimization objective(ObjectiveEnum objective) {
    this.objective = objective;
    return this;
  }

   /**
   * Get objective
   * @return objective
  **/
  @ApiModelProperty(value = "")
  public ObjectiveEnum getObjective() {
    return objective;
  }

  public void setObjective(ObjectiveEnum objective) {
    this.objective = objective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Optimization optimization = (Optimization) o;
    return Objects.equals(this.type, optimization.type) &&
        Objects.equals(this.objective, optimization.objective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, objective);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Optimization {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
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
