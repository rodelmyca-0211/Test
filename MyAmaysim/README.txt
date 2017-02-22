---------------------------------
Introduction
---------------------------------
Test suite that logs into MyAmaysim and validates that the manage settings functionality 
is working as expected. 
Using the provided credentials (amaysim number: 0468827174, password: theHoff34) to login to
MyAmaysim

--------------------------------
Pre-Requisites
--------------------------------
1.) Java SE Development Kit 7
2.) Mozilla Firefox version 48.0 and earlier
3.) geckodriver for windows
---------------------------------

---------------------------------
Test Environment Setup
---------------------------------
This setup may be done on a machine with operating system,
preferably Windows 7 or latest

1.) Java Development Kit
 a. Download Java SE Development Kit 7
    - Filename: jdk-8u51-windows-x64 
 b. Double click the file, then install to your desired location
 c. Setup environment path
    1. Go to Control Panel > System, then click Advanced system settings
    2. Click Environment Variables…
    3. Click New… to create a system variable for Java
    4. Supply the variable name and value, then click OK
       Variable name: JAVA_HOME
       Variable value: This should be the path of the jdk folder.
       i.e: JAVA_HOME=C:\Program Files (x86)\Java\jdk1.8.0_51
    5. Select the system variable for Path, then click Edit…
    6. Append “;%JAVA_HOME%\bin” at the end of the variable value, then click OK

2.) Test Suite
 a. Download MyAmaysim test suite from URL: https://github.com/rodelmyca-0211/Test   
 b. Copy the test suite to C:\ 
 
3.) geckodriver for windows
 Note: Proceed to step a.) download geckodriver, if geckodriver driver file is not available to
 C:\MyAmaysim\geckodriver folders after copying the test suite to C:\ 
 a. Download geckodriver 
    -Filename: geckodriver-v0.14.0-win64.zip   
 b. Extract the file, then copy file to C:\MyAmaysim\geckodriver

---------------------------------
Running Test Automation
---------------------------------
 a.) Goto command line and execute the command: cd C:\MyAmaysim directory
 b.) Run the test suite command: java -jar MyAmaysim.jar
 
--------------------------------
Test Result
--------------------------------
Mozilla firefox browser will open and
amaysim page will login successfully 