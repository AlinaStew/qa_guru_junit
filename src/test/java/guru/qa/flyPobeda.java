package guru.qa;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import guru.qa.data.Language;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

public class flyPobeda {

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

