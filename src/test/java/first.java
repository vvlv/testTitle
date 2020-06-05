import org.junit.Test;


public class first  extends WDSetup{





@Test
 public void giveMeTitle () throws InterruptedException {
    TitleCheck tests = new TitleCheck(WDSetup.driver);
    tests.goMail();
tests.test();


}



}
