package net.cinterface

import javassist.ClassPool
import net.cinterface.impl.ClassInterfacer
import java.io.File
import java.io.FileInputStream

/**
 * The entry point of this application.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
class CInterface {
    companion object Static {
        @JvmStatic fun main(args: Array<String>) {
            // java -jar CInterface.jar Example.class
            // output: ExampleI.class
            if (args.size < 1) {
                println("Insufficent arguments provided to CInterface!")
                return
            }
            val currentClass: File = File(args[0])
            if (!currentClass.isFile) {
                println("File given in arguments provided is not a valid file!")
                return
            }
            if (!currentClass.exists()) {
                println("File doesn't exist inside of the arguments given!")
                return
            }
            val outputClass: File = File(currentClass.parentFile, "${currentClass.nameWithoutExtension}I.class")
            println("Processing class... (output: ${currentClass.nameWithoutExtension}I.class)")
            ClassInterfacer().convert(ClassPool.getDefault().makeClass(FileInputStream(currentClass)), outputClass)
            println("Class processed successfully!")
        }
    }
}