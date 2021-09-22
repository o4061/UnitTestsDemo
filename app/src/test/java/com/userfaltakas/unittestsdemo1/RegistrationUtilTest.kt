package com.userfaltakas.unittestsdemo1

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Nikos",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "asdf",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }

    // checkBraces

    @Test
    fun `braces are equal to each side returns true`() {
        val result = RegistrationUtil.checkBraces(
            "(Hello (world!))"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `more braces to right returns false`() {
        val result = RegistrationUtil.checkBraces(
            "(Hello (world!)))))"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `more braces to left returns false`() {
        val result = RegistrationUtil.checkBraces(
            "((((((((Hello (world!))"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `none braces returns true`() {
        val result = RegistrationUtil.checkBraces(
            "Hello world"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `fib(0) == 0`() {
        val result = RegistrationUtil.fib(
            0
        )
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fib(1) == 1`() {
        val result = RegistrationUtil.fib(
            1
        )
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(2) == 1`() {
        val result = RegistrationUtil.fib(
            1
        )
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(3) == 2`() {
        val result = RegistrationUtil.fib(
            1
        )
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `fib(7) == 13`() {
        val result = RegistrationUtil.fib(
            1
        )
        assertThat(result).isEqualTo(13)
    }

}