class Rotate
{
    int[] A = {0,0,1,1,1,2,2,3,3,3,4,4,4,4,4};
      int n = A.length;
     int k = 0;

     public int returnNum()
     {
     for(int i=0; i<n-1; i++)
      {
        for(int j=i+1; j<n; j++)
        {
            if(A[i] != A[j]) k++;
            
            if(A[i] == A[j])
            {
                A[i] = A[j];
                A[j] = A[j+1];
            }
        }
              System.out.print(A[i] + " ");
      }
      return k;
    }     
}

class RotateArray2
{
    public static void main(String A[])
    {
        Rotate robj = new Rotate();
    robj.returnNum();
    }
}