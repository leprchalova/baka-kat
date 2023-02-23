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

WebUI.callTestCase(findTestCase('x-reusable/00_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/a_Close Menu_shopping_cart_link'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/div_1Sauce Labs Backpackcarry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.29.99Remove'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Swag Labs/button_Checkout'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/span_Checkout Your Information'))

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_firstName'), 'Test')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_lastName'), 'Testovan')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_postalCode'), '111 11')

WebUI.click(findTestObject('Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/span_Checkout Overview'))

WebUI.click(findTestObject('Page_Swag Labs/button_Finish'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'))

WebUI.closeBrowser()

