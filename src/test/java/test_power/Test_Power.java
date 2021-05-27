package test_power;

import com.ocp.day29_assert.Power;
import junit.framework.Assert;
import org.junit.Test;

public class Test_Power {
    @Test
    public void t1() {
        // 3A
        Power power = new Power();
        int a = 100;
        int v = 220;
        int exp_w = 22000;
        int act_w = power.getW(v, a);
        Assert.assertEquals(exp_w, act_w);
    }
    @Test
    public void t2(){
        Power power =new Power();
        int w = 22000;
        int v = 220;
        int exp_a = 100;
        int act_a = power.getA(w ,v);
        Assert.assertEquals(exp_a, act_a);
    }
    @Test
    public void t3(){
        Power power =new Power();
        int w = 10;
        int a = 2;
        int exp_v = 5;
        int act_v = power.getV(w ,a);
        Assert.assertEquals(exp_v,act_v);
    }
}
