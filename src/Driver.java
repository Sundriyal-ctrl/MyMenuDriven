class Test
{
    public void TestGet(int arr[],int i)
    {
        if(i>=arr.length)
            return;
        System.out.println(arr[i]);
        TestGet(arr,i=i+1);
    }
    public void FindMax(int arr[])
    {
        int s=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if(s<arr[i])
                s=arr[i];
        }
        System.out.println(s);
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
        int arr[] = new int[]{2,15,1,100,70};
        Test t = new Test();
        System.out.println("==============First==================");
        t.TestGet(arr,0);
        System.out.println("==============Second=================");
        t.FindMax(arr);
        System.out.println("==============Third===================");
        t.ThridLargest(arr,3);
        //Find the greatest value;
        //indivial

    }
}
