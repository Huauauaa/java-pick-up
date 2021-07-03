package com.hua.util;

public class BubbleSort {
  public static void main(String[] args) {
    int[] o = new int[] { 2, 1, 4, 3 };

    for (int i = 0, len = o.length - 1; i < len; i++) {
      for (int j = 0, l = o.length - 1 - i; j < l; j++) {
        int a = o[j];
        int b = o[j + 1];

        if (a > b) {
          int temp = o[j];
          o[j] = o[j + 1];
          o[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < o.length; i++) {
      System.out.println(o[i]);
    }
  }
}
