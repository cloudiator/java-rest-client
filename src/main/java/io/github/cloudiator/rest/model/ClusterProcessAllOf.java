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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * ClusterProcessAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class ClusterProcessAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<String> nodes = null;


  public ClusterProcessAllOf nodes(List<String> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public ClusterProcessAllOf addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<String>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * A list of node identifiers defining the cluster the process is hosted on.
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node identifiers defining the cluster the process is hosted on.")

  public List<String> getNodes() {
    return nodes;
  }


  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterProcessAllOf clusterProcessAllOf = (ClusterProcessAllOf) o;
    return Objects.equals(this.nodes, clusterProcessAllOf.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterProcessAllOf {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
