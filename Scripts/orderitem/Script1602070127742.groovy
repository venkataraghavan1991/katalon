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

WebUI.navigateToUrl('https://blindjunction.co.uk/finaltesting/')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Login - Software to Manage Blinds from_4df230/input_Company  Name_company_name'), 
    'DONSMITH')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Login - Software to Manage Blinds from_4df230/input_User Name_user_name'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/orderitem/Page_Login - Software to Manage Blinds from_4df230/input_Password_user_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/orderitem/Page_Login - Software to Manage Blinds from_4df230/input_Password_submitButton'))

WebUI.click(findTestObject('Junction_Login/Page_Create New/Page_Create New/Page_Create New/li_CREATE NEW'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/div_Select ProductDF11 Roof Window Blind (V_99942c'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/input'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/div_cust_seq_ui-jqgrid-bdiv'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/div_Select ProductDF11 Roof Window Blind (V_99942c'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/li_Roller'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/input_Quantity_qty'))

WebUI.selectOptionByValue(findTestObject('Object Repository/orderitem/Page_Create New/select_SelectMinimum width for Soft Rise an_20258e'), 
    '2986', true)

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/input_Room_1874'), 'halll')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/input_Width_width'), '500')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/input_Drop_drope'), '1000')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/textarea_Skirting Tiles Dado Rail Width_1876'), 
    '1000')

WebUI.selectOptionByValue(findTestObject('Object Repository/orderitem/Page_Create New/select_SelectBlind SizeRecess SizeCloth Siz_96d7ee'), 
    '2959', true)

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/span_Save'))

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/input_Characters_accref'))

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/input_Characters_surname'), 'Usha')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/input_Characters_address'), 'Test')

WebUI.setText(findTestObject('Object Repository/orderitem/Page_Create New/input_Characters_city'), 'Test')

WebUI.click(findTestObject('Object Repository/orderitem/Page_Create New/img_Characters_button'))

WebUI.verifyElementText(findTestObject('Object Repository/orderitem/Page_Prathyusha/input_Signature_salesorder_no'), '')

WebUI.closeBrowser()

