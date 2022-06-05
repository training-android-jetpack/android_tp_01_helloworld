package android.jetpack

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.runner.RunWith
import kotlin.test.Test
import kotlin.test.assertEquals

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() = InstrumentationRegistry
        .getInstrumentation()
        .targetContext
        .packageName
        .run {
            assertEquals(
                expected = "android.jetpack",
                actual = this
            )
        }

//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        assertEquals("android.jetpack", appContext.packageName)
//    }

}