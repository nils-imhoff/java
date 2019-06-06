
public class MyException extends Exception{

    public MyException() {
        try {
            int i = 5;
            MyException.calculate(5);
        } catch(MyException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }



    
    public MyException(String message) { super(message); }


    public static void calculate(int i) throws MyException{
        throw new MyException ("Something happened");
    }


    public static void main(String[] args) {
        new MyException();
    }
}


