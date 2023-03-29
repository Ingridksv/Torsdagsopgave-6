import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Flow flows = new Flow();
        System.out.println("flow.methodA (\"Java\");");
        flows.methodA("start");
        System.out.println("a");
        System.out.println(""); //Jeg tilføjer en tom streng for at få mellemrum, mellem "a" og "e".
        //flows.methodA("Hello, world");
        System.out.println("flow.methodB (\"er\");");
        flows.methodB("Hello, world");
        System.out.println(""); //Jeg tilføjer en tom streng, for at få mellemrum, mellem "r" og "s".
        System.out.println("flow.methodC(\"sj\");");
        flows.methodC("Hello, world");
        System.out.println("flow.methodD(\"ovt\");");
        flows.methodD("Hej");
        System.out.println(""); //Jeg tilføjer en tom streng, for at få mellemrum, mellem "ovt" og sætningen.
        flows.methodE("slut");


    }
}