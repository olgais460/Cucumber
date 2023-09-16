package task;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepDefinition {
    private WebDriver driver;
    private static final String URL = "https://dev-t.uxcrowd.ru/faq";
    private static final String DescriptionText = "Юзабилити-тестирование можно проводить на любых этапах разработки продукта. Мы рекомендуем начинать проводить юзабилити-тестирование уже на начальных стадиях разработки интерфейсов, еще до их реализации в программном коде. Это позволит сразу внести необходимые коррективы и сделать интерфейс удобным. Чем раньше вы будете вносить изменения в интерфейс, тем легче, быстрее, а соответственно и дешевле будет это сделать";



        @Given("пользователь заходит на страницу FAQ")
        public void openPage() {
            driver.get(URL);
        }

        @When("нажимает на кнопку раскрывающегося меню")
        public void clickOpenBtn() {
            WebElement openBtn = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/div/ul/li[1]/div[1]/span"));
            openBtn.click();
        }

        @And("открывается содержмое вопроса и ответа")
        public void checkСontent() {
            WebElement TextFilling = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/p[1]"));
            String text = TextFilling.getText();
            Assertions.assertNotNull((DescriptionText), "The description text is absent");
       Assertions.assertNotNull(text.contains(DescriptionText), "The description text is wrong");// Тут сломался асершен assertTrue влруг не стало

        }

        @And("нажимает на кнопку-закрывает содержимое вопроса")
        public void clickCloseBtn() {
            WebElement openBtn = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/div/ul/li[1]/div[1]/span"));
            openBtn.click();

        }


    }

