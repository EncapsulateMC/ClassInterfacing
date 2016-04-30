package net.cinterface.impl

import javassist.ClassPool
import javassist.CtClass
import javassist.CtNewMethod
import net.cinterface.ext.Interfacer
import java.io.DataOutputStream
import java.io.File
import java.io.FileOutputStream

/**
 * The implementation of the Interfacer interface.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
class ClassInterfacer : Interfacer {
    override fun convert(theClass: CtClass, outputClassFile: File) {
        val newClass: CtClass = ClassPool.getDefault().makeClass("${theClass.name}I")
        for (method in theClass.declaredMethods) {
            newClass.addMethod(CtNewMethod.abstractMethod(method.returnType, method.name, method.parameterTypes, arrayOf(), newClass))
        }
        val dataStream: DataOutputStream = DataOutputStream(FileOutputStream(outputClassFile))
        newClass.classFile.write(dataStream)
    }
}