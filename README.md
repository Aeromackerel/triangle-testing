# triangle-testing
COSC 4353 JaCoCo/J Unit Testing

Jacoco test coverage (branches) - 92~93% I missed two if/else if conditionals because the way my functions were oriented. I believe certain testcases exitted the function before reaching the test conditional? Not entirely sure however.

*NOTE* - I had to gut the main class because I utilized Scanner and input via System.in, so that entire section is commented out for testing purposes. Furthermore, I've also removed a few exception cases taht I couldn't test without Jacoco being upset at me for System.exit(1) (Throws an error code), so that was not tested, however I did test it manually and I believe it works fine.

Also, make sure to use JDK instead of JRE. Otherwise, maven-surefire will dislike what you're trying to do and not compile.

How to compile and run (if you're using Eclipse/Netbeans/IntelliJ)
1) Right click the project
2) Find Maven in the drop down menu -> update project -> yes
3) Right click the project again
4) Find Run as and hover over it -> Maven clean
5) Find Run as and hover over it -> Maven Install
6) Maven Test

JaCoCo test coverage should be found underneath target/site/jacoco/index.html
