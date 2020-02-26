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
import io.github.cloudiator.rest.model.Communication;
import io.github.cloudiator.rest.model.Optimization;
import io.github.cloudiator.rest.model.Requirement;
import io.github.cloudiator.rest.model.Task;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Represents a job that should be created in the system. 
 */
@ApiModel(description = "Represents a job that should be created in the system. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class JobNew implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<Task> tasks = null;

  public static final String SERIALIZED_NAME_COMMUNICATIONS = "communications";
  @SerializedName(SERIALIZED_NAME_COMMUNICATIONS)
  private List<Communication> communications = null;

  public static final String SERIALIZED_NAME_REQUIREMENTS = "requirements";
  @SerializedName(SERIALIZED_NAME_REQUIREMENTS)
  private List<Requirement> requirements = null;

  public static final String SERIALIZED_NAME_OPTIMIZATION = "optimization";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION)
  private Optimization optimization;


  public JobNew name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "MediaWiki Application", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobNew tasks(List<Task> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public JobNew addTasksItem(Task tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<Task>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * An array of tasks that form this application. 
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of tasks that form this application. ")

  public List<Task> getTasks() {
    return tasks;
  }


  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }


  public JobNew communications(List<Communication> communications) {
    
    this.communications = communications;
    return this;
  }

  public JobNew addCommunicationsItem(Communication communicationsItem) {
    if (this.communications == null) {
      this.communications = new ArrayList<Communication>();
    }
    this.communications.add(communicationsItem);
    return this;
  }

   /**
   * Get communications
   * @return communications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Communication> getCommunications() {
    return communications;
  }


  public void setCommunications(List<Communication> communications) {
    this.communications = communications;
  }


  public JobNew requirements(List<Requirement> requirements) {
    
    this.requirements = requirements;
    return this;
  }

  public JobNew addRequirementsItem(Requirement requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<Requirement>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Requirement> getRequirements() {
    return requirements;
  }


  public void setRequirements(List<Requirement> requirements) {
    this.requirements = requirements;
  }


  public JobNew optimization(Optimization optimization) {
    
    this.optimization = optimization;
    return this;
  }

   /**
   * Get optimization
   * @return optimization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Optimization getOptimization() {
    return optimization;
  }


  public void setOptimization(Optimization optimization) {
    this.optimization = optimization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobNew jobNew = (JobNew) o;
    return Objects.equals(this.name, jobNew.name) &&
        Objects.equals(this.tasks, jobNew.tasks) &&
        Objects.equals(this.communications, jobNew.communications) &&
        Objects.equals(this.requirements, jobNew.requirements) &&
        Objects.equals(this.optimization, jobNew.optimization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tasks, communications, requirements, optimization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobNew {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    optimization: ").append(toIndentedString(optimization)).append("\n");
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

