# System Information in Java

### Compilación

```
javac Main.java
```

### Ejecución

```
java Main
```

## Crear archivo JAR

Crear un archivo Manifest.mf con el siguiente contenido:

```
Manifest-version: 1.0
Main-Class: Main
```
En la segunda línea colocar el nombre de la clase que contiene el método `public static void main (String[] args) {}`

Correr el siguiente comando
```
jar -cvfm out.jar Manifest.mf *.class
```
Donde:

- `out.jar` es el nombre del archivo de salida
- `Manifest.mf` es el nombre del archivo manifiesto
- `*.class` indica que se deben incluir todas las clases en el archivo `.jar`
