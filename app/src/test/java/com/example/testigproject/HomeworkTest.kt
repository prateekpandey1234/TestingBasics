package com.example.testigproject

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {
    @Test
    fun `n greater than 3`(){
        val res = Homework.fib(3)
        assertThat(res).isEqualTo(2)
    }
    @Test
    fun `braces are absent`(){
        val res2 = Homework.checkBraces("((ab")
        assertThat(res2).isFalse()
    }
}