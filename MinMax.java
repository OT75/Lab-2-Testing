public class MinMax {
    private int []arr;

    public int Max()
    {
        int max = arr[0];
        for (int i=1;i<this.arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public int Min()
    {
        int min = arr[0];
        for (int i=1;i<this.arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public void setArr(int[] array)
    {
        this.arr=array.clone();

    }
    public int[]getArr()
    {
        return this.arr;
    }
}


