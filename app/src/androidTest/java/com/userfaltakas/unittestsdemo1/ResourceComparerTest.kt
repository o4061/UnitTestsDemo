package com.userfaltakas.unittestsdemo1

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceComparerTest {
    private val resourceComparer = ResourceComparer()

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(
            context,
            R.string.my_name,
            "Orestis"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(
            context,
            R.string.my_name,
            "Iwanna"
        )
        assertThat(result).isFalse()
    }
}
