set projectLocation=/Users/techcircle_2/Documents/Cohort16-workspace/Cohort16_TestNGProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\groupingExample.xml
pause