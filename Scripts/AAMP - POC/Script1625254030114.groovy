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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://azpbizsvr01:444/AAS_DEV/')

WebUI.setText(findTestObject('Object Repository/Page_Bizagi BPM/input_User_username'), 'jacob.miller1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bizagi BPM/input_Password_password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/div_Pending'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/li_Pageof 2_control-icon forward-ico'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/span_Work on it'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/span_Work on it'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/label_Licenes_ui-checkbox-state-hover'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/input_Configure Pages_formButton0'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/a_Me'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/h4_Pending'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/li_Pageof 2_control-icon forward-ico'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/li_Work on it'))

WebUI.click(findTestObject('Object Repository/Page_Bizagi BPM/span_Work on it'))

