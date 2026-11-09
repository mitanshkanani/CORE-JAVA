1. Remove the semicolon after println (compile time)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javac .\HelloWorld.java 
.\HelloWorld.java:3: error: ';' expected
        System.out.println("Hello World")
                                         ^
1 error

2. Change System to system. (compile time)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javac .\HelloWorld.java 
.\HelloWorld.java:3: error: package system does not exist
        system.out.println("Hello World");
              ^
1 error

3. Remove the word static from main.(runtime error)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> java HelloWorld
Error: Main method is not static in class HelloWorld, please define the main method as:
   public static void main(String[] args)

4. Rename main to Main.(runtime error)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> java HelloWorld        
Error: Main method not found in class HelloWorld, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

5. Rename the file to Hello.java but keep the class name HelloWorld.(compile time)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javac Hello.java
Hello.java:1: error: class HelloWorld is public, should be declared in a file named HelloWorld.java
public class HelloWorld {
       ^
1 error

6. Remove the last closing brace }.(compile time)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javac .\HelloWorld.java
.\HelloWorld.java:4: error: reached end of file while parsing
    }
     ^
1 error

7. Remove the closing double quote of the String.(compile time)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javac .\HelloWorld.java
.\HelloWorld.java:3: error: unclosed string literal
        System.out.println("Hello World);
                           ^
1 error

8. Change void to int (and add return 0;).(runtime error)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> java HelloWorld        
Error: Main method not found in class HelloWorld, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

9. Run java HelloWorld.class instead of java HelloWorld.(runtime error)
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> java HelloWorld.class  
Error: Could not find or load main class HelloWorld.class
Caused by: java.lang.ClassNotFoundException: HelloWorld.class

10. Remove public from the class (keep it on main). Does it still run?(runtime error)
No. it gives error
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javac HelloWorld.java
PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> java HelloWorld      
Error: Main method not found in class HelloWorld, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
