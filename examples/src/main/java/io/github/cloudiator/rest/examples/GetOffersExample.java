package io.github.cloudiator.rest.examples;

import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.api.CloudApi;

public class GetOffersExample {

  public static void main(String[] args) throws ApiException {

    //read the server url from the prop
    String basePath = PropertyAccess.basePath();

    ApiClient apiClient = new ApiClient();
    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    apiClient.setApiKey(PropertyAccess.apiKey());

    CloudApi cloudApi = new CloudApi(apiClient);

    System.out.println("HARDWARE");
    cloudApi.findHardware().forEach(System.out::println);

    System.out.println("LOCATIONS");
    cloudApi.findLocations().forEach(System.out::println);

    System.out.println("IMAGES");
    cloudApi.findImages().forEach(System.out::println);

  }

}
