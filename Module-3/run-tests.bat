@echo off

echo Using JAVA from PATH:
java -version

echo Cleaning and creating bin folder...
if exist bin rmdir /s /q bin
mkdir bin

echo Compiling Java files...
javac -d bin -cp "lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" src\*.java tests\*.java

if %errorlevel% neq 0 (
    echo  COMPILATION FAILED 
    pause
    exit /b
)

echo Running JUnit Tests...
java -cp "bin;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ScaleneTriangleTest

echo 
echo  DONE 
pause
