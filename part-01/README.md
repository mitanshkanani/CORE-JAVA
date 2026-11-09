PS C:\Users\mitansh\Desktop\CORE-JAVA\part-01> javap -c Lion
Compiled from "Zoo.java"
class Lion {
  Lion();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String Lion
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}

one javac command created 4 class files one for the ZOO than for lion, parrot and snake 3 non pub + 1 pub hence 4
2. Which bytecode instruction loads your String message? Which one calls println?
ldc loads the string message and invokevirtual calls println
3. The javap output shows a constructor Lion(); that you never wrote. Where did it come
from, and what does it call?
thats the default constructor java automatically invokes it when we make a class 

4. Why can you run java Lion even though Lion is not public?
you can start
either class as long as it has a main method.

