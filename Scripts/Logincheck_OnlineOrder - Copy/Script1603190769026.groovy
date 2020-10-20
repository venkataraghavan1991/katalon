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

for (def rowNum = 1; rowNum <= findTestData('Online_login').getRowNumbers(); rowNum++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl(findTestData('Online_login').getValue(1, rowNum))

    WebUI.takeFullPageScreenshotAsCheckpoint('')

    WebUI.setText(findTestObject('Object Repository/Page_OnlineOrdering/input_Customer Name_form-control ng-untouch_4ed290'), 
        findTestData('Online_login').getValue(2, rowNum))

    WebUI.setText(findTestObject('Object Repository/Page_OnlineOrdering/input_Password_form-control ng-untouched ng_8b7ecf'), 
        findTestData('Online_login').getValue(3, rowNum))

    WebUI.click(findTestObject('Object Repository/Page_OnlineOrdering/button_LOG IN'))

    WebUI.click(findTestObject('Page_OnlineOrdering/Page_OnlineOrdering/mat-icon_arrow_drop_down'))

    WebUI.click(findTestObject('Page_OnlineOrdering/Page_OnlineOrdering/button_Sign Out'))

    WebUI.closeBrowser()
}

