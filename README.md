## Table of Contents

- [eclipse-project-setup-utility](#eclipse-project-setup-utility)
	- [Features Provided](#features-provided)
	- [Deployment](#deployment)

# eclipse-project-setup-utility

This repository provides the tool to generate the maven project for Sterling.

## Features Provided

The following list of features are provided as part of this Tool.

## Deployment

Please find below the steps to deploy the addon to Sterling.

1. Download the latest release jar from the Releases tab.
2. Unzip the zip file to a desired location.
3. Update the build.properties
    i. FINAL_JAR_NAME: Final Output Jar Name.
    ii. PROJECT_NAME: Project name.
    iii. INSTALL_DIR: Sterling Install Directory
    iv. WS_DIR: Workspace directory inside which the java project is created.
    v. GROUP_ID: Maven Project group id.
    vi. jardirs: 3rd Party jars to be added.
    vii. jarignorelist: List or jar names to be ignored.
4. Run the 

```shell
ant -f <Path to the unzipped directory>/build.xml
```
