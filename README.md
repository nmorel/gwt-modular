## gwt-modular

To play with the modularity, reorder or remove the inherits of module Home, View1 and View2 in Modular.gwt.xml.

Then (re)run the SuperDevMode or Tomcat.

#### SuperDevMode

To run in SuperDevMode, run the following command :
```
mvn gwt:run -pl appli
or
mvn gwt:run -pl light-appli
```
The url is at [http://localhost:8888](http://localhost:8888)

#### Tomcat

To run with tomcat, run the following command :
```
mvn clean tomcat7:run-war -pl appli -am
or
mvn clean tomcat7:run-war -pl light-appli -am
```
The url is at [http://localhost:8080](http://localhost:8080)
