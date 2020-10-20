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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://blindjunction.net/#/login?companyname=BMDEMO')

WebUI.setText(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/input_Customer Name_form-control ng-untouch_4ed290'), 
    'latha')

WebUI.setEncryptedText(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/input_Password_form-control ng-untouched ng_8b7ecf'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/a_Create New'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/a_Create New'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/a_Submitted Orders'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/a_Unsubmitted Orders'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/a_Jobs In Progress'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/mat-icon_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Onlineorderlogincheck/Page_OnlineOrdering/button_Sign Out'))

WebUI.closeBrowser()

