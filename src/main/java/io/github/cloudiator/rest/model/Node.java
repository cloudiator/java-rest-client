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
import io.github.cloudiator.rest.model.IpAddress;
import io.github.cloudiator.rest.model.LoginCredential;
import io.github.cloudiator.rest.model.NodeProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Node
 */

public class Node implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("loginCredential")
  private LoginCredential loginCredential = null;

  /**
   * Gets or Sets nodeType
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    UNKNOWN_TYPE("UNKNOWN_TYPE"),
    
    VM("VM"),
    
    BYON("BYON"),
    
    CONTAINER("CONTAINER");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeTypeEnum fromValue(String text) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NodeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("nodeType")
  private NodeTypeEnum nodeType = null;

  @SerializedName("ipAddresses")
  private List<IpAddress> ipAddresses = null;

  @SerializedName("nodeProperties")
  private NodeProperties nodeProperties = null;

  public Node nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(value = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public Node name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node loginCredential(LoginCredential loginCredential) {
    this.loginCredential = loginCredential;
    return this;
  }

   /**
   * Get loginCredential
   * @return loginCredential
  **/
  @ApiModelProperty(value = "")
  public LoginCredential getLoginCredential() {
    return loginCredential;
  }

  public void setLoginCredential(LoginCredential loginCredential) {
    this.loginCredential = loginCredential;
  }

  public Node nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(value = "")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public Node ipAddresses(List<IpAddress> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Node addIpAddressesItem(IpAddress ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<IpAddress>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "")
  public List<IpAddress> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<IpAddress> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public Node nodeProperties(NodeProperties nodeProperties) {
    this.nodeProperties = nodeProperties;
    return this;
  }

   /**
   * Get nodeProperties
   * @return nodeProperties
  **/
  @ApiModelProperty(value = "")
  public NodeProperties getNodeProperties() {
    return nodeProperties;
  }

  public void setNodeProperties(NodeProperties nodeProperties) {
    this.nodeProperties = nodeProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.nodeId, node.nodeId) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.loginCredential, node.loginCredential) &&
        Objects.equals(this.nodeType, node.nodeType) &&
        Objects.equals(this.ipAddresses, node.ipAddresses) &&
        Objects.equals(this.nodeProperties, node.nodeProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, name, loginCredential, nodeType, ipAddresses, nodeProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loginCredential: ").append(toIndentedString(loginCredential)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    nodeProperties: ").append(toIndentedString(nodeProperties)).append("\n");
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

