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

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/a_Payment'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/img_Affordable Payment Options_pagebuilder-_f36f34'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/label_Yes'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/label_Yes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR_Incredible Connection/Payment/select_Select your title.MsMrDrMissMrsProfR_7c4aeb'), 
    'Mr', true)

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Payment/input_Last name_surname'), 'Test')

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Payment/input_First name_first_names'), 'Test')

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Payment/input_Initials_initials'), 'TT')

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/input_Last name_surname'))

WebUI.doubleClick(findTestObject('Object Repository/OR_Incredible Connection/Payment/input_Last name_surname'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR_Incredible Connection/Payment/select_Select your ethnicity.AfricanAsianCo_9eab33'), 
    'African', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR_Incredible Connection/Payment/select_Select your ethnicity.AfricanAsianCo_9eab33'), 
    'White', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR_Incredible Connection/Payment/select_Select your marital status.SingleMar_d050dd'), 
    'Married / Civil Partnership', true)

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/ol_YesNo'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/label_Yes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR_Incredible Connection/Payment/select_Select your marital status.SingleMar_d050dd'), 
    'Single', true)

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Payment/input_South African ID_id_number'), '1991101611915')

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Payment/div_Basic DetailsSpouse DetailsEmployment D_58310f'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Incredible Connection/Payment/div_The ID number entered is not a valid So_319c78'), 
    'The ID number entered is not a valid South African ID number.')

