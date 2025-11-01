@echo off
echo Compiling source files...
javac -cp "lib\*;src" -d out src\com\triangle\*.java

if %errorlevel% neq 0 (
    echo Compilation failed!
    pause
    exit /b
)

echo Running JUnit tests...
java -jar lib\junit-platform-console-standalone-1.9.3.jar --class-path out --scan-class-path

pause
