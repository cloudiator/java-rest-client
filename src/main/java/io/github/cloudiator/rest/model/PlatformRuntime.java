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
import io.github.cloudiator.rest.model.NewPlatformRuntime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Repesents a PaaS environemnt to run an component 
 */
@ApiModel(description = "Repesents a PaaS environemnt to run an component ")

public class PlatformRuntime implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("name")
  private String name = null;

  /**
   * the specific runtime language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    PHP("PHP"),
    
    JAVA("JAVA"),
    
    RUBY("RUBY"),
    
    PYTHON("PYTHON");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("language")
  private LanguageEnum language = null;

  @SerializedName("languageVersion")
  private Double languageVersion = null;

  /**
   * specifies the runtime type
   */
  @JsonAdapter(RuntimeTypeEnum.Adapter.class)
  public enum RuntimeTypeEnum {
    STANDALONE("standalone"),
    
    SERVER("server");

    private String value;

    RuntimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuntimeTypeEnum fromValue(String text) {
      for (RuntimeTypeEnum b : RuntimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RuntimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuntimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuntimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RuntimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("runtimeType")
  private RuntimeTypeEnum runtimeType = null;

  @SerializedName("version")
  private Double version = null;

  @SerializedName("id")
  private String id = null;

  public PlatformRuntime name(String name) {
    this.name = name;
    return this;
  }

   /**
   * human readable name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "human readable name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlatformRuntime language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * the specific runtime language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "the specific runtime language")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public PlatformRuntime languageVersion(Double languageVersion) {
    this.languageVersion = languageVersion;
    return this;
  }

   /**
   * language version number
   * @return languageVersion
  **/
  @ApiModelProperty(example = "11.0", value = "language version number")
  public Double getLanguageVersion() {
    return languageVersion;
  }

  public void setLanguageVersion(Double languageVersion) {
    this.languageVersion = languageVersion;
  }

  public PlatformRuntime runtimeType(RuntimeTypeEnum runtimeType) {
    this.runtimeType = runtimeType;
    return this;
  }

   /**
   * specifies the runtime type
   * @return runtimeType
  **/
  @ApiModelProperty(required = true, value = "specifies the runtime type")
  public RuntimeTypeEnum getRuntimeType() {
    return runtimeType;
  }

  public void setRuntimeType(RuntimeTypeEnum runtimeType) {
    this.runtimeType = runtimeType;
  }

  public PlatformRuntime version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * the version of the specified type
   * @return version
  **/
  @ApiModelProperty(example = "2.0", required = true, value = "the version of the specified type")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PlatformRuntime id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the hardwareRuntime
   * @return id
  **/
  @ApiModelProperty(example = "1a79a4d60de6718e8e5b326e33812345/example.p1", value = "Unique identifier for the hardwareRuntime")
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
    PlatformRuntime platformRuntime = (PlatformRuntime) o;
    return Objects.equals(this.name, platformRuntime.name) &&
        Objects.equals(this.language, platformRuntime.language) &&
        Objects.equals(this.languageVersion, platformRuntime.languageVersion) &&
        Objects.equals(this.runtimeType, platformRuntime.runtimeType) &&
        Objects.equals(this.version, platformRuntime.version) &&
        Objects.equals(this.id, platformRuntime.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language, languageVersion, runtimeType, version, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformRuntime {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    languageVersion: ").append(toIndentedString(languageVersion)).append("\n");
    sb.append("    runtimeType: ").append(toIndentedString(runtimeType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
