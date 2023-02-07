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

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Page_Home - Incredible Connection/div_My Account'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Page_Home - Incredible Connection/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/OR_Incredible Connection/Page_Customer Login - Incredible Connection/input_Email Address_loginusername'), 
    'test@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_Incredible Connection/Page_Customer Login - Incredible Connection/input_Password_loginpassword'), 
    'iFGeFYmXIrWl+1q0scI6aQ==')

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Page_Customer Login - Incredible Connection/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Incredible Connection/Page_Customer Login - Incredible Connection/div_Your account sign-in was incorrect. Ple_4353bf'), 
    'Your account sign-in was incorrect. Please try again.')

