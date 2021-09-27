//package edu.neu.coe.info6205.util;
//
//import edu.neu.coe.info6205.sort.elementary.InsertionSort;
//
//import java.util.Scanner;
//import java.util.*;
//import java.util.concurrent.TimeUnit;
//
//public class TimerBenchmarkTest {
//
////    public double[]nums = new double[30];
////
////    public void insertion(int arr[]){
////        int n = arr.length;
////        for (int i = 1; i < n; ++i) {
////            int key = arr[i];
////            int j = i - 1;
////
////            /* Move elements of arr[0..i-1], that areS
////               greater than key, to one position ahead
////               of their current position */
////            while (j >= 0 && arr[j] > key) {
////                arr[j + 1] = arr[j];
////                j = j - 1;
////            }
////            arr[j + 1] = key;
////        }
////    }
////
////    public void createarr(int order){
////
////        InsertionSort is = new InsertionSort();
////        TimerBenchmarkTest tbt = new TimerBenchmarkTest();
////
////        Benchmark_Timer<Integer[]> bt = new Benchmark_Timer<>("Benchmark Timer", null, (b) -> is.sort(b, 0, b.length), null );
////        if (order == 1){
////            Random r = new Random();
////            int arr1[];
////            for (int i = 200; i<10000; i= i*2) {
////                int c = 0;
////                int[] arr = new int[i];
////                for (int j = 0; j < i; j++) {
////                    arr[j] = r.nextInt();
////                }
////                Arrays.sort(arr);
////                long start1 = System.nanoTime();
////                for (int l = 0; l < 20; l++) {
////                    tbt.insertion(arr);
////                }
////                long end1 = System.nanoTime();
////                long out1 = end1  - start1;
////                double durationInMs = TimeUnit.NANOSECONDS.toMillis(out1);
////                tbt.nums[c] = durationInMs/20;
////                //TimerBenchmarkTest.array[c] = durationInMs;
////
////            }
////            for (Double me1 : nums){
////                    System.out.println(me1);
////            }
////
////
//////            for (Integer me1 : arr) {
//////                System.out.println(me1);
//////        }
////        }
////        else if (order == 2){
////
////        }
////        else if(order ==3 ){
////
////        }
////        else if (order == 4){
////
////        };
////
////    }
////    public static long toMillisecs(long ticks) {
////        // TO BE IMPLEMENTED
////        long durationInMs = TimeUnit.NANOSECONDS.toMillis(ticks);
////        return durationInMs;
////    }
////    public static void main(String[] args) {
////        TimerBenchmarkTest tbt = new TimerBenchmarkTest();
////
////        int[] a = {56, 84, 21, 3, 4, 23, 46, 948, 315, 48, 56, 78, 231, 495, 98};
////        int[] b = {2, 9, 12, 21, 53, 94, 481, 511, 739, 956, 1056, 10648, 86414};
////        int[] c = {10, 3, 40, 20, 50, 80, 70};
////        int[] d = {50, 45, 40, 30, 20, 10};
////
////        System.out.println("Enter your choice:");
////        System.out.println("1) Random\n" +
////                "2) Ordered \n" +
////                "3) Partially Ordered \n" +
////                "4) Reverse Ordered");
////
////
////        Scanner sc = new Scanner(System.in);
////        int u = sc.nextInt();
////
////        tbt.createarr(u);
////        int n, count = 0;
////        System.out.println(" Enter N:-");
////        n = sc.nextInt();
////        //int doub = 1;
////        long end = 0;
////        double[] arr2 = new double[5];
////        long output;
////        while (count < 5) {
////
////
////            long start = System.nanoTime();
////            for (int i = 0; i < n; i++) {
////                tbt.insertion(a);
////
////            }
////            end = System.nanoTime();
////            //arr2[count] = TimerBenchmarkTest.toMillisecs(end - start);
////            output = TimerBenchmarkTest.toMillisecs(end - start);
////
////
////            System.out.println("Running the program for" + n + " times" +" which is executed in "+ output);
////
////            n *= 2;
////            //InsertionSort.sort(T);
////            count += 1;
////        }
//////        for (Double me : arr2) {
//////            System.out.println(me);
//////        }
////
////    }
//    InsertionSort ins_sort = new InsertionSort();
//
//    //Instantiate Benchmark_Timer class to perform Benchmark Test
//    Benchmark_Timer<Integer[]> benchTimer = new Benchmark_Timer<>("Benchmark Test", null, (x) -> ins_sort.sort(x, 0, x.length), null);
//
//    //Create a randomly ordered array and run benchmark test
//        for(int i = 200; i < 10000; i = i*2) {
//
//        int j = i;
//
//        //Provide a randomly ordered array of size j to supplier
//        Supplier<Integer[]> supplier = () -> {
//            Random random = new Random();
//            Integer[] arr = new Integer[j];
//
//            //Generate the random array
//            for(int k = 0; k < j; k++) {
//                arr[k] = random.nextInt(j);
//            }
//            return arr;
//        };
//
//        //Time taken by insertion sort to run 10 times
//        double time = benchTimer.runFromSupplier(supplier, 10);
//
//        System.out.println("Value of N: " + i + " Order Situation- Randomly Ordered" + " Time Taken: " + time);
//    }
//
//        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
//
//    //Create an ordered array and run benchmark test
//        for(int i = 200; i < 10000; i = i*2) {
//
//        int j = i;
//
//        //Provide an ordered array of size j to supplier
//        Supplier<Integer[]> supplier = () -> {
//            Random random = new Random();
//            Integer[] arr = new Integer[j];
//
//            //Generate the array
//            for(int k = 0; k < j; k++) {
//                arr[k] = random.nextInt(j*100);
//            }
//
//            //Sort the array
//            Arrays.sort(arr);
//            return arr;
//        };
//
//        //Time taken by insertion sort to run 10 times
//        double time = benchTimer.runFromSupplier(supplier, 10);
//
//        System.out.println("Value of N: " + i + " Order Situation- Ordered" + " Time Taken: " + time);
//
//    }
//
//        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
//
//    //Create a partially ordered array and run benchmark test
//        for(int i = 200; i < 10000; i = i*2) {
//        int j = i;
//
//        //Provide the array of size j to supplier
//        Supplier<Integer[]> supplier = () -> {
//            Random random = new Random();
//            Integer[] arr = new Integer[j];
//
//            //Generate the array
//            for(int k = 0; k < j; k++) {
//                arr[k] = random.nextInt(j*100);
//            }
//
//            //Sort the array
//            Arrays.sort(arr);
//
//            //Rearrange half the array elements
//            int rearrange = (int) (0.5*j);
//
//            //Generate index to rearrange the array
//            for(int i1 = 0; i1 < rearrange; i1++) {
//                int index = random.nextInt(j);
//                arr[index] = random.nextInt(j*100);
//            }
//
//            return arr;
//        };
//
//        //Time taken by insertion sort to run 10 times
//        double time = benchTimer.runFromSupplier(supplier, 10);
//
//        System.out.println("Value of N: " + i + " Order Situation- Partially Ordered" + " Time Taken: " + time);
//
//    }
//
//        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
//
//    //Create a reverse ordered array and run benchmark test
//        for(int i = 200; i < 10000; i = i*2) {
//        int j = i;
//
//        //Provide the array of size j to supplier
//        Supplier<Integer[]> supplier = () -> {
//            Random random = new Random();
//            Integer[] arr = new Integer[j];
//
//            //Generate the array
//            for(int k = 0; k < j; k++) {
//                arr[k] = random.nextInt(j);
//            }
//
//            //Sort the array in reverse manner
//            Arrays.sort(arr, Collections.reverseOrder());
//            return arr;
//        };
//
//        //Time taken by insertion sort to run 10 times
//        double time = benchTimer.runFromSupplier(supplier, 10);
//
//        System.out.println("Value of N: " + i + " Order Situation- Reverse Ordered" + " Time Taken: " + time);
//    }
//
//
//}
