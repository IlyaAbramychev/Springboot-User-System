@echo off
echo Starting Spring Boot User System Application...
echo.
echo Checking Java installation...
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java 17 or higher and add it to PATH
    echo See INSTALL.md for installation instructions
    pause
    exit /b 1
)

echo Checking Maven installation...
mvn -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Maven is not installed or not in PATH
    echo Please install Maven 3.6 or higher and add it to PATH
    echo See INSTALL.md for installation instructions
    pause
    exit /b 1
)

echo.
echo Starting application...
echo Application will be available at: http://localhost:8080
echo Press Ctrl+C to stop the application
echo.
mvn spring-boot:run 