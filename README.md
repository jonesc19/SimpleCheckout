# SimpleCheckout

This simple project was designed to be completely standalone, apart from the use of the thirdparty package JUnit
(obtained directly from: https://cloud.github.com/downloads/junit-team/junit4/junit-4.10.jar)

The commits representing the solution to each "step" have been tagged as "step1" and "step2" respectively.

In each case, assuming that the classpath has been set to include the JUnit JAR,
the classes may be compiled simply via

 javac *.java

The included test suite may then be run as

 java TestRunner.java

In addition you may simulate a "checkout" by specifying each individual purchase as a command line argument
as in the following example:

 java SimpleCheckout apple orange apple orange orange

