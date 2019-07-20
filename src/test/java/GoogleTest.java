import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void search_in_google() {
        open("https://www.google.com");
        $(By.name("q")).setValue("Московский политех").pressEnter();
        $(byText("Московский Политех - Главная страница")).click();
        $(byText("Обучающемуся")).hover();
        $(byText("Расписания")).click();
    }
}