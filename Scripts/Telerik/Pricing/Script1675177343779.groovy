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

WebUI.callTestCase(findTestCase('Telerik/Open URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pricing/button_Get A Free Trial_js-tlrk-nav-drawer-button'))

WebUI.click(findTestObject('Object Repository/Pricing/a_Pricing'))

WebUI.click(findTestObject('Object Repository/Pricing/a_Buy now'))

WebUI.click(findTestObject('Object Repository/Pricing/span_Quantity_k-icon k-i-arrow-s'))

WebUI.click(findTestObject('Object Repository/Pricing/div_3'))

WebUI.click(findTestObject('Object Repository/Pricing/span_1 year'))

WebUI.click(findTestObject('Object Repository/Pricing/span_1 year_1'))

WebUI.click(findTestObject('Object Repository/Pricing/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Pricing/input_First Name_biFirstName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Pricing/input_Last Name_biLastName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Pricing/input_E-mail_biEmail'), 'test@test.com')

WebUI.setText(findTestObject('Object Repository/Pricing/input_Company_biCompany'), 'Test')

WebUI.setText(findTestObject('Object Repository/Pricing/input_Phone_biPhone'), '908882222')

WebUI.setText(findTestObject('Object Repository/Pricing/input_Address_biAddress'), 'Test address')

WebUI.click(findTestObject('Object Repository/Pricing/span_Country_k-select'))

WebUI.click(findTestObject('Object Repository/Pricing/li_American Samoa'))

WebUI.setText(findTestObject('Object Repository/Pricing/input_City_biCity'), 'Test')

WebUI.setText(findTestObject('Object Repository/Pricing/input__biZipCode'), '2026')

WebUI.click(findTestObject('Object Repository/Pricing/button_Continue'))

WebUI.click(findTestObject('Object Repository/Pricing/input_Terms and Conditions_licenseAgreementLabel'))

WebUI.click(findTestObject('Object Repository/Pricing/span_Continue to payment'))

WebUI.verifyElementText(findTestObject('Object Repository/Pricing/div_Select all images with motorcycles'), 'Select all images with motorcycles')

