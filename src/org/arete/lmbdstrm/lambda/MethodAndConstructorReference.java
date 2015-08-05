package org.arete.lmbdstrm.lambda;

/**
 * Created by rgundapaneni on 7/27/15.
 */
public class MethodAndConstructorReference {

    public static void main(String[] args) {

        Runnable thread = MethodAndConstructorReference::exec;
        (new Thread(thread)).start();
        System.out.println("Main Thread");

        executeSimpleLambdaExpression();

        FuncIf fi = String::new;
        System.out.println(fi.strFunc(new char[] {'H', 'E', 'L', 'L', 'O'}));
    }

    private static void exec() {

        try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Executing the thread...");
    }

    private static void executeSimpleLambdaExpression() {

        LambdaExpression expression1 =
                (s) ->
                {
                    String returnValue = "Return Value";
                    switch (s) {
                        case "One":
                            returnValue = "First Param";
                            break;
                        case "Two":
                            returnValue = "Second Param";
                            break;
                        default:
                            returnValue = "Some other";
                            break;
                    }

                    return returnValue;
                };

        System.out.println(expression1.execute("Two"));
    }

    public interface FuncIf {

        String strFunc(char[] chArray);

    }
}