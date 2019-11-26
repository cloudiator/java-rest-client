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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * DockerInterfaceAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-26T14:14:48.729+01:00[Europe/Berlin]")
public class DockerInterfaceAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DOCKER_IMAGE = "dockerImage";
  @SerializedName(SERIALIZED_NAME_DOCKER_IMAGE)
  private String dockerImage;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private Map<String, String> environment = null;

  public static final String SERIALIZED_NAME_UPDATE_ACTION = "updateAction";
  @SerializedName(SERIALIZED_NAME_UPDATE_ACTION)
  private String updateAction;


  public DockerInterfaceAllOf dockerImage(String dockerImage) {
    
    this.dockerImage = dockerImage;
    return this;
  }

   /**
   * Name of the docker image (should include repository, credentials, tags) 
   * @return dockerImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the docker image (should include repository, credentials, tags) ")

  public String getDockerImage() {
    return dockerImage;
  }


  public void setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
  }


  public DockerInterfaceAllOf environment(Map<String, String> environment) {
    
    this.environment = environment;
    return this;
  }

  public DockerInterfaceAllOf putEnvironmentItem(String key, String environmentItem) {
    if (this.environment == null) {
      this.environment = new HashMap<String, String>();
    }
    this.environment.put(key, environmentItem);
    return this;
  }

   /**
   * A key - value type of Map using &lt;String, String&gt;. 
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A key - value type of Map using <String, String>. ")

  public Map<String, String> getEnvironment() {
    return environment;
  }


  public void setEnvironment(Map<String, String> environment) {
    this.environment = environment;
  }


  public DockerInterfaceAllOf updateAction(String updateAction) {
    
    this.updateAction = updateAction;
    return this;
  }

   /**
   * An (optional) update action for updating the communication. 
   * @return updateAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An (optional) update action for updating the communication. ")

  public String getUpdateAction() {
    return updateAction;
  }


  public void setUpdateAction(String updateAction) {
    this.updateAction = updateAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerInterfaceAllOf dockerInterfaceAllOf = (DockerInterfaceAllOf) o;
    return Objects.equals(this.dockerImage, dockerInterfaceAllOf.dockerImage) &&
        Objects.equals(this.environment, dockerInterfaceAllOf.environment) &&
        Objects.equals(this.updateAction, dockerInterfaceAllOf.updateAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerImage, environment, updateAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerInterfaceAllOf {\n");
    sb.append("    dockerImage: ").append(toIndentedString(dockerImage)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    updateAction: ").append(toIndentedString(updateAction)).append("\n");
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

