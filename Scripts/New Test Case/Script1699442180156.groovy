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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.setText(findTestObject('Object Repository/RetailFX-028/001_EnterSpacebar'), '          ', 0)

Mobile.takeScreenshot('Screenshots/RetailFX-28/001_UserEnters_Spacebar')
Mobile.takeScreenshot()

Mobile.getAttribute(findTestObject('Object Repository/RetailFX-028/002_VerifyElementNotVisible - Update'), 0)

Mobile.setText(findTestObject('Object Repository/RetailFX-028/003_SetTextto_moreThan_30_Characters'), '1234567890123456789012345678901', 
    0)

Mobile.takeScreenshot('Screenshots/RetailFX-28/002_UserEnters_moreThan_30_Character')
Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/RetailFX-028/004_SetTextUpto_30_Characters'), '123456789012345678901234567890', 
    0)

Mobile.takeScreenshot('Screenshots/RetailFX-28/003_UserEnters_30_Character')
Mobile.takeScreenshot()

Mobile.verifyElementNotExist(findTestObject('Object Repository/RetailFX-028/005_VerifyElementNotEnable - Update'), 0)

Mobile.verifyElementNotExist(findTestObject('Object Repository/RetailFX-028/005_VerifyElementNotEnable - Update'), 0)
Mobile.verifyElementNotExist(findTestObject('Object Repository/RetailFX-028/005_VerifyElementNotEnable - Update'), 0)
Mobile.verifyElementNotExist(findTestObject('Object Repository/RetailFX-028/005_VerifyElementNotEnable - Update'), 0)










