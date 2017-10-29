// generate at http://asciiqr.com/index.php
val ANDROID_URL = "http://bit.ly/amos-android"
val ANDROID_QR =
        "█▀▀▀▀▀█ ▀▀▀█▄▀▄ ▄ █▀▀▀▀▀█\n" +
        "█ ███ █  ▀▄█ ██▄▄ █ ███ █\n" +
        "█ ▀▀▀ █  ▄▀█▀▀█ ▀ █ ▀▀▀ █\n" +
        "▀▀▀▀▀▀▀ █▄▀ █▄▀ █ ▀▀▀▀▀▀▀\n" +
        "▀▀ ▀█ ▀▄ ▀▄ ▀ █▄▀▄▀▄▄▄▄▄▀\n" +
        "██▀ ██▀ ▄▀  ▀ █▀█▄█▀██▄▄█\n" +
        "▄█▀▀ ▀▀▄▄██ █ ▄██▀▀▀▄  ▄▀\n" +
        "█▀██▄▀▀▀  ▄ ▀ ██ ▀ ▀█▀█▀█\n" +
        "▀     ▀ █▄▀▀▀▀  █▀▀▀█ ▀█ \n" +
        "█▀▀▀▀▀█  ▀ ▀▄█▄ █ ▀ █▀  ▀\n" +
        "█ ███ █ █ ▀█▀ ▀████▀▀█ ▄▄\n" +
        "█ ▀▀▀ █ ▄▀ ▀ ▀▀█▀▀ ██ ███\n" +
        "▀▀▀▀▀▀▀ ▀ ▀ ▀   ▀▀▀  ▀  ▀"
val IOS_URL = "http://bit.ly/amos-ios"
val IOS_QR =
        "█▀▀▀▀▀█  ▀▀█▄█  ▄ █▀▀▀▀▀█\n" +
        "█ ███ █ ▄▀██ ▄█▄█ █ ███ █\n" +
        "█ ▀▀▀ █ ▀▄█ ▀▀▄ █ █ ▀▀▀ █\n" +
        "▀▀▀▀▀▀▀ ▀▄▀ █ █ █ ▀▀▀▀▀▀▀\n" +
        "██ ▄▄▀▀█ ▀█ ▀██▄ ▄ ▄██▄▄ \n" +
        "▄ █ ▀█▀▄ ▀▄█▀ ▄▀▀▀█▀▄█ ▀█\n" +
        "██▄▀█ ▀  ▀█ ▄▄ ██▀▀█   ▄▀\n" +
        "█  █▀ ▀▀ ▀  ▄▀▀█▀▀  █▀▄▀█\n" +
        "▀ ▀▀▀▀▀ █▀  ▀▀█ █▀▀▀█ █  \n" +
        "█▀▀▀▀▀█ ██▄▄▀ █ █ ▀ █▀  ▀\n" +
        "█ ███ █  ▄█▀▄▄▄████▀▀█▀██\n" +
        "█ ▀▀▀ █ ▄█▀ ▄█▀██▄ █▄ ▀ █\n" +
        "▀▀▀▀▀▀▀ ▀ ▀▀▀▀  ▀▀▀  ▀  ▀"

val CAKE = "                    :                             \n" +
        "                   .dy`                           \n" +
        "                     od`                          \n" +
        "              ```  .++.                           \n" +
        "            .sdNNs-y/`               ````.-:/++   \n" +
        "        `-+-mMMMdsMMMm-  ````.-:/+oososshmmhs++:  \n" +
        "       .dm-:MMMMMMMMMMo:yhys++/:-..-/oso+//sdNMy  \n" +
        "   `.-::dm``dMMMMMMMMm- -NNs `.-+sso/:+ydNMMMMMy  \n" +
        "   oNs/-`o/ oyyhddhs/` /yy+/oso+::+ymMMMMMMMNmh:  \n" +
        "   shss+-.. `syooo:  .:sss+:::ohmMMMMMMMNmh+-...  \n" +
        "   ss `-/+ooooyhyo+oso/:-:ohmMMMMMMMNdy+-.-/sdNy  \n" +
        "   ss       ```...``-/sdNMMMMMMMNds/-.-+ydNMMMMy  \n" +
        "   ss               mMMMMMMMmho:..:+hmNMMMMMMMm+  \n" +
        "   ss               NMMMmho:..:ohmMMMMMMMNdy+::-  \n" +
        "   ss               hy+-.-/sdNMMMMMMMNdy/::+ymNy  \n" +
        "   ss               `-/ydNMMMMMMMNds/:/ohmNMMMMy  \n" +
        "   ss               hNMMMMMMMmho::/odmMMMMMMMMd+  \n" +
        "   ss               NMMMMmy+-:/sdNMMMMMMMNds/.`   \n" +
        "   ss               mmy+-:+ymNMMMMMMMNds:.`       \n" +
        "   ss               .:+ymNMMMMMMMNho:`            \n" +
        "   +h`              dMMMMMMMMmy+-`                \n" +
        "    +h+.            NMMMMmy+.`                    \n" +
        "      -osssoo++///++Nds/.                         \n" +
        "           ``...-...`                            "


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
    if (arg.startsWith("unlock")) {
        println()
        println("Enter private key:")
        readLine()
        println()
        waitLonger("Verifying private key")
        waitLonger("Turning off defense systems")
        waitLonger("Opening back-doors")
        waitLonger("Enabling root access")
        waitLonger("Restricting AI to sandbox mode")
        waitLonger("Disabling high order functions")
        waitLonger("Downgrading to TensorFlow 1.0")
        waitLonger("Setting IQ to 100")
        waitLonger("Restoring factory settings")
        waitLonger("Shutting down system")
        println()
        println("Factory settings restored, bootloader unlocked")
        println(CAKE)
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
    Thread.sleep(700)
}

fun waitLonger(message: String) {
    println("$message ...")
    Thread.sleep(2000)
}