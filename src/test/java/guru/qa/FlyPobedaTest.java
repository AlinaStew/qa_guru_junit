package guru.qa;

import com.codeborne.selenide.Configuration;
import guru.qa.data.Language;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class FlyPobedaTest {

    @BeforeEach
    void setUp() {
        open("https://www.flypobeda.ru/");
        Configuration.browserSize = "1920x1080";
    }

    public static void main(String[] args) {
        System.out.println(Language.RU.description);
        System.out.println(Language.EN.description);
    }
    }

