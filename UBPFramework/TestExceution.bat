set root=C:\ARTEMIS\UBPFramework\E2ESeleniumCI
cd %root%
mvn test -Dmaven.test.failure.ignore=true
pause
