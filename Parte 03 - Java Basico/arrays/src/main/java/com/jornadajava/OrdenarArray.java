package com.jornadajava;

import java.util.Arrays;

public class OrdenarArray {

    public static void main(String[] args) {
        int[] fibonacci = {144, 3, 2, 1, 8, 21, 233, 5, 34, 55, 89, 13};
        System.out.println(Arrays.toString(fibonacci));
        Arrays.sort(fibonacci);
        System.out.println(Arrays.toString(fibonacci));

    }
}
