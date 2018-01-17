package io.github.cloudiator.rest.examples;

import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.api.MatchmakingApi;
import io.github.cloudiator.rest.model.AttributeRequirement;
import io.github.cloudiator.rest.model.NodeCandidate;
import io.github.cloudiator.rest.model.NodeRequirements;
import io.github.cloudiator.rest.model.RequirementOperator;
import java.util.List;

public class NodeCandidateExample {

  public static void main(String[] args) throws ApiException {

    //read the server url from the prop
    String basePath = PropertyAccess.basePath();

    ApiClient apiClient = new ApiClient();
    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    apiClient.setApiKey(PropertyAccess.apiKey());

    MatchmakingApi matchmakingApi = new MatchmakingApi(apiClient);

    getAllNodeCandidates(matchmakingApi);
    getAllNodeCandidatesFourCores(matchmakingApi);


  }

  /**
   * Example code that fetches all node candidates without any requirements
   *
   * @param matchmakingApi the api to use
   */
  private static void getAllNodeCandidates(MatchmakingApi matchmakingApi) throws ApiException {
    //get all possible node candidates
    final List<NodeCandidate> nodeCandidates = matchmakingApi
        .findNodeCandidates(new NodeRequirements());

    for (NodeCandidate nodeCandidate : nodeCandidates) {
      System.out.println(nodeCandidate);
    }
  }

  /**
   * Example code that fetches all node candidates that have at least for cores.
   *
   * @param matchmakingApi the api to use
   */
  private static void getAllNodeCandidatesFourCores(MatchmakingApi matchmakingApi)
      throws ApiException {
    //get possible node candidates with at least 4 cores
    final AttributeRequirement attributeRequirement = new AttributeRequirement();
    attributeRequirement.setType("AttributeRequirement");
    attributeRequirement.setRequirementClass("hardware");
    attributeRequirement.setRequirementAttribute("cores");
    attributeRequirement.setRequirementOperator(RequirementOperator.GEQ);
    attributeRequirement.setValue("4");

    NodeRequirements nodeRequirements = new NodeRequirements();
    nodeRequirements.addRequirementsItem(attributeRequirement);

    final List<NodeCandidate> nodeCandidates = matchmakingApi.findNodeCandidates(nodeRequirements);

    for (NodeCandidate nodeCandidate : nodeCandidates) {
      System.out.println(nodeCandidate);
    }
  }

}
