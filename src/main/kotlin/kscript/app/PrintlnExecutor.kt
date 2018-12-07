package kscript.app

import java.io.File

class PrintlnExecutor : Executor {
    override fun runScript(scriptClassPath: String, execClassName: String, userArgs: List<String>, kotlinOpts: List<String>): Int {
        val joinedUserArgs = userArgs.map { "\"${it.replace("\"", "\\\"")}\"" }.joinToString(" ")
        println("kotlin ${kotlinOpts.joinToString(" ")} -classpath \"${scriptClassPath}\" ${execClassName} ${joinedUserArgs} ")
        return 0
    }

    override fun interactiveShell(jarFile: File, classpath: String?, compilerOpts: List<String>, kotlinOpts: List<String>) {
        val cpstring = classpath?.let { "-classpath '$it'" } ?: ""
        println("kotlinc ${compilerOpts} ${kotlinOpts.joinToString(" ")} ${cpstring}")
    }

    override fun execute(cmdLine: String) {
        println(cmdLine)
    }
}