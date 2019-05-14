
# Wire Automation Assignment (Selenium-WebDriver + Java)

## Project Structure

```
pom.xml
logfile.log
targets
src
└── main
    └── java
        └── com
            └── wireassignment
                └── utils
                    ├── BaseTest.java : Base class with driver config
                    ├── UtilityFunctions.java : Utlity functions with super driver
                    ├── Log.java : Log class for defining log params
                    ├── Constant.java : class to keep test constants
                ├── pages   
                    └── WireSupportPageObject.java : Class for All Support Page related UI elements 
 test
 └──
    main
    └── java
        └── com
            └── wire
            	└── tests
                    ├── WireSupportSearchTests : All Wire support page tests 
                    ├── TestRunnerClass.java : Main class for running test suite
                    ├── TestSuiteClass.java : Test suite to define the collection of test classes.
                                    
```

## Libraries:

- JUnit latest
- selenium-java Client 3.13.0
- webdrivermanager 3.5.0
- log4j 1.2.17


## Requirements

- Chrome browser to be installed (chromeDriver =>2.30)
- Maven 3.0 installed
- Selenium webdriver installed

## Framework
 - Maven build tool, maintaining all the library definition in pom 
 - Page Object Model design pattern for maintaining the separate class for each feature
 - Page Factory Model for defining and locating web elements
 - Logforj logger for defining and logging events

## Java
 -java version "1.8.0_112"
 -Java(TM) SE Runtime Environment (build 1.8.0_112-b16)
 -Java HotSpot(TM) 64-Bit Server VM (build 25.112-b16, mixed mode)
 
## Start the tests

Open terminal, browse to root directory of project, run the test suite:

	mvn clean install test -Dtest=TestSuiteClass


## Test Cases

Please find test cases excel sheet at root folder

/TestCasesWireSupportSolutions.xlsx


## Test Screen Recording

Please find the screen recording of the tests 

/WireSupportTestAssignment.mp4  
 
 ## Test Screen Recording GoogleDrive link
 
 https://drive.google.com/file/d/12Q1--pqPjUnandeUQDCz7OhO0MUXsIcp/view?usp=sharing


