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
import io.github.cloudiator.rest.model.ProcessMapping;
import io.github.cloudiator.rest.model.TaskInterface;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Subtype of TaskInterface. Describes how to deploy a Task to Hdfs. 
 */
@ApiModel(description = "Subtype of TaskInterface. Describes how to deploy a Task to Hdfs. ")

public class HdfsInterface extends TaskInterface implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("processMapping")
  private ProcessMapping processMapping = null;

  public HdfsInterface processMapping(ProcessMapping processMapping) {
    this.processMapping = processMapping;
    return this;
  }

   /**
   * Get processMapping
   * @return processMapping
  **/
  @ApiModelProperty(value = "")
  public ProcessMapping getProcessMapping() {
    return processMapping;
  }

  public void setProcessMapping(ProcessMapping processMapping) {
    this.processMapping = processMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdfsInterface hdfsInterface = (HdfsInterface) o;
    return Objects.equals(this.processMapping, hdfsInterface.processMapping) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processMapping, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsInterface {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    processMapping: ").append(toIndentedString(processMapping)).append("\n");
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

