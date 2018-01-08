# java-rest-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.github.cloudiator</groupId>
    <artifactId>java-rest-client</artifactId>
    <version>0.3.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.github.cloudiator:java-rest-client:0.3.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-rest-client-0.3.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.github.cloudiator.rest.*;
import io.github.cloudiator.rest.auth.*;
import io.github.cloudiator.rest.model.*;
import io.github.cloudiator.rest.api.CloudApi;

import java.io.File;
import java.util.*;

public class CloudApiExample {

    public static void main(String[] args) {
        
        CloudApi apiInstance = new CloudApi();
        NewCloud cloud = new NewCloud(); // NewCloud | Cloud to add
        try {
            Cloud result = apiInstance.addCloud(cloud);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudApi#addCloud");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:9000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CloudApi* | [**addCloud**](docs/CloudApi.md#addCloud) | **POST** /clouds | 
*CloudApi* | [**addVM**](docs/CloudApi.md#addVM) | **POST** /vm | 
*CloudApi* | [**deleteCloud**](docs/CloudApi.md#deleteCloud) | **DELETE** /clouds/{id} | 
*CloudApi* | [**editImage**](docs/CloudApi.md#editImage) | **PUT** /images/{id} | 
*CloudApi* | [**findCloud**](docs/CloudApi.md#findCloud) | **GET** /clouds/{id} | 
*CloudApi* | [**findClouds**](docs/CloudApi.md#findClouds) | **GET** /clouds | 
*CloudApi* | [**findHardware**](docs/CloudApi.md#findHardware) | **GET** /hardware | 
*CloudApi* | [**findImages**](docs/CloudApi.md#findImages) | **GET** /images | 
*CloudApi* | [**findLocations**](docs/CloudApi.md#findLocations) | **GET** /locations | 
*CloudApi* | [**findNodeCandidates**](docs/CloudApi.md#findNodeCandidates) | **POST** /nodeCandidates | 
*JobApi* | [**addJob**](docs/JobApi.md#addJob) | **POST** /jobs | 
*JobApi* | [**addTask**](docs/JobApi.md#addTask) | **POST** /tasks | 
*JobApi* | [**findJobs**](docs/JobApi.md#findJobs) | **GET** /jobs | 
*JobApi* | [**findTasks**](docs/JobApi.md#findTasks) | **GET** /tasks | 
*LongRunningRequestApi* | [**findAllLongRunningRequest**](docs/LongRunningRequestApi.md#findAllLongRunningRequest) | **GET** /longRunningRequests | 
*LongRunningRequestApi* | [**findLongRunningRequest**](docs/LongRunningRequestApi.md#findLongRunningRequest) | **GET** /longRunningRequests/{id} | 
*MiscApi* | [**solveOCL**](docs/MiscApi.md#solveOCL) | **PUT** /ocl | 
*NodeApi* | [**addNode**](docs/NodeApi.md#addNode) | **POST** /node | 
*PlatformApi* | [**addPlatform**](docs/PlatformApi.md#addPlatform) | **POST** /platform | 
*PlatformApi* | [**addPlatformEnvironment**](docs/PlatformApi.md#addPlatformEnvironment) | **POST** /platformEnvironment | 
*PlatformApi* | [**addPlatformHardware**](docs/PlatformApi.md#addPlatformHardware) | **POST** /platformHardware | 
*PlatformApi* | [**addPlatformRuntime**](docs/PlatformApi.md#addPlatformRuntime) | **POST** /platformRuntime | 
*PlatformApi* | [**deletePlatform**](docs/PlatformApi.md#deletePlatform) | **DELETE** /platform/{id} | 
*PlatformApi* | [**findPlatform**](docs/PlatformApi.md#findPlatform) | **GET** /platform/{id} | 
*PlatformApi* | [**findPlatformEnvironment**](docs/PlatformApi.md#findPlatformEnvironment) | **GET** /platformEnvironment/{id} | 
*PlatformApi* | [**findPlatformEnvironments**](docs/PlatformApi.md#findPlatformEnvironments) | **GET** /platformEnvironment | 
*PlatformApi* | [**findPlatformHardware**](docs/PlatformApi.md#findPlatformHardware) | **GET** /platformHardware/{id} | 
*PlatformApi* | [**findPlatformHardwares**](docs/PlatformApi.md#findPlatformHardwares) | **GET** /platformHardware | 
*PlatformApi* | [**findPlatformRuntime**](docs/PlatformApi.md#findPlatformRuntime) | **GET** /platformRuntime/{id} | 
*PlatformApi* | [**findPlatformRuntimes**](docs/PlatformApi.md#findPlatformRuntimes) | **GET** /platformRuntime | 
*PlatformApi* | [**findPlatforms**](docs/PlatformApi.md#findPlatforms) | **GET** /platform | 


## Documentation for Models

 - [Api](docs/Api.md)
 - [CloudConfiguration](docs/CloudConfiguration.md)
 - [CloudCredential](docs/CloudCredential.md)
 - [CloudType](docs/CloudType.md)
 - [Communication](docs/Communication.md)
 - [Error](docs/Error.md)
 - [ExecutionEnvironment](docs/ExecutionEnvironment.md)
 - [GeoLocation](docs/GeoLocation.md)
 - [Hardware](docs/Hardware.md)
 - [Image](docs/Image.md)
 - [IpAddress](docs/IpAddress.md)
 - [IpAddressType](docs/IpAddressType.md)
 - [IpVersion](docs/IpVersion.md)
 - [Job](docs/Job.md)
 - [LRRStatus](docs/LRRStatus.md)
 - [LRRType](docs/LRRType.md)
 - [Location](docs/Location.md)
 - [LongRunningRequest](docs/LongRunningRequest.md)
 - [NewCloud](docs/NewCloud.md)
 - [NewPlatform](docs/NewPlatform.md)
 - [NewPlatformEnvironment](docs/NewPlatformEnvironment.md)
 - [NewPlatformHardware](docs/NewPlatformHardware.md)
 - [NewPlatformRuntime](docs/NewPlatformRuntime.md)
 - [NodeCandidate](docs/NodeCandidate.md)
 - [NodeRequirements](docs/NodeRequirements.md)
 - [OclProblem](docs/OclProblem.md)
 - [OclSolution](docs/OclSolution.md)
 - [OperatingSystem](docs/OperatingSystem.md)
 - [OperatingSystemArchitecture](docs/OperatingSystemArchitecture.md)
 - [OperatingSystemFamily](docs/OperatingSystemFamily.md)
 - [OperatingSystemType](docs/OperatingSystemType.md)
 - [PlatformService](docs/PlatformService.md)
 - [Port](docs/Port.md)
 - [Property](docs/Property.md)
 - [Requirement](docs/Requirement.md)
 - [RequirementOperator](docs/RequirementOperator.md)
 - [Task](docs/Task.md)
 - [TaskInterface](docs/TaskInterface.md)
 - [TaskType](docs/TaskType.md)
 - [VirtualMachine](docs/VirtualMachine.md)
 - [VirtualMachineRequest](docs/VirtualMachineRequest.md)
 - [AttributeRequirement](docs/AttributeRequirement.md)
 - [Cloud](docs/Cloud.md)
 - [DockerInterface](docs/DockerInterface.md)
 - [IdentifierRequirement](docs/IdentifierRequirement.md)
 - [LanceInterface](docs/LanceInterface.md)
 - [OclRequirement](docs/OclRequirement.md)
 - [Platform](docs/Platform.md)
 - [PlatformEnvironment](docs/PlatformEnvironment.md)
 - [PlatformHardware](docs/PlatformHardware.md)
 - [PlatformInterface](docs/PlatformInterface.md)
 - [PlatformRuntime](docs/PlatformRuntime.md)
 - [PortProvided](docs/PortProvided.md)
 - [PortRequired](docs/PortRequired.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

daniel.baur@uni-ulm.de

