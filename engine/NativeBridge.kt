package com.smoothcraft.launcher.engine

object NativeBridge {
    init {
        // TODO: loadLibrary for native code
    }

    external fun startMinecraft(
        jvmLibPath: String,
        classpath: String,
        mainClass: String,
        jvmArgs: Array<String>,
        mcArgs: Array<String>,
        workDir: String,
        lwjglNatives: String
    ): Int
}
