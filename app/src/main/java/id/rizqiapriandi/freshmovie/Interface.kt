// 7. File interface MovieApi
package id.rizqiapriandi.freshmovie

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface MovieApi {
    @GET("popular?")
    fun getPopularMovies(@Query("api_key") api_key : String) : Call<Movies>
}