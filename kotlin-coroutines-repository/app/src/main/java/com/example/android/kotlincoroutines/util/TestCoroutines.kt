package com.example.android.kotlincoroutines.util

import kotlinx.coroutines.*

class TestCoroutines {

    fun main() {
        GlobalScope.launch {
            delay(1000L)
            println("Late Kishor")
        }
        println("Hello I'm")
        Thread.sleep(2000L)
    }
}


class CoroutineScopeTest {
    fun main() = runBlocking {
        launch {
            delay(1000L)
            println("Task in main coroutine ")
        }

        coroutineScope {
            launch {
                delay(1000L)
                println(" get the result and attach ")
            }

            delay(1000L)
            println(" Task from coroutine scope ")
        }

        println(" Coroutine scope is over")
    }
}