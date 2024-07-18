package com.example.myapplication

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Brian",
            "123",
            "123"
        )
        assertTrue(result)
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Brian",
            "",
            ""
        )
        assertFalse(result)
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Brian",
            "123",
            "abc"
        )
        assertFalse(result)
    }

    @Test
    fun `password less than two characters returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Brian",
            "a",
            "a"
        )
        assertFalse(result)
    }


}