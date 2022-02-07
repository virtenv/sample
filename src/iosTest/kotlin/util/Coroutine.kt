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


package util

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.EmptyCoroutineContext

internal actual fun <T> runTest(block: suspend CoroutineScope.() -> T): T = kotlinx.coroutines.runBlocking(EmptyCoroutineContext, block)
