package io.github.cloudiator.rest.examples;

import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.api.CloudApi;
import io.github.cloudiator.rest.model.Cloud;
import java.util.List;

public class GetCloudsExample {

  public static void main(String[] args) throws ApiException {

    //read the server url from the prop
    String basePath = PropertyAccess.basePath();

    ApiClient apiClient = new ApiClient();
    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    apiClient.setApiKey(PropertyAccess.apiKey());

    CloudApi cloudApi = new CloudApi(apiClient);

    final List<Cloud> clouds = cloudApi.findClouds();

    for (Cloud cloud : clouds) {
      System.out.println(cloud);
    }


  }

}
