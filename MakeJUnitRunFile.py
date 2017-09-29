'''
this script creates a .cmd file that compiles and runs a specific java file and its JUnit tests
purpose is so that long command line input doesn't need to be remembered and so that it acts as a 
reference for me in the future

*** input argument should be the java class name without .java extension ***
if spelt java class name wrong it won't help you as it is just supposed to be a quick tool.
''' 

import sys

# change to suit own installation
junit = "\junit-4.12.jar"
hamcrest = "\hamcrest-core-1.3.jar"

javaFileName = sys.argv[1]
#javaFileName = input("Input name of java class to be tested (without \".java\" extension): ")
print ("you entered: \"" + javaFileName + "\"\n")

javaTestFileName = javaFileName + "Test"

file = open("run_JUnit_test_" + javaFileName + ".cmd", "w")

print ("output written to : 	run_JUnit_test_" + javaFileName + ".cmd\n")

#write command to compile relevant java files
file.write("javac " + javaFileName + ".java " +  javaFileName + "Test.java\n")
#write command to run junit test file
file.write("java -cp \"%JUNIT_HOME%"+junit + ";%JUNIT_HOME%" + hamcrest +";.;\" org.junit.runner.JUnitCore " + javaFileName + "Test\n")
file.write("pause") 

print ("exiting...\n")