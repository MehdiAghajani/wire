// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.custom_options.enum_value_option in custom_options.proto
package com.squareup.wire.protos.custom_options

import kotlin.Int
import kotlin.`annotation`.AnnotationRetention
import kotlin.`annotation`.AnnotationTarget
import kotlin.`annotation`.Retention
import kotlin.`annotation`.Target

/**
 * This is a nice option! Apply it to your friendly enum constants.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.PROPERTY)
public annotation class EnumValueOptionOption(
  public val `value`: Int
)
