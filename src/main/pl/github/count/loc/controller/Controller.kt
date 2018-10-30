package pl.github.count.loc.controller

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import pl.github.count.loc.chrome.ChromeOpener.openChrome
import pl.github.count.loc.chrome.Waiter.waitTillPageLoads
import java.nio.file.FileSystems

class Controller {

    private var webDriver: WebDriver

    constructor() {
        var pathToChrome = FileSystems.getDefault().getPath("").toAbsolutePath().toString()

        pathToChrome += "/chromeDriver/chromedriver.exe"

        System.setProperty("webdriver.chrome.driver", pathToChrome)

        webDriver = ChromeDriver()
    }

    fun launchIT(urlToRepoContributors: String) {
        openChromeAndLoadPage()

        webDriver.close()
    }

    private fun openChromeAndLoadPage() {
        openChrome(webDriver, "localhost:8080")
        waitTillPageLoads(webDriver)
    }

}