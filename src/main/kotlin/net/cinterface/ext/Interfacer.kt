package net.cinterface.ext

import javassist.CtClass

/**
 * Represents a class that converts classes into interfaces.
 *
 * @since 1.0-SNAPSHOT
 * @authorPizzaCrust
 */
interface Interfacer {
    /**
     * This method is called when a .class is converted into a CtClass intending to be converted to a interface.
     */
    fun convert(theClass: CtClass)
}