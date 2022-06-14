Simple grails project that uses freely available LDAP instance for access control

Try loging in with password=password and user from one of...

* euclid
* einstein
* newton
* galieleo
* tesla

Project uses spring security core and ldap grails plugins with nothing custom.

Following was run to generate relevant properties in application.groovy

./grailsw s2-quickstart --uiOnly

You need to be fully authenticated to access - http://localhost:8080/home/index