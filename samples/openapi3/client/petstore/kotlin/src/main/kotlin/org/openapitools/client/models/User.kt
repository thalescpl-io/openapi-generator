/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param id 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
 */

data class User (
    @Json(name = "id")
    val id: kotlin.Long? = null,
    @Json(name = "username")
    val username: kotlin.String? = null,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "lastName")
    val lastName: kotlin.String? = null,
    @Json(name = "email")
    val email: kotlin.String? = null,
    @Json(name = "password")
    val password: kotlin.String? = null,
    @Json(name = "phone")
    val phone: kotlin.String? = null,
    /* User Status */
    @Json(name = "userStatus")
    val userStatus: kotlin.Int? = null
) : Serializable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}

