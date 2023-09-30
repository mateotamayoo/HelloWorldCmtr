### HelloWorldCmtr
<p>
El contenido que hemos visto en ha sido: 
</p>
- Crear un proyecto en Android Studio
- Conocer los diferentes ficheros que contiene un proyecto
- Añadir dependencias para un proyecto de Android Studio
- Añadir un JavaDoc para un proyecto de Android Studio
- Ejecutar una aplicación básica en una máquina virtual de Android y en un dispositivo móvil
- Comandos de Git
- Crear repositorio en Github
- Crear un fichero README.md

# Android Studio

![](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiKoAufYiAR36mWljxnxgUSxlgyQf7PRyPn3axUZPdDid7Cv7mVEuTCaA0PriHdRLPurGgI4sVFjmB_fMtKBgd6KWu_bDKdqMywm-AL-iOX3c69obt2sqeX5KVQVqkzcE8-xG-28yRDXx7X6-ZaNRIUlYmABYmi_8XfFYuYs5IMPU0gv9EbyutqDAfk/s1600/Android%20Studio%20-%20Header.png)

**Tabla de Contenidos**

[TOCM]

[TOC]

#Entorno Android Studio
Para empezar nos hemos descargado la herramienta de Android Studio en el siguiente enlace `<link>` : <https://developer.android.com/studio>

Nada más entrar en la herramienta creamos un nuevo proyecto, nos quedamos con la más básica y seguimos adelante, aprendimos la importancia del apartado **Minimun SDK**, que mientras más abajo esté, más gente lo podrá usar, no obstante, contaremos con tecnología más antigua.

##Ficheros en un proyecto
Ya dentro del proyecto tenemos el MainActivity.java, que es el fichero principal, además en el panel izquierdo tenemos varios directorios donde encontraremos otros ficheros

### BuildGradle
Ubicado en Gradle Scripts, es un fichero importantisimo que cada vez que se cambie, deberemos de sincronizarlo con el proyecto.

Contiene información como:
- Espacio de nombre. 
- Sdk en el que se compila, sdk minimo.
- Versión del código y nombre de la versión dle proyecto
- Dependencias

=============

**Ficheros del directorio res**
En este directorio, dentro de la carpeta values, contamos con 3 ficheros XML.

1. colors.xml
En este fichero podemos definir diferentes colores para usar en la aplicación.

2. string xml
En este fichero podemos definir diferentes strings para usar en la aplicación.

3. themes.xml
En este fichero podemos definir diferentes estilos para usar en la aplicación.

https://git-scm.com/docs/gitignore
### GIT IGNORE
Fichero donde podremos ocultar directorios a la hora de subir nuestro al repositorio.

Podemos encontrar más información sobre él en el siguiente enlace `<link>` : <https://git-scm.com/docs/gitignore>

##Diseño de un proyecto
Tenemos principalmente el MainActivity.java, que contiene codigo en java y el activity_main.xml, que podemos trabajarlo en 3 modos diferentes.

### TextView
Con el podemos escribir texto en pantalla, le pasaremos un Hello World en su atributo de texto y listo. Esto también se puede hacer, creando un texto en el fichero strings.xml visto anteriormente, para hacerlo visible lo referenciamos en el atributo con un **@nombre_string** 

Es importante recalcar que **todo componente View tiene un id.
**

Tenemos diferentes componentes disponibles que ya iremos conociendo

##Dependencias
Se encuentra dentro del **Build.Gradle** comentado anteriormente,  es importante porque aquí podemos conocer diferentes implementaciones del proyecto. 

Además de añadir la ruta de nuestro fichero **android.jar**
para el siguiente paso

##JavaDoc
El javadoc es un estandar para documentar clases en Java, podemos encontrar más información en `<link>` : <https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html>

###Generar JavaDoc
Nos iremos a **Tools** --> **Generate JavaDoc**

Para ello es importante añadir la ruta del **android.jar** visto antes, será una linea como la siguiente:
```java
implementation(files("C:\\Users\\Mateo Tamayo\\AppData\\Local\\Android\\Sdk\\platforms\\android-33\\android.jar"))
```

Seguidamente nos generá el fichero en la ruta que le hayamos indicado, también lo podremos visualizar al instante, si pinchamos la opción de abrirlo en el navegador.

## Maquina Virtual y Móvil
Para generar una máquina virtual, nos vamos a **Tools --> Device Manager**

Una vez creada podemos seleccionar que la aplicacion se ejecute en dicha máquina, en el desplegable justo a la izquierda del botón run.

O también conectando directamente nuestro móvil al equipo.

###Opciones requeridas
Para que todo funcione bien, tanto en la máquina virtual como en el dispositivo móvil, tenemos que realizar estos pasos: 

1. activar depuración USB
2. activar instalar aplicaciones por USB
3. activar Depuración usb(ajustes de seguridad)

Todo esto se hará dentro de ajustes, opciones de desarollador, en mi caso.

En otros móviles basta con pulsar dentro de ajustes un número determinado de veces y aparecen las opciones.

## Comandos de Git
Necesitamos una base para poder luego subir nuestro proyecto al repositorio que crearemos, en este proyecto hemos usado estos comandos
- git commit
- git add
- git status
- git rm
- git push 

Todo estos comandos con sus correspondientes argumentos, podemos obtener una guía rápida en el siguiente enlace ` <link> ` : <https://gist.github.com/dasdo/9ff71c5c0efa037441b6>

##Repositorio en GitHub
Para poder acceder a las funcionalidades, debemos crearnos una cuenta, seguidamente nos podemos crear un repositorio y introducir nuestros proyectos con los comandos anteriores.

Esta plataforma nos sirve para que varios usuarios puedan trabajar en el mismo proyecto al mismo tiempo

![](https://d1jnx9ba8s6j9r.cloudfront.net/blog/wp-content/uploads/2017/12/gitHub.png)

##Fichero README.md
Todo proyecto posee un fichero **README.md**, en el detallamos toda la información del mismo y de que se trata, en mi caso he usado la herramienta **editor.md** para crearlo.

Esta herramienta nos permite ver los cambios en tiempo real.

![](https://cdn.ourcodeworld.com/public-media/gallery/gallery-587d0e0ce101a.png)

