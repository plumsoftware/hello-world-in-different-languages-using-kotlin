package ru.plumsoftware

import ru.plumsoftware.hello_world.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(
        """
            Введите число от 1 до 2. 
            1 - Kotlin Hello World
            2 - Python Hello World
            3 - C++
            4 - Java
            5 - JavaScript
        """.trimIndent()
    )
    repeat(20) {
        print("=")
    }
    println()

    while (true) {
        val input = readlnOrNull()
        val number = try {
            input?.toInt()
        } catch (e: NumberFormatException) {
            println("Неверный формат числа")
            null
        }

        if (number != null) {
            val helloWorldFromLanguage = when (number) {
                1 -> helloWorldKt()
                2 -> helloWorldPy()
                3 -> helloWorldCpp()
                4 -> helloWorldJava()
                5 -> helloWorldJs()
                else -> {
                    "Неизвестный номер"
                }
            }
            println(helloWorldFromLanguage)
        }
    }
}