import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TitleCheck {

    private WebDriver driver;


    //Создать лист и сканер, Сканером считывать файл где перечислены урл
    //записывать каждый урл в новый индекс
    //После создать метод в котором будет передача урла в переменную в цикле

    //1. Перейти на майл ру
        private String url = "https://mkb.ru/";
    //Тут переделать на передачу значения из листа

        //  Проверка на титл
        private String title = "МКБ – мечта, которая будет! Кредиты на любые цели, ипотека, карты, вклады";
        private String actualTitle = WDSetup.driver.getTitle();
        private String expectedTitle = title;
        private boolean titleproverka = actualTitle.equals(expectedTitle);





    public TitleCheck(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;   }

    public void goMail (){
        driver.get(url);
        this.actualTitle = driver.getTitle();
        String expectedTitle = this.title;
        titleproverka = actualTitle.equals(expectedTitle);
    }
public  void test () {
        if (this.titleproverka) {System.out.println("Заголовок на "+this.url+"совпадает");}
        else {System.out.println("Заголовок на "+this.url+" НЕ совпадает");}
    System.out.println("Актуальный титл: "+actualTitle);
    System.out.println("Ожидаемый титл: "+expectedTitle);
}

}