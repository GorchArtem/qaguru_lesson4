package Github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideGit {

    @Test
    void ShouldFindPageSoftAssertionsAndExampleCode(){
        // Открыть страницу Selenide в Github
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();

        //Переход в раздел Wiki проекта
        $("[data-tab-item=i5wiki-tab]").click();

        //Убеждаемся, что в списке страниц (Pages) есть страница SoftAssertions, Открываем страницу SoftAssertions
        $$("#wiki-body li a").findBy(Condition.text("Soft assertions")).click();

        //проверяем, что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(Condition.text("JUnit5 extension - com.codeborne.selenide.junit5.SoftAssertsExtension"));



    }
}
