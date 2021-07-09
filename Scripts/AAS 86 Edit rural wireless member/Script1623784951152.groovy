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

WebUI.navigateToUrl('https://aap-development.fcc.gov/2/legal-classification')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Auction Application Portal/select_NoYes'), '2: true', true)

WebUI.click(findTestObject('Page_Auction Application Portal/button_Add Row'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Auction Application Portal/select_EntityIndividual'), '1: entity', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Auction Application Portal/input__formly_17_input_entity_name_1'), 
    'Acme')

WebUI.waitForElementClickable(findTestObject('Page_Auction Application Portal/button_Add Member'), 0)

WebUI.click(findTestObject('Page_Auction Application Portal/button_Add Member'))

WebUI.click(findTestObject('Object Repository/Page_Auction Application Portal/button_Edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Auction Application Portal/input__formly_17_input_entity_name_1'))

WebUI.setText(findTestObject('Object Repository/Page_Auction Application Portal/input__formly_17_input_entity_name_1'), 
    'Westat')

WebUI.click(findTestObject('Object Repository/Page_Auction Application Portal/button_Save'))

