package kscript.app

import java.io.File

interface Executor {
    fun runScript(scriptClassPath: String, execClassName: String, userArgs: List<String>, kotlinOpts: List<String>): Int
    fun interactiveShell(jarFile: File, classpath: String?, compilerOpts: List<String>, kotlinOpts: List<String>)
    fun execute(cmdLine: String)
}