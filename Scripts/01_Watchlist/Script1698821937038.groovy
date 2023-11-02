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

Mobile.verifyElementText(findTestObject('Object Repository/01_Watchlist/01_UserOnDashboard'), 'Account')

Mobile.takeScreenshot('Screenshots/01_Watchlist/01_UserOn_Watchlist')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/01_Watchlist/02_UserTapOnViewAllAccount'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/01_Watchlist/03_VerifyElementText - 6-digit PIN'), '6-digit PIN')

Mobile.takeScreenshot('Screenshots/01_Watchlist/02_UserEntersPin')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/01_Watchlist/04_TapNumber - 1'), 0)


Mobile.tap(findTestObject('Object Repository/01_Watchlist/05_TapOn- LOANFINANCING'), 0)

Mobile.tap(findTestObject('Object Repository/01_Watchlist/06_TapOn - WEALTH'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4304568943257281677.png')

Mobile.tap(findTestObject('Object Repository/01_Watchlist/07_TapOnForeignCurrency'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7827364751384332931.png')

Mobile.tap(findTestObject('Object Repository/01_Watchlist/08_TapOnWatchlist'), 0)

