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

WebUI.callTestCase(findTestCase('Incredible Connection/Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Voucher/a_Buy  Get Registration'))

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Voucher/input_First Name_field149'), 'Voucher')

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Voucher/input_CellPhone_field150'), '0784492053')

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Voucher/div_Cookie and privacy policy_btn-cookie-allow'))

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Voucher/input_Last name_field151'), 'Test')

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Voucher/input_Street Address_field152'), 'Test address')

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Voucher/input_E-mail Address_field153'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Voucher/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Incredible Connection/Voucher/div_This is a required field'), 
    'This is a required field.')

