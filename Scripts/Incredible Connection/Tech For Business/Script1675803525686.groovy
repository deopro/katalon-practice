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

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/a_Tech for Business'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/a_1'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/button_Secure Checkout'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/label_Free Delivery 2 - 5 Working Days'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/button_Deliver'))

WebUI.click(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/button_Continue to payment'))

WebUI.verifyElementText(findTestObject('Object Repository/OR_Incredible Connection/Tech For Business/span_This is a required field'), 
    'This is a required field.')

WebUI.takeScreenshotAsCheckpoint('tech_for_business')

