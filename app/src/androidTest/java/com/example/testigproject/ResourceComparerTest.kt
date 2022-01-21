package com.example.testigproject

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before

import org.junit.Test

class ResourceComparerTest{
    /** we need to create a instance of the object/component we want to test
     * * private var resourceComparer = ResourceComparer()
     *
     the above method is said to be bad practice as it all the test will not be independent of each other
    *cuz they will be using the same object to operate*/
    private lateinit var resourceComparer:ResourceComparer
/**Basically the {Before} methods are called before every test runs and {After}
 * methods are also called after every test runs end
 * * The After method is mostly called when  we want to delete a object or database when
 * called or initialised
 * * we should prefer using Before method when we want to initialize classes so that
 * every test gets it's own class and function independently
 *
 * */
    @Before
    fun setup(){
        resourceComparer=ResourceComparer()
    }

    @Test
    fun StringResourceSameAsGivenString_returnsTrue(){
        var context  = ApplicationProvider.getApplicationContext<Context>()
        var res = resourceComparer.compare(context,R.string.app_name,"testigProject")
        assertThat(res).isTrue()
    }
    @Test
    fun StringResourceDifferentAsGivenString_returnsFalse(){
        var context  = ApplicationProvider.getApplicationContext<Context>()
        var res = resourceComparer.compare(context,R.string.app_name,"hello")
        assertThat(res).isFalse()
    }
}