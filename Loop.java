package MarvellousX.PPA;                 // Nested Package

public class Loop
{
    public void Display()
    {
        int Arr[] = new int[4];

        Arr[0] = 10;
        Arr[2] = 20;
        Arr[3] = 30;
        Arr[4] = 40;

        System.out.println("Elements of array are : ");


        for (int iCnt = 0; iCnt < Arr.length; iCnt++ )
        {
            System.out.println(Arr[iCnt]);
        }
    }
}