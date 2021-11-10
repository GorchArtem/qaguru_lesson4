package Github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DrugAndDropActions {
    @Test
    void drugAndDrop(){
        //открываем форму драгндропа
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //выполняем перемещение элемента
        $("#column-a").dragAndDropTo("#column-b");

        //проверяем, что элементы поменялись местами
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));
    }
}
