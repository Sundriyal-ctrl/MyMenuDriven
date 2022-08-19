package Testof12;

class CheckDetail
{
    void checkAge(String age)
    {

        try {
            boolean a=false;
                char aa[]=age.toCharArray();
                for(int i=0;i<aa.length;i++) {
                    if (Character.isDigit(aa[i]))
                        a=true;
                    else
                        throw new InvalidAgeException("Invalid age Exception " + age);
                }
                if(a)
                {
                    System.out.println("valid age");
                }
        }catch(InvalidAgeException e)
        {
            e.printStack();
        }

    }
    void checkName(String name)
    {
        try {
            boolean f=false;
            char a[]=name.toCharArray();
            for(int i=0;i<a.length;i++)
            {
                if((a[i]>=65 && a[i]<=90) || (a[i]>97 && a[i]<=122)) {
                    f=true;
                }
                else
                    throw new InvalidNameException("Invalid Name "+name);
            }
            if(f==true)
            System.out.println(name);
       }catch(InvalidNameException e)
        {
            e.printStack();
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        CheckDetail checkDetail =  new CheckDetail();
        checkDetail.checkAge("anuj");
        checkDetail.checkName("Rt45");
    }
}
