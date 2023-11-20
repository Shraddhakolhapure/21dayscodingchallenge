//given {1,2,3} array print{6,3,2} mulply every elemnt except a[i]
public class CodingMafia1 {
    public static void main(String[] args)
    {
        int[] a={1,2,3};
        int n=a.length;
        int[] sol=printnum(a,n);
        printsol(sol,n);
    } 
    public static int[] printnum(int[] a, int n) {
        int[] pro = new int[n];
    for (int i = 0; i < n; i++) {
        pro[i] = 1; // Initialize the product at i to 1

        // Calculate product excluding the current index i
        for (int j = 0; j < n; j++) {
            if (j != i) {
                pro[i] *= a[j];
            }
        }
    }
    return pro;
}

    public static void printsol(int[] pro,int n)
    {
        for(int i=0;i<n;i++)
        {
          System.out.print(pro[i]+" ") ;
        }
    }
}
