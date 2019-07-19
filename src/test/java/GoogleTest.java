import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void search_in_google() {

//        WebDriver webDriver = new ChromeDriver() {
//            @Override
//            public void get(String url) {
//
//            }
//
//            @Override
//            public String getCurrentUrl() {
//                return null;
//            }
//
//            @Override
//            public String getTitle() {
//                return null;
//            }
//
//            @Override
//            public List<WebElement> findElements(By by) {
//                return null;
//            }
//
//            @Override
//            public WebElement findElement(By by) {
//                return null;
//            }
//
//            @Override
//            public String getPageSource() {
//                return null;
//            }
//
//            @Override
//            public void close() {
//
//            }
//
//            @Override
//            public void quit() {
//
//            }
//
//            @Override
//            public Set<String> getWindowHandles() {
//                return null;
//            }
//
//            @Override
//            public String getWindowHandle() {
//                return null;
//            }
//
//            @Override
//            public TargetLocator switchTo() {
//                return null;
//            }
//
//            @Override
//            public Navigation navigate() {
//                return null;
//            }
//
//            @Override
//            public Options manage() {
//                return null;
//            }
//        };

        open("https://www.google.com");
        $(By.name("q")).setValue("Московский политех").pressEnter();
        $(byText("Московский Политех - Главная страница")).click();
        $(byText("Обучающемуся")).hover();
        $(byText("Расписания")).click();

    }
}
