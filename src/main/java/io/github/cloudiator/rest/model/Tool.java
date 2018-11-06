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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * a Cloudiator tool to be installed on a node
 */
@JsonAdapter(Tool.Adapter.class)
public enum Tool {
  
  DOCKER("DOCKER"),
  
  KAIROSDB("KAIROSDB"),
  
  LANCE("LANCE"),
  
  VISOR("VISOR"),
  
  AXE("AXE"),
  
  SPARK_WORKER("SPARK_WORKER"),
  
  DLMS_AGENT("DLMS_AGENT"),
  
  ALLUXIO_CLIENT("ALLUXIO_CLIENT");

  private String value;

  Tool(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Tool fromValue(String text) {
    for (Tool b : Tool.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Tool> {
    @Override
    public void write(final JsonWriter jsonWriter, final Tool enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Tool read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Tool.fromValue(String.valueOf(value));
    }
  }
}
