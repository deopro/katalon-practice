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

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/a_Localizao e Confrontaes'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/label_Seleccione'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/li_LUANDA'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/label_Seleccione_1'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/li_LUANDA_1'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/label_Seleccione_1_2'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/li_RANGEL'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/li_RANGEL'))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_Bairro_frmPatrimonytvSuporteaccImovel_40b4a2'), 
    'SUBURB')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_RuaAvenida_frmPatrimonytvSuporteaccIm_3553cc'), 
    'STREET')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_N de Identificao do Provedor de gua_f_0e1909'), 
    '273')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_Ponto de Referncia_frmPatrimonytvSupo_9c3aae'), 
    'TESTE')

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/div_LOCALIZAO'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/div_CONFRONTAES'))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_Norte_frmPatrimonytvSuporteaccImovelc_228af4'), 
    'NORTH')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_Sul_frmPatrimonytvSuporteaccImovelcon_35ef2c'), 
    'SOUTH')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/B_Localizacao e Confrontacoes/input_Este_frmPatrimonytvSuporteaccImovelco_f51d7c'), 
    'EAST')

