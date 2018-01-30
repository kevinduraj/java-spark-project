#!/bin/bash

mvn archetype:generate \
	-DgroupId=com.kduraj \
	-DartifactId=java-spark-project \
	-DarchetypeArtifactId=maven-archetype-quickstart \
	-DinteractiveMode=false

