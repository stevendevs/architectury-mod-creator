@echo off

REM Display the welcome message and prompt the user to start
echo Welcome to the mod ID and package updater!
set /p START=Press Enter to start the updater...

REM Prompt the user for mod information
set /p MODID=Enter your mod ID:
set /p NAME=Enter your mod name (capital first):
set /p AUTHOR=Enter the author name:
set /p LICENSE=Enter your license name:
set /p DESCRIPTION=Enter your description:
set /p PACKAGE=Enter your package name:
set /p VERSION=Enter your mod version:
set /p PAGE=Enter your mod page (curse, modrinth):
set /p SOURCE=Enter your mod source (github, etc):

REM Update the build.gradle file with the new mod ID, package, and other information
powershell -Command "(Get-Content build.gradle) -replace 'net\.examplemod', '%PACKAGE%' -replace 'examplemod', '%MODID%' -replace 'Capital', '%NAME%' -replace 'AuthorName', '%AUTHOR%' -replace 'CC0', '%LICENSE%' -replace 'Your mod description here', '%DESCRIPTION%' -replace '1.0.0', '%VERSION%' -replace 'page.com', '%PAGE%' -replace 'sources.com', '%SOURCE%' | Set-Content build.gradle"

REM Reload Gradle
./gradlew --refresh-dependencies
gradlew --stop

REM Display the success message
echo The build.gradle file has been updated successfully!
echo The 'runLocal' command still has to be executed.
echo Your new mod ID is %MODID%, your package name is %PACKAGE%, and your other mod information has been updated.