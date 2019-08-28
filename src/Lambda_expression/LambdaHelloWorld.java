package Lambda_expression;

// https://javapapers.com/core-java/java-lambda-expression-examples/
    
public class LambdaHelloWorld {

    interface HelloWorld {
        String hello(String name);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HelloWorld helloWorld = (String name)->{ return "Hello "+name ;};
        
        System.out.println(helloWorld.hello("kailash"));

    }

}
