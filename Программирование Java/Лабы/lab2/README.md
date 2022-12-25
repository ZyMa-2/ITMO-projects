# Information to this lab

OOP...
- [how to import jar file](https://javadevblog.com/kak-dobavit-biblioteku-jar-fajl-v-proekt-intellij-idea.html)
- [javac sourcepath option](https://www.examclouds.com/java/java-core-russian/compile-sourcepath)

## How to compile a project

First, compile main java file with javac
``` 
# Current directory: [~/programming/lab2]
javac -cp src/Pokemon.jar -sourcepath src src/ponomaryov/mikhail/Lab2.java
```
After that command all import classes will be compiled as `.class`  
Then `Manifest.mf` file needs to be in `src` directory
<details><summary> MANIFEST.mf </summary>

  ```
  Main-Class: ponomaryov.mikhail.Lab2
  Class-Path: Pokemon.jar
  ```

</details>

Lastly, building project with `jar` command
```
# Current directory: [~/programming/lab2/src]
jar -cfm app.jar MANIFEST.mf ponomaryov/mikhail/Lab2.class ponomaryov/mikhail/pokemons/*.class ponomaryov/mikhail/attacks/*.class
```
Then launch jar file with command
```
java -jar app.jar
```
