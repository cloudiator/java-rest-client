#!/bin/bash

if [ "$TRAVIS_REPO_SLUG" == "cloudiator/java-rest-client" ] && [ "$TRAVIS_JDK_VERSION" == "oraclejdk8" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then

  echo -e "Generating latest version of the client...\n"

  # Delete the existing src and docs directory
  rm -r src
  rm -r docs

  # Generate the client using swagger
  ./bin/generate.sh

  # Configure git
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "travis-ci"
  git config --global push.default current

  git add -f .
  git commit -m "Travis build $TRAVIS_BUILD_NUMBER auto generated client."
  git push https://${GH_TOKEN}@github.com/cloudiator/java-rest-client.git

  echo -e "Generated client \n"

fi
