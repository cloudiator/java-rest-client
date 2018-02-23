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
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TaskType
 */
@JsonAdapter(TaskType.Adapter.class)
public enum TaskType {
  
  BATCH("BATCH"),
  
  SERVICE("SERVICE");

  private String value;

  TaskType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskType fromValue(String text) {
    for (TaskType b : TaskType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TaskType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskType.fromValue(String.valueOf(value));
    }
  }
}

