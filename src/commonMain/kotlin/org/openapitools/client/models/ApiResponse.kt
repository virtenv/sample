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
 * Describes the result of uploading an image resource
 *
 * @param code 
 * @param type 
 * @param message 
 */
@Serializable@JsonClass(generateAdapter = true)
data class ApiResponse (

    @SerialName(value = "code") var code: kotlin.Int? = null,

    @SerialName(value = "type") var type: kotlin.String? = null,

    @SerialName(value = "message") var message: kotlin.String? = null

)
