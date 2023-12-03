package proyectos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,1,1000,3,7,80,2,0};
        for ( int i=0; i<8;i++)
        {
            for (int j = i+1; j<8; j++)
            {
                int temporal;
                if(arr[i]>arr[j])
                {
                    temporal = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temporal;
                }
            }
        }
        for(int i=0; i<8; i++)
        {
            System.out.println(arr[i]);
        }

    }
}

