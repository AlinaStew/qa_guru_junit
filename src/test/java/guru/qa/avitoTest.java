package guru.qa;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;

public class avitoTest {

    @BeforeEach
    void setUp() {
        open("https://www.avito.ru/");
        Configuration.browserSize = "1920x1080";
    }

    @ValueSource(strings = {"ноутбук", "наушники", "мышь"})
    @ParameterizedTest(name = "Для поискового запроса {0} должен быть не пустой список")
    void successfulSearchTest(String searchQuery){
        $(by("data-marker", "search-form/suggest/input")).setValue(searchQuery).pressEnter();
        $$(by("data-marker", "item")).shouldBe(CollectionCondition.sizeGreaterThan(0));
    }
}
