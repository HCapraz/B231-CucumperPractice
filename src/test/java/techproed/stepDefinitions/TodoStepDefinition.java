package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.ToDoPage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

import java.util.List;

import static org.apache.commons.collections4.IterableUtils.forEach;

public class TodoStepDefinition {
    Actions actions = new Actions(Driver.getDriver());
    ToDoPage toDoPage = new ToDoPage();

    @Given("go to the url")
    public void goToTheUrl() {
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
    }

    @When("add to the todo list")
    public void addToTheTodoList(List<String> worklist) {

        for (String w : worklist) {
            actions.click(toDoPage.addNewTodo).
                    sendKeys(w).
                    sendKeys(Keys.ENTER).
                    perform();
        }

    }

    @And("cross off all todo items")
    public void crossOffAllTodoItems() {
        List<WebElement> todos = toDoPage.toDoList;

        todos.forEach(WebElement::click);

    }

    @And("delete all todo items")
    public void deleteAllTodoItems() {

        toDoPage.toDoDeleteButtons.forEach(WebElement::click);
    }

    @Then("verify that all todo items have been deleted")
    public void verifyThatAllTodoItemsHaveBeenDeleted() {
        WaitUtils.waitFor(2);
        List< WebElement> toDoList;
        Assert.assertTrue(toDoPage.toDoList.isEmpty());
    }

    @And("close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();
    }
}
