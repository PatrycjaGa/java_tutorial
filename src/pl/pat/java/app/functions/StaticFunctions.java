package pl.pat.java.app.functions;

public class StaticFunctions {
    public static void main(String[] args) {

        voidNonParamsFunction();
        voidParamsFunction("Some text");

        System.out.println("String length: "+paramsFunctionReturnResult("fsafasdfas"));
    }

    private static void voidNonParamsFunction (){
        System.out.println("This function print some text");
    }

    private static void voidParamsFunction (String value){
        System.out.println("This function print value: " + value);
    }

    private static int paramsFunctionReturnResult (String value){
        return value.length();
    }
}
