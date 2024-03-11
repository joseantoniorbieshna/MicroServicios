# BUILD IMAGENES GUIA
situate en el repo y copiar desde config hasta antes de notas y pegalo en la consola.
# Config
cd configserverMS
mvn clean package spring-boot:repackage
docker build -t configjava:latest .
cd ..
# eureka
cd eureka-ms
mvn clean package spring-boot:repackage
docker build -t eurekajava:latest .
cd ..
# estudiante
cd estudiantems
mvn clean package spring-boot:repackage
docker build -t estudiantejava:latest .
cd ..

## Nota 
lo del final sin mayor y menor que