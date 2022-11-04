# Information to this lab

Lab about java, javac, jdb, jar, JDK, JDB and other shit

## Fucking command line

### How to compile file on server

``` 
javac Main.java 
``` 
Creates `Main.class` file
```  
jar -cfm app.jar Manifest.mf *.class 
```
Creates `app.jar` file  
  
**-c** option - Indicates that jar file is need to be **created**  
**-f** option - Specifies the file jarfile to be created (c), updated (u), extracted (x), indexed (i), or viewed (t)  
**-m** option - Manifest thing  
Last argument is name of the classes that we want to combine together

For more options open this [jar documentation](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jar.html).

<details><summary> Manifest.mf </summary>

  ```
  Main-Class: Main
  ```

</details>

```
java -jar app.jar
```
Runs `app.jar` file

### How to debug this bullshit

```
jdb Main.java
```
`run` - launches debugger.  
`stop in <class-name>.<method-name>` - Stop on entry to the given method.  
`stop at <class-name>:<line-number>` - Stop at the given line.  
`clear <class-name>.<method-name>` - Remove the specified breakpoint.  
`clear <class-name>:<line-number>` - Remove the specified breakpoint.  
`cont` - 	Continue (after stopping at a breakpoint).  
`step` -	Execute the current line, (after stopping at a breakpoint). If it includes a method call, stop at the method entry.  
`next` -	Execute the current line, (after stopping at a breakpoint). If it includes a method call, do not stop at the method entry.  
`step up` -	Execute until the current method returns to its caller.  
`list` - prints previous lines of code to debugger.  
`locals` - prints all local variables.  

## How to format print

`System.out.printf("%7.5f ", ans[i][j]);` - Whole thing is given 7 characters, 5 characters precision, float

## Questions

- Рассказать что есть Set и его реализации, либо переделать на использование Arrays  
  Bruh
- Как это будет вычисляться:
  ```
  int x = 1;
  x += x-- + --x;
  ```
  x += x-- + --x;  
  x = x + x-- + --x;  
  first x is 1  
  second x is 1  
  after second x is 0  
  before third x is 0  
  third x is -1  
  `Answer: x = 1`  
- Две ситуации:
  ```
  byte x1 = 1, x2 = 1;  
  var y = x1 + x2;  
  и  
  byte x1 = 1, x2 = 1;  
  byte y = x1 + x2;  
  ```
  So basically var prefers to be int and float  
  1 situation: error  
  2 situation: var is going to be int  
