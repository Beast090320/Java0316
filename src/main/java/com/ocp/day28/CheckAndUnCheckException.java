package com.ocp.day28;

/*
Checked Exception: 受檢例外
UnChecked Exception: 非受檢例外(Error, RuntimeException)
 */
public class CheckAndUnCheckException {

    public static void main(String[] args) {
        /*
        UnChecked Exception: 非受檢例外
        一遇到不是立即停止程式就是程式碼不夠堅固
        立即停止: Error
        程式碼不夠堅固: RuntimeException
         */
        int x = 10;
        int y = 0;
        if (y != 0) { // 避免ArithmeticException(數學錯誤)的發生
            int avg = x / y;
            System.out.println(avg);
        }

        int[] nums = null;
        if (nums != null) { // 避免NullPointerException
            if (nums.length > 0) {
                System.out.println(nums[0]);
            }
        }

    }
}
