#!/bin/bash

# see http://benlimmer.com/2013/12/26/automatically-publish-javadoc-to-gh-pages-with-travis-ci/

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

  git remote add origin-master https://${GH_TOKEN}@github.com/cloudiator/java-rest-client.git

  git add -f .
  git commit -m "Travis build $TRAVIS_BUILD_NUMBER auto generated client."
  git push --quiet --set-upstream origin-master master

  echo -e "Generated client \n"

fi
