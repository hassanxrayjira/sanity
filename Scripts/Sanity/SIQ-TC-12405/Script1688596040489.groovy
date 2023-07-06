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

WebUI.callTestCase(findTestCase('Sanity/SIQ-TC-12402'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_View Full Hierarchy'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/label_Product'), 
    30)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_Submit'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/lightning-primitive-icon'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/span_Delegate'))

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/h1_Delegation'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/span_Business Unit_slds-radio_faux'))

WebUI.delay(6)

WebUI.scrollToElement(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/span_User Type_slds-checkbox_faux'), 
    0)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/span_User Type_slds-checkbox_faux'))

WebUI.verifyElementClickable(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_Populate'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_Populate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_Proceed'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Deligate HO/Page_Lightning Experience  Salesforce/button_Proceed'))

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('Object Repository/New Folder/Page_SalesIQ Home  Salesforce/span_Quota Refinement'), 
    20)

WebUI.delay(6)

