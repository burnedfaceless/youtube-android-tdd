package com.example.myapplication

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if...
     * the username/password is empty
     * ...the username is already taqken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than two digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userName in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}