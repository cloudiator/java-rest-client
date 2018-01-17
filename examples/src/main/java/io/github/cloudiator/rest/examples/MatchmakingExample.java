package io.github.cloudiator.rest.examples;

import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.api.MatchmakingApi;
import io.github.cloudiator.rest.model.AttributeRequirement;
import io.github.cloudiator.rest.model.MatchmakingRequest;
import io.github.cloudiator.rest.model.MatchmakingResponse;
import io.github.cloudiator.rest.model.NodeRequirements;
import io.github.cloudiator.rest.model.OclRequirement;
import io.github.cloudiator.rest.model.RequirementOperator;

public class MatchmakingExample {

  public static void main(String[] args) throws ApiException {
    //read the server url from the prop
    String basePath = PropertyAccess.basePath();

    ApiClient apiClient = new ApiClient();
    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    apiClient.setApiKey(PropertyAccess.apiKey());

    MatchmakingApi matchmakingApi = new MatchmakingApi(apiClient);

    NodeRequirements nodeRequirements = new NodeRequirements();
    OclRequirement oclRequirement = new OclRequirement();
    oclRequirement.setType("OclRequirement");
    oclRequirement.setConstraint("nodes->forAll(hardware.cores >= 4)");
    nodeRequirements.addRequirementsItem(oclRequirement);
    AttributeRequirement attributeRequirement = new AttributeRequirement();
    attributeRequirement.setType("AttributeRequirement");
    attributeRequirement.setRequirementClass("hardware");
    attributeRequirement.setRequirementAttribute("ram");
    attributeRequirement.setRequirementOperator(RequirementOperator.GEQ);
    attributeRequirement.setValue("2048");
    nodeRequirements.addRequirementsItem(attributeRequirement);
    MatchmakingRequest matchmakingRequest = new MatchmakingRequest();
    matchmakingRequest.setRequirements(nodeRequirements);

    final MatchmakingResponse matchmakingResponse = matchmakingApi
        .solveMatchmaking(matchmakingRequest);

    System.out.println(matchmakingResponse);

  }


}
