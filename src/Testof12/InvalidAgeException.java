package Testof12;

public class InvalidAgeException extends Exception{
    InvalidAgeException()
    {
        super();
    }
    InvalidAgeException(String exp)
    {
        super(exp);
    }
    InvalidAgeException(Throwable t ,String exp)
    {
        super(exp,t);
    }
    InvalidAgeException(Throwable t)
    {
        super(t);
    }
    public String getMessage()
    {
        return "Invalid Age Exception";
    }
    public String toString()
    {
        return this.getMessage();
    }
    public void printStack()
    {
        printStackTrace(System.err);
    }
}
