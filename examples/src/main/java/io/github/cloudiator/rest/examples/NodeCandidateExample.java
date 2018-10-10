package io.github.cloudiator.rest.examples;

import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.api.MatchmakingApi;
import io.github.cloudiator.rest.model.AttributeRequirement;
import io.github.cloudiator.rest.model.NodeCandidate;
import io.github.cloudiator.rest.model.Requirement;
import io.github.cloudiator.rest.model.RequirementOperator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NodeCandidateExample {

  public static void main(String[] args) throws ApiException {

    //read the server url from the prop
    String basePath = PropertyAccess.basePath();

    ApiClient apiClient = new ApiClient();

    apiClient.getHttpClient().setReadTimeout(1, TimeUnit.MINUTES);

    if (basePath != null) {
      apiClient.setBasePath(basePath);
    }
    apiClient.setApiKey(PropertyAccess.apiKey());

    MatchmakingApi matchmakingApi = new MatchmakingApi(apiClient);

    //getAllNodeCandidates(matchmakingApi);
    getAllNodeCandidatesWithRequirements(matchmakingApi);


  }

  /**
   * Example code that fetches all node candidates without any requirements
   *
   * @param matchmakingApi the api to use
   */
  private static void getAllNodeCandidates(MatchmakingApi matchmakingApi) throws ApiException {
    //get all possible node candidates
    final List<NodeCandidate> nodeCandidates = matchmakingApi
        .findNodeCandidates(Collections.emptyList());

    for (NodeCandidate nodeCandidate : nodeCandidates) {
      System.out.println(nodeCandidate);
    }
  }

  /**
   * Example code that fetches all node candidates that have 2 cores and 2048 ram.
   *
   * @param matchmakingApi the api to use
   */
  private static void getAllNodeCandidatesWithRequirements(MatchmakingApi matchmakingApi)
      throws ApiException {

    List<Requirement> requirements = new ArrayList<>();

    //get possible node candidates with 2 cores
    final AttributeRequirement coreRequirement = new AttributeRequirement();
    coreRequirement.setType("AttributeRequirement");
    coreRequirement.setRequirementClass("hardware");
    coreRequirement.setRequirementAttribute("cores");
    coreRequirement.setRequirementOperator(RequirementOperator.EQ);
    coreRequirement.setValue("2");
    requirements.add(coreRequirement);

    //get possible node candidates with 2048 ram
    final AttributeRequirement ramRequirement = new AttributeRequirement();
    ramRequirement.setType("AttributeRequirement");
    ramRequirement.setRequirementClass("hardware");
    ramRequirement.setRequirementAttribute("ram");
    ramRequirement.setRequirementOperator(RequirementOperator.EQ);
    ramRequirement.setValue("2048");
    requirements.add(ramRequirement);

    final List<NodeCandidate> nodeCandidates = matchmakingApi.findNodeCandidates(requirements);

    for (NodeCandidate nodeCandidate : nodeCandidates) {
      System.out.println(nodeCandidate);
    }
  }

}
