package pl.github.count.loc

import pl.github.count.loc.controller.Controller

fun main(args: Array<String>) {
    println("hola!")

    val urlToRepoContributors = prepareUrl("https://github.com/scala/scala")

    val controller = Controller()
    controller.launchIT(urlToRepoContributors)
}

fun prepareUrl(urlToRepo: String): String {
    if (urlToRepo.contains("/graphs/contributors")) {
        return urlToRepo
    }
    return "$urlToRepo/graphs/contributors"
}