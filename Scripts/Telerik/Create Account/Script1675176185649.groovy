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

WebUI.click(findTestObject('Object Repository/Telerik/Create Account/svg'))

WebUI.setText(findTestObject('Page_Telerik  Login/input_Work or Telerik Account Email_email'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/Telerik/Create Account/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Telerik/Create Account/input_Password_password'), '9KuFGzalzWgOpbp98rkftg==')

WebUI.setText(findTestObject('Object Repository/Telerik/Create Account/input_First Name_first-name'), 'Deo')

WebUI.setText(findTestObject('Object Repository/Telerik/Create Account/input_Last Name_last-name'), 'Pro')

WebUI.setText(findTestObject('Object Repository/Telerik/Create Account/input_Company_company'), 'Test')

WebUI.setText(findTestObject('Object Repository/Telerik/Create Account/input_To provide you with additional suppor_496b1a'), 
    '923366180')

WebUI.click(findTestObject('Object Repository/Telerik/Create Account/span_To assign you to a local team that can_cabbee'))

WebUI.click(findTestObject('Object Repository/Telerik/Create Account/li_Angola'))

WebUI.click(findTestObject('Object Repository/Telerik/Create Account/button_Create Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Telerik/Create Account/h4_Weve Sent You an Account Activation Email'), 
    'We\'ve Sent You an Account Activation Email')

