class Test
{
    public void TestGet(int arr[],int i)
    {
        if(i>=arr.length)
            return;
        System.out.println(arr[i]);
        TestGet(arr,i=i+1);
    }
    public int FindMax(int arr[],Integer i,int index)
    {
        if(i>=arr.length)
            return i;
        else {
            if(i<arr[index])
                i=arr[index];
            FindMax(arr,i,index=index+1);
        }

        return i;
    }
    public void ThridLargest(int arr[],int index)
    {
        int first=Integer.MIN_VALUE,second=0,Third=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second)
            {
                Third = second;
                second=arr[i];
            }
            else {
                Third=arr[i];
            }
        }
        System.out.println(Third);
    }
}
public class Driver {
    public static void main(String[] args) {
        int arr[] = new int[]{90,15,1,100,70};
        Test t = new Test();
        System.out.println("==============First==================");
        t.TestGet(arr,0);
        System.out.println("==============Second=================");
        System.out.println(t.FindMax(arr,Integer.MIN_VALUE,0));
        System.out.println("==============Third===================");
        t.ThridLargest(arr,3);
        //Find the greatest value;
        //indivial
        Integer ii[]= new Integer[5];


    }
}
