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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * type of the cloud
 */
@JsonAdapter(CloudType.Adapter.class)
public enum CloudType {
  
  PRIVATE("PRIVATE"),
  
  PUBLIC("PUBLIC");

  private String value;

  CloudType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CloudType fromValue(String value) {
    for (CloudType b : CloudType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CloudType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CloudType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CloudType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CloudType.fromValue(value);
    }
  }
}

