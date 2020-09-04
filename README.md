# LAB 3 AREP

Despliegue continuo 

[![CircleCI](https://circleci.com/gh/danielGomez1703/AREP-LAB3.svg?style=svg)](https://circleci.com/gh/danielGomez1703/AREP-LAB3)

este programa es una muestra de los diferentes sockets de java. como ejemplo podra encontrar sokets de tipo

 - HTTPServer
 - locales

se muestran mediante ejemplos en los cuales puede hacer la solcitud mediante un browser.

## requsites
    -java version 1.7+
    -maven installed

## Installation
 ```sh
$ git clone https://github.com/danielGomez1703/AREP-LAB3
$ cd AREP-LAB3
$ mvn package
```

# MANUAL
  una vez instalado el programa debe ejecutar el programa de acuerdo al servidor que desee probar primero sera el servidor y luego el cliente
 
    servidor web    java -cp target/TallerNet-1.0-SNAPSHOT.jar  co/edu/escuelaing/arep/tallernet/sockets/HTTPServer
 
  posteriormente se hara la prueba con el cliente.

	localhost:35000/prueba2.html
	localhost:35000
	
  para los datos de Mongo 
  
	localhost:35000/datos
	
	https://arepserver.herokuapp.com/datos
   vera estos datos.
 ![datos](https://github.com/danielGomez1703/AREP-LAB3/blob/master/resources/datos.JPG) 
	
  para correrlo en la nube. 
		https://arepserver.herokuapp.com/
		https://arepserver.herokuapp.com/prueba2.html
		https://arepserver.herokuapp.com/pMath.JPG
	
## Modelo
![Modelo](https://github.com/danielGomez1703/AREP-LAB3/blob/master/resources/Umodel.JPG)

   
    
#pruebas 
  
 la siguiente imagen refleja a nivel general el funcionamiento de los socket en este caso con el servidor que atiende funciones matematicas.

![pruebaM](https://github.com/danielGomez1703/AREP-LAB3/blob/master/resources/pMath.JPG)

## Descripion

el objetivo del programa es abrir sockets para la comunicacion, esto se hace mediante un servidor y uno o mas clientes
para el caso del servidor web es el unico caso que alno ser concurrente puede atender mas de un cliente en diferentes momentos.

## Documento de desarrollo

para ir al documento  puede [hacer click aqui](https://github.com/danielGomez1703/AREP-LAB3/blob/master/resources/ServerClient.pdf)

## Author
    Daniel Felipe Gomez Suarez
    
## BUILT IN
   Proyecto construido en [Maven](https://maven.apache.org/)
## License
----
para consultar su licencia vaya al link 
[leer aqui](https://github.com/danielGomez1703/ARSW-Primer/blob/master/LICENSE.txt)