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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://blindjunction.co.uk/testingsource/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Junction_Login/Page_Login - Software to Manage Blinds from_4df230/input_Company  Name_company_name'), 
    'DONSMITH')

WebUI.setText(findTestObject('Object Repository/Junction_Login/Page_Login - Software to Manage Blinds from_4df230/input_User Name_user_name'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Junction_Login/Page_Login - Software to Manage Blinds from_4df230/input_Password_user_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Junction_Login/Page_Login - Software to Manage Blinds from_4df230/input_Password_submitButton'))

WebUI.waitForPageLoad(5)

WebUI.getWindowTitle()

