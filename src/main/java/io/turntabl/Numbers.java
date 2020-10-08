package io.turntabl;

public class Numbers {
    public static boolean isGreaterThanZeroAndLessThanAThousand(int i){
        return greaterThanZero(i) && lessThanAThousand(i);
    }

    private static boolean grea terThanZero(int i){
        return i > 0;
    }

    private static boolean lessT hanAThousand(int i){
        return i < 1000;
    }
}
