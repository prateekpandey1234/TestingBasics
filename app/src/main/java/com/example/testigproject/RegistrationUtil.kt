package com.example.testigproject

object RegistrationUtil {
    private val existingUsers = listOf("Peter", "Carl")
    /**
     * So quick recap here...
     * ...the android test class is used when we require some type of context of application
     * ...or activity or fragment
     * ...the test is called else above that
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(username in existingUsers) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}

