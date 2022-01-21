package com.example.testigproject
//remove junit import you get here by default cuz we need to use google Truth library which is more helpful
import com.google.common.truth.Truth.assertThat
import org.junit.Test



class RegistrationUtilTest{
    /**So Basically Assertion means that we are confident and force that we are right...
 * from following example we can see that we use {assertThat(result).isFalse}
 * which basically means that we assert that the result from the above test will be false
 * so it will show test pass if our assertion is right or it will show test failed
 * when our assertion was wrong
 */
    @Test
    fun `empty username`(){//the name should be inside of `` not ''
        //it doesn't matter what nam you gave or even backspaces
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Philip",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "yoo",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password don't match`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Hello",
            "123",
            "abc"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password too short`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Damn",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }
}