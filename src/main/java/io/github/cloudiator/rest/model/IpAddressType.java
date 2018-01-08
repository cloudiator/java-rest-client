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

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets IpAddressType
 */
@JsonAdapter(IpAddressType.Adapter.class)
public enum IpAddressType {
  
  PUBLIC_IP("PUBLIC_IP"),
  
  PRIVATE_IP("PRIVATE_IP");

  private String value;

  IpAddressType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IpAddressType fromValue(String text) {
    for (IpAddressType b : IpAddressType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IpAddressType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IpAddressType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IpAddressType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IpAddressType.fromValue(String.valueOf(value));
    }
  }
}

