package org.line.learn.exception;

public class Test {
    public static void main(String[] args) {
        try {
            ge();
        }catch (goingException e){
            System.out.println("going");
        }catch (RuntimeException e){
            System.out.println("run");
        }catch (Exception e){
            System.out.println("213123213123");
        }
    }

    private static void ge() throws  Exception{
        if(1==1){
            throw new goingException("自定义异常");
        }
    }


}
