package compiletimeandruntime;

public class CompileTimeAndRunTimeExample {
    public static void main(String[] args){
        int a = 12;
        int b = 0;
        // compile time : syntax and type check : The compiler checks for syntax errors and ensures that a and b are integers.
        int c = a/b; // this will cause an arithmetic exception at run time
        System.out.println(c);
    }
}

// Compile Time refers to the phase in which the java source code is translated into bytecode by the java compiler.
// During this phase, the compiler checks for syntax errors, type checking.

// Runtime is the phase where compiled bytecode is executed by the java virtual machine. During this phase, the program performs the task
// it was designed to do, such as reading user input, processing data and producing output.
// Run-time error such as exception, can occur during this phase, if the program encounters unexpected condition.
