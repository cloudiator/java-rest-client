#!/bin/sh

# rm -r src/
rm -r docs/
java -jar bin/openapi-generator-cli.jar generate -i https://raw.githubusercontent.com/cloudiator/rest-swagger/master/swagger.yaml -g java --artifact-id java-rest --group-id io.github.cloudiator.client --artifact-version 0.3.0-SNAPSHOT --api-package io.github.cloudiator.rest.api --model-package io.github.cloudiator.rest.model --additional-properties serializableModel=true -DhideGenerationTimestamp=true
