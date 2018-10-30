package pl.github.count.loc.chrome

import org.openqa.selenium.WebDriver

object ChromeOpener {

    fun openChrome(webDriver: WebDriver, url: String) {
        webDriver.get(url)
    }
}