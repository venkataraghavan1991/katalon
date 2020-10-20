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

WebUI.navigateToUrl(URL)

for (def rowNum = 1; rowNum <= findTestData('null').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Object Repository/excel/Page_Login - Software to Manage Blinds from_4df230/input_Company  Name_company_name'), 
        findTestData('null').getValue(1, rowNum))

    WebUI.setText(findTestObject('Object Repository/excel/Page_Login - Software to Manage Blinds from_4df230/input_User Name_user_name'), 
        findTestData('null').getValue(2, rowNum))

    WebUI.setText(findTestObject('Object Repository/excel/Page_Login - Software to Manage Blinds from_4df230/input_Password_user_password'), 
        findTestData('null').getValue(3, rowNum))

    Thread.sleep(2000)
}

WebUI.click(findTestObject('Object Repository/excel/Page_Login - Software to Manage Blinds from_4df230/input_Password_submitButton'))

WebUI.click(findTestObject('Object Repository/excel/Page_Order Search/p_STOCK'))

