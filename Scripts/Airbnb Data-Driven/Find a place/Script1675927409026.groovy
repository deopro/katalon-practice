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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OR Airbnb Data-Driven/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/div_Add guests_s1qcpybl dir dir-ltr'))

WebUI.setText(findTestObject('Object Repository/OR Airbnb Data-Driven/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/input_Where_query'), 
    city)

WebUI.click(findTestObject('Object Repository/OR Airbnb Data-Driven/Page_Vacation Homes  Condo Rentals - Airbnb_f5c50c/span_Add guests__kaq6tx'))

WebUI.takeScreenshotAsCheckpoint('')

WebUI.closeBrowser()

