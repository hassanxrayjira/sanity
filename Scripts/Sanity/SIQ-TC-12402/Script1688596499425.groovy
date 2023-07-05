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
import java.time.OffsetDateTime as OffsetDateTime
import java.time.ZoneOffset as ZoneOffset
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder as DateTimeFormatterBuilder
import java.util.Locale as Locale

WebUI.callTestCase(findTestCase('Login Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), 
    10)

WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/a_Quota Refinement'))
WebUI.click(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'))

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Show All'), 
    10)

WebUI.rightClick(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Show All'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Folder'))

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/div_Name'), 
    10)

//def now = new Date()
//String val = now.format ('yyyy-mm-dd HH:mm:s')
//
//println('Value is:' + val)
//
//String val2 = 'Test' +val;
WebUI.setText(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Name_FolderName'), 
    GlobalVariable.QL)

//
//WebUI.sendKeys(findTestObject('your test object name', ['QQL': QQL]),  GlobalVariable.QL)
WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Name_slds-button slds-button_brand'))

//TestObject to = findTestObject('yObject Repository/New Folder/Page_Lightning Experience  Salesforce/button_12345', ['newName': newName]);
//println to.getSelectorCollection().toString(); // Should see your XPath which contains the actual value of newName, among other stuffs
WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_12345'))

//
WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_New Quota Refinement'))

not_run: WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/lightning-spinner_Loading'))

not_run: WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Name_quotaName'))

def now = new Date()

String val = now.format('yyyy-mm-dd HH:mm:s')

println('Test' + val)

not_run: WebUI.setText(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Name_quotaName'), 
    val)

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Name_quotaName'), 
    val)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/lightning-spinner_Loading'))

not_run: WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/div_Business UnitBusiness UnitVacAllergybuB_99ca2d'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Select Business Unit'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/span_Vac'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Select Team'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/span_Alpha'))

not_run: WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/div_ProductSelect ProductAllCRESMBAGARDASIL_ddc9a7'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Select Product'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/span_GARDASIL'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Select Time Period'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/span_Daily'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Date_date'), '7/4/2004')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Cancel and close'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Cancel and close'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/input_Super Admin Integration_roster-group'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Save'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Next'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Next_1'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Lightning Experience  Salesforce/button_Generate Cycle'))

