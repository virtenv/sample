/**
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * A User who is purchasing from the pet store
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
@Serializable@JsonClass(generateAdapter = true)
data class User (

    @SerialName(value = "id") var id: kotlin.Long? = null,

    @SerialName(value = "username") var username: kotlin.String? = null,

    @SerialName(value = "firstName") var firstName: kotlin.String? = null,

    @SerialName(value = "lastName") var lastName: kotlin.String? = null,

    @SerialName(value = "email") var email: kotlin.String? = null,

    @SerialName(value = "password") var password: kotlin.String? = null,

    @SerialName(value = "phone") var phone: kotlin.String? = null,

    /* User Status */
    @SerialName(value = "userStatus") var userStatus: kotlin.Int? = null

)

