package io.github.cloudiator.rest.examples;

import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.api.CloudApi;
import io.github.cloudiator.rest.model.Api;
import io.github.cloudiator.rest.model.Cloud;
import io.github.cloudiator.rest.model.CloudConfiguration;
import io.github.cloudiator.rest.model.CloudCredential;
import io.github.cloudiator.rest.model.CloudType;
import io.github.cloudiator.rest.model.NewCloud;

public class AddCloudExampleOpenstack {

  private static final String USER = "";
  private static final String SECRET = "";
  private static final String ENDPOINT = "";
  private static final String NODE_GROUP = "cloudiator";

  public static void main(String[] args) throws ApiException {

    //read the server url from the prop
    String basePath = PropertyAccess.basePath();

    ApiClient apiClient = new ApiClient();
    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    apiClient.setApiKey(PropertyAccess.apiKey());

    CloudApi cloudApi = new CloudApi(apiClient);

    NewCloud newCloud = new NewCloud();
    newCloud.setEndpoint(ENDPOINT);
    newCloud.setCloudType(CloudType.PRIVATE);
    Api api = new Api();
    api.setProviderName("openstack4j");
    newCloud.api(api);
    CloudCredential cloudCredential = new CloudCredential();
    cloudCredential.setUser(USER);
    cloudCredential.setSecret(SECRET);
    newCloud.setCredential(cloudCredential);
    CloudConfiguration cloudConfiguration = new CloudConfiguration();
    cloudConfiguration.setNodeGroup(NODE_GROUP);
    newCloud.setCloudConfiguration(cloudConfiguration);

    final Cloud cloud = cloudApi.addCloud(newCloud);

    System.out.println(cloud);

  }

}
