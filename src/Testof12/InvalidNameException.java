package Testof12;

public class InvalidNameException extends Exception{
    InvalidNameException()
    {
        super();
    }
    InvalidNameException(String exp)
    {
        super(exp);
    }
    InvalidNameException(Throwable t ,String exp)
    {
        super(exp,t);
    }
    InvalidNameException(Throwable t)
    {
        super(t);
    }
    public String getMessage()
    {
        return "Invalid  Name Exception";
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
