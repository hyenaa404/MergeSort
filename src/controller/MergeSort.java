package controller;


/**
 *
 * @author nhs
 * @param <T>
 */
public class MergeSort<T extends Comparable<T>> {

    private T[] a;

    public MergeSort(T[] array) {
        this.a = array;
    }

    public void sort() {
        mergeSort(0, a.length - 1);
    }

    private void mergeSort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }


    void merge(int p, int q, int r) {
        if (!(p <= q) && (q <= r)) {
            return;
        }
        int n, i, j, k;
        n = r - p + 1;
        T[] b = (T[]) new Comparable[n];
        i = p;
        j = q + 1;
        k = 0;
        while (i <= q && j <= r) {
            if (a[i].compareTo(a[j])<0) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        while (i <= q) {
            b[k++] = a[i++];
        }
        while (j <= r) {
            b[k++] = a[j++];
        } 
        k = 0;
        for (i = p; i <= r; i++) {
            a[i] = b[k++];
        }
        
    }
    public T[] getSortedArray() {
        return a;
    }

}
