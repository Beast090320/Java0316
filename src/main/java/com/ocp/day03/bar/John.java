
package com.ocp.day03.bar;

/*+ public : 所有 class 皆可存取
  # protected : 同一資料夾可存取，不同資料夾需要 extends(繼承) 指令才可存取
  ~ 無/packaged : 在同一資料夾可存取
  - private : 只有本身class可存取 */

public class John {
    public int a = 100;
    protected int b = 200;
    int c = 300;
    private int d = 400;
    
    public void print(){
        System.out.print("John:   ");
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        System.out.print(c + ", ");
        System.out.print(d + "\n");
    }
    
    
}
