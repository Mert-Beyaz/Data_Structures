public class MergeSort {
    public int[] merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < c.length) {
            if (a[i] < b[j]) {
                c[k] = a[i++];
                if (i==a.length) {
                    while (j < b.length) {
                        c[k++] = b[j++];
                    }
                }
            }else{
                c[k] = b[j++];
            }
            k++;
        }
        return c;
    }
}
