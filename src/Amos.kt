// generate at http://asciiqr.com/index.php
val ANDROID_URL = "http://bit.ly/amos-android"
val ANDROID_QR = "█▀▀▀▀▀█ ▀▀▀█▄██ ▄ █▀▀▀▀▀█\n" +
        "█ ███ █  ▀▄█ ██ ▄ █ ███ █\n" +
        "█ ▀▀▀ █  ▄▀█▀▀█ ▀ █ ▀▀▀ █\n" +
        "▀▀▀▀▀▀▀ █▄▀ █▄▀ ▀ ▀▀▀▀▀▀▀\n" +
        "█▀ ██ ▀▄ ▀▄ ▀ █▄▀▄▀▄▄▄▄▄▀\n" +
        "▄▀█▄▀█▀▄█▀  ▀  █▄▄█▀██▄▄█\n" +
        "▄ ▀▀▄ ▀█▀██ ▄▄▄█▄▀▀▀▄  ▄▀\n" +
        "█▀█▀▄▄▀█▄   ▄▀▀█ ▀ ▀█▀█▀█\n" +
        "▀ ▀ ▀▀▀ ▄▄▄█▀▀▄ █▀▀▀█ ▀█ \n" +
        "█▀▀▀▀▀█  ▄▄▄▀▄▄ █ ▀ █▀  ▀\n" +
        "█ ███ █ █▄ ▀▄█▄████▀▀█ ██\n" +
        "█ ▀▀▀ █ ▄ ▀█▄█ █▀▀ ██ ███\n" +
        "▀▀▀▀▀▀▀ ▀▀ ▀▀▀  ▀▀▀  ▀  ▀"
val IOS_URL = "http://bit.ly/amos-ios"
val IOS_QR = "█▀▀▀▀▀█ ▀▀▀█▄██ ▄ █▀▀▀▀▀█\n" +
        "█ ███ █  ▀▄█ ██ ▄ █ ███ █\n" +
        "█ ▀▀▀ █  ▄▀█▀▀█ ▀ █ ▀▀▀ █\n" +
        "▀▀▀▀▀▀▀ █▄▀ █▄▀ ▀ ▀▀▀▀▀▀▀\n" +
        "█▀ ██ ▀▄ ▀▄ ▀ █▄▀▄▀▄▄▄▄▄▀\n" +
        "▄▀█▄▀█▀▄█▀  ▀  █▄▄█▀██▄▄█\n" +
        "▄ ▀▀▄ ▀█▀██ ▄▄▄█▄▀▀▀▄  ▄▀\n" +
        "█▀█▀▄▄▀█▄   ▄▀▀█ ▀ ▀█▀█▀█\n" +
        "▀ ▀ ▀▀▀ ▄▄▄█▀▀▄ █▀▀▀█ ▀█ \n" +
        "█▀▀▀▀▀█  ▄▄▄▀▄▄ █ ▀ █▀  ▀\n" +
        "█ ███ █ █▄ ▀▄█▄████▀▀█ ██\n" +
        "█ ▀▀▀ █ ▄ ▀█▄█ █▀▀ ██ ███\n" +
        "▀▀▀▀▀▀▀ ▀▀ ▀▀▀  ▀▀▀  ▀  ▀"


fun main(args: Array<String>) {
    val arg = args[0]
    if (arg.startsWith("revert")) {
        println()
        wait("Starting revert script")
        wait("git checkout 1994")
        wait("Downloading")
        wait("Applying patches")
        wait("Disabling voice interface")
        println("A.M.O.S. successfully reverted to version 1993.20.4")
        println()
        println("Hi, I'm AMOS. How can I help you?")
        readLine()
        println()
        wait("Generating")
        println()
        printQrCodes()
        readLine()
    }
}

fun printQrCodes() {
    println("                   Android:                                   iOS:")
    println()
    println("           $ANDROID_URL               $IOS_URL")
    println()
    println()
    val androidLines = ANDROID_QR.split("\n")
    val iosLines = IOS_QR.split("\n")
    androidLines.forEachIndexed { i, line ->
        println("           $line               ${iosLines[i]}")
    }
    println()
}

fun wait(message: String) {
    println("$message ...")
    Thread.sleep(500)
}