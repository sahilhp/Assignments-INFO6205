/*
  (c) Copyright 2018, 2019 Phasmid Software
 */
package edu.neu.coe.info6205.sort.elementary;

import edu.neu.coe.info6205.sort.BaseHelper;
import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.SortWithHelper;
import edu.neu.coe.info6205.util.Config;

import java.util.Arrays;

public class InsertionSort<X extends Comparable<X>> extends SortWithHelper<X> {

    /**
     * Constructor for any sub-classes to use.
     *
     * @param description the description.
     * @param N           the number of elements expected.
     * @param config      the configuration.
     */
    protected InsertionSort(String description, int N, Config config) {
        super(description, N, config);
    }

    /**
     * Constructor for InsertionSort
     *
     * @param N      the number elements we expect to sort.
     * @param config the configuration.
     */
    public InsertionSort(int N, Config config) {
        this(DESCRIPTION, N, config);
    }

    public InsertionSort(Config config) {
        this(new BaseHelper<>(DESCRIPTION, config));
    }

    /**
     * Constructor for InsertionSort
     *
     * @param helper an explicit instance of Helper to be used.
     */
    public InsertionSort(Helper<X> helper) {
        super(helper);
    }

    public InsertionSort() {
        this(BaseHelper.getHelper(InsertionSort.class));
    }

    /**
     * Sort the sub-array xs:from:to using insertion sort.
     *
     * @param xs   sort the array xs from "from" to "to".
     * @param from the index of the first element to sort
     * @param to   the index of the first element not to sort
     */
    public void sort(X[] xs, int from, int to) {
        final Helper<X> helper = getHelper();
       // helper.swapIntoSorted(xs, from);
//        int n = from - to;
//        for (int i = from + 1 ; i< n + 1 ; i++)
//        {
//            for ( int j = i - 1; j>=0; j--)
//                if( (xs[j]).compareTo(xs[j+1])>0){
//                   helper.swap(xs,j,j+1);
//                }
//                else{
//                    break;
//              }
//        }
        for (int i = from; i < to; i++) {
            X key = xs[i];
            int j = i - 1;
            while (j >= from && !helper.less(xs[j],key)) {
                helper.swap(xs, j, j+1);
                j = j - 1;
            }
            xs[j + 1] = key;
        }
//        int n = from - to ;
//        n+=1;
//        for (int i = from; i < n; ++i) {
//            X key = xs[i];
//            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
//               of their current position */
//            while (j >= 0 && xs[j] > key) {
//                xs[j + 1] = xs[j];
//                j = j - 1;
//            }
//            xs[j + 1] = key;
//        }
////        Arrays.sort(xs, from, to);
//        for (int i = from;
//                j = i
//        while j>1 and a[j-1]>a[j]
//        swap(a[j-1],a[j])
//        j=j-1

        // TO BE IMPLEMENTED
    }

    public static final String DESCRIPTION = "Insertion sort";

    public static <T extends Comparable<T>> void sort(T[] ts) {
        new InsertionSort<T>().mutatingSort(ts);
    }
}
