import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('x-reusable/00_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'),Keys.chord(Keys.DOWN, Keys.ENTER))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> tableElements = driver.findElements(By.cssSelector('.inventory_item_name'))

ArrayList<String> tableValues = new ArrayList<String>()

for (int i = tableElements.size()  - 1; i >= 0; i--) {
    String str = tableElements.get(i).getText()

    tableValues.add(str)
}

ArrayList<String> referenceValues = new ArrayList<String>()

for (int i = tableValues.size() - 1 ; i >= 0; i--) {
    referenceValues.add(tableValues.get(i))
}

Collections.sort(referenceValues)

assert referenceValues.equals(tableValues)

WebUI.closeBrowser()
