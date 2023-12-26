package C15AnonymousLambda;

public class C1503LambdaExpression {
    public static void main(String[] args) {

//        실행문 1줄일때는 {} 제외하고 return 생략
//        LambdaInterface lambdaInterface = (a, b) -> a+b;
//        실행문 2줄 이상일때에는 {} 사용하여 return 필요
        LambdaInterface lambdaInterface = (a, b, c) -> { // 매개변수를 순서로 인지하므로, 타입을 지정해줄 필요는 없다.
            String answer = a+b;
            return answer;
        };
        System.out.println(lambdaInterface.makeString("hello", "java", 0));
    }
}

interface LambdaInterface {
    String makeString(String a, String b, int c);
}
