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
 * A process represents a task running on a node
 */
@ApiModel(description = "A process represents a task running on a node")

public class CloudiatorProcessNew implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("task")
  private String task = null;

  @SerializedName("nodeGroup")
  private String nodeGroup = null;

  public CloudiatorProcessNew schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The id of the schedule this process belongs to.
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "The id of the schedule this process belongs to.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public CloudiatorProcessNew task(String task) {
    this.task = task;
    return this;
  }

   /**
   * The id of the task that is instantiated by this process.
   * @return task
  **/
  @ApiModelProperty(required = true, value = "The id of the task that is instantiated by this process.")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public CloudiatorProcessNew nodeGroup(String nodeGroup) {
    this.nodeGroup = nodeGroup;
    return this;
  }

   /**
   * The id of the nodeGroup this process is hosted on.
   * @return nodeGroup
  **/
  @ApiModelProperty(required = true, value = "The id of the nodeGroup this process is hosted on.")
  public String getNodeGroup() {
    return nodeGroup;
  }

  public void setNodeGroup(String nodeGroup) {
    this.nodeGroup = nodeGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudiatorProcessNew cloudiatorProcessNew = (CloudiatorProcessNew) o;
    return Objects.equals(this.schedule, cloudiatorProcessNew.schedule) &&
        Objects.equals(this.task, cloudiatorProcessNew.task) &&
        Objects.equals(this.nodeGroup, cloudiatorProcessNew.nodeGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, task, nodeGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudiatorProcessNew {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    nodeGroup: ").append(toIndentedString(nodeGroup)).append("\n");
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
