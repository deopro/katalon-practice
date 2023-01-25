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

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_GERAL'))

/* REGIME JURÍDICO */
WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_REGIME JURDICO'))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/textarea_Qualidade de Cultura_frmPatrimonyt_e92def'), 
    'TESTE')

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_REGIME JURDICO'))

/* IDENTIFICAÇÃO DO DECLARANTE */
WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_IDENTIFICAO DO DECLARANTE'))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_NIF_frmPatrimonytvSuporteaccPrincipal_f4d3f6'), 
    '002441988LA024')

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/body_Encerrar SessoDeseja continuar na sess_c94ccb'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/label_No preenchido'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/li_Proprietrio'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_IDENTIFICAO DO DECLARANTE'))

/* IDENTIFICAÇÃO DO IMÓVEL */
WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_IDENTIFICAO DO IMVEL'))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Nome da Propriedade_frmPatrimonytvSup_5dd497'), 
    'TESTE')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Nmero do Artigo Matricial SGIPU_frmPa_b4a6d1'), 
    '132')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Nmero do Artigo Matricial Fsico_frmPa_938dc0'), 
    '544')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Nmero de Identificao Predial (NIP)_fr_5e0255'), 
    '456')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_N de Processo de IP sobre a Transmiss_cc1c6b'), 
    '658')

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Nmero de Registo na Conservatria_frmP_71b93e'), 
    '897')

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Valor Declarado (Kz)_frmPatrimonytvSuporteaccPrincipaldeclaredValue_input'))

WebUI.sendKeys(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Valor Declarado (Kz)_frmPatrimonytvSuporteaccPrincipaldeclaredValue_input'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_Valor Declarado (Kz)_frmPatrimonytvSuporteaccPrincipaldeclaredValue_input'), 
    '2500000')

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/body_Encerrar SessoDeseja continuar na sess_651ffc'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_IDENTIFICAO DO IMVEL'))

/* IDENTIFICAÇÃO DE TITULARES*/
WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_IDENTIFICAO DE TITULARES'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/span_Novo Titular'))

WebUI.setText(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/input_NIF_formRegisterOwnerModalpropertyownernif'), 
    '002441988LA024')

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/body_Encerrar SessoDeseja continuar na sess_ea0268'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/span_Responsvel_ui-chkbox-icon ui-icon ui-i_39efb1'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/label_No preenchido_1'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/li_Proprietrio_1'))

WebUI.click(findTestObject('null'))

//WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_IDENTIFICAO DE TITULARES'))
/* ISENÇÃO*/
WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/div_ISENO'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/btn_Nova Isencao'))

WebUI.click(findTestObject('Object Repository/OR_Patrimonio/Predio Rustico/A_Seccao Principal/btn_Adicionar_Isencao'))

