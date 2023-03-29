public class Flow {

    public void methodA(String input){
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("1v");
            methodB("start");
        } else{
            System.out.println("a");
            System.out.println("v");
        }
    }

    public void methodB(String start){
        System.out.println("e");
        System.out.println("r");
    }
    public String methodC(String input) {
        System.out.println("s");
        System.out.println("j");
        return input;
    }

    public String methodD(String input) {
        System.out.println("o");
        System.out.println("v");
        System.out.println("t");
        return input;
    }
    public String methodE(String input){
        System.out.println("Java er sjovt");
        return input;
    }


}
