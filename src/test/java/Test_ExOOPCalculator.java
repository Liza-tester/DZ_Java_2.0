import Packedge_7.ExOOPCalculator;
import org.junit.Assert;
import org.junit.Test;


public class Test_ExOOPCalculator {

    @Test
    public void ExOOPCalculator_empty(){
        ExOOPCalculator calc = new ExOOPCalculator();
        Assert.assertNull( calc.getVar1());
        Assert.assertNull(calc.getVar2());
        Assert.assertNull(calc.getOperation());
    }
    @Test
    public void ExOOPCalculator_full(){
        ExOOPCalculator calc = new ExOOPCalculator(1000.123, -34.777, "*");
        Assert.assertEquals( 1000.123, calc.getVar1(),0);
        Assert.assertEquals(-34.777, calc.getVar2(), 0);
        Assert.assertEquals("*", calc.getOperation());

    }
    @Test
    public void getVar1(){
        ExOOPCalculator calc1 = new ExOOPCalculator();
        Assert.assertNull(  calc1.getVar1());
        ExOOPCalculator calc2 = new ExOOPCalculator(1, 1, "*");
        Assert.assertEquals( 1, calc2.getVar1(),0);
    }
    @Test
    public void getVar2(){
        ExOOPCalculator calc1 = new ExOOPCalculator();
        Assert.assertNull( calc1.getVar2());
        ExOOPCalculator calc2 = new ExOOPCalculator(1, 1, "*");
        Assert.assertEquals( 1, calc2.getVar2(),0);
    }
    @Test
    public void getOperation(){
        ExOOPCalculator calc1 = new ExOOPCalculator();
        Assert.assertNull(calc1.getOperation());
        ExOOPCalculator calc2 = new ExOOPCalculator(1, 1, "qwerty");
        Assert.assertEquals( "qwerty", calc2.getOperation());
    }
    @Test
    public void setVar1(){
        ExOOPCalculator calc = new ExOOPCalculator();
        calc.setVar1(-2);
        Assert.assertEquals( -2, calc.getVar1(),0);
        calc.setVar1(-2.001);
        Assert.assertEquals( -2.001, calc.getVar1(),0);
    }
    @Test
    public void setVar2(){
        ExOOPCalculator calc = new ExOOPCalculator();
        calc.setVar2(-2);
        Assert.assertEquals( -2, calc.getVar2(),0);
        calc.setVar2(-2.001);
        Assert.assertEquals( -2.001, calc.getVar2(),0);
    }
    @Test
    public void setOperation(){
        ExOOPCalculator calc = new ExOOPCalculator();
        calc.setOperation("qwerty");
        Assert.assertEquals( "qwerty", calc.getOperation());
        calc.setOperation("/");
        Assert.assertEquals( "/", calc.getOperation());
    }
    @Test
    public void getResult_withoutErrors(){
        ExOOPCalculator calc1 = new ExOOPCalculator(-100.01,12,"+");
        Assert.assertEquals( -88.01, calc1.getResult(),0);
        ExOOPCalculator calc2 = new ExOOPCalculator(1234,-1.0004,"-");
        Assert.assertEquals( 1235.0004, calc2.getResult(),0);
        ExOOPCalculator calc3 = new ExOOPCalculator(12.1212,12,"/");
        Assert.assertEquals( 1.0101, calc3.getResult(),0);
        ExOOPCalculator calc4 = new ExOOPCalculator(100,-1.03,"*");
        Assert.assertEquals( -103, calc4.getResult(),0);
    }
    @Test
    public void getResult_withDivisionByZero(){
        ExOOPCalculator calc = new ExOOPCalculator(1,0,"/");
        Assert.assertNull(calc.getResult());
    }
    @Test
    public void getResult_withNullElements(){
        ExOOPCalculator calc = new ExOOPCalculator();
        Assert.assertNull( calc.getResult());
        calc.setVar1(1);
        Assert.assertNull( calc.getResult());
        calc.setVar2(1);
        Assert.assertNull( calc.getResult());
        ExOOPCalculator calc1 = new ExOOPCalculator();
        calc1.setVar2(1);
        calc1.setOperation("+");
        Assert.assertNull( calc1.getResult());

    }
    @Test
    public void getResult_withWrongOperator(){
        ExOOPCalculator calc = new ExOOPCalculator(1,0,"qwerty");
        Assert.assertNull(calc.getResult());}

    // Провальный тест для примера
    @Test
    public void failedTest(){
        ExOOPCalculator calc = new ExOOPCalculator();
        calc.setOperation("qwerty");
        Assert.assertNull( calc.getOperation());
    }
}
