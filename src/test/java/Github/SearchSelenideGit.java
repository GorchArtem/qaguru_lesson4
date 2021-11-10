package Github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideGit {

    @Test
    void ShouldFindPageSoftAssertionsAndExampleCode(){
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();

    }
}
