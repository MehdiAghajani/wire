// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

data class RedactedChild(
  @field:WireField(tag = 1, adapter = "com.squareup.wire.ProtoAdapter#STRING") val a: String? =
      null,
  @field:WireField(tag = 2, adapter = "com.squareup.wire.protos.kotlin.redacted.Redacted#ADAPTER")
      val b: Redacted? = null,
  @field:WireField(tag = 3, adapter =
      "com.squareup.wire.protos.kotlin.redacted.NotRedacted#ADAPTER") val c: NotRedacted? = null,
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedChild, RedactedChild.Builder>(ADAPTER, unknownFields) {
  @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Builder = Builder(this.copy())

  class Builder(private val message: RedactedChild) : Message.Builder<RedactedChild, Builder>() {
    override fun build(): RedactedChild = message
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RedactedChild> = object : ProtoAdapter<RedactedChild>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedChild::class.java
    ) {
      override fun encodedSize(value: RedactedChild): Int = 
        ProtoAdapter.STRING.encodedSizeWithTag(1, value.a) +
        Redacted.ADAPTER.encodedSizeWithTag(2, value.b) +
        NotRedacted.ADAPTER.encodedSizeWithTag(3, value.c) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: RedactedChild) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a)
        Redacted.ADAPTER.encodeWithTag(writer, 2, value.b)
        NotRedacted.ADAPTER.encodeWithTag(writer, 3, value.c)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RedactedChild {
        var a: String? = null
        var b: Redacted? = null
        var c: NotRedacted? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a = ProtoAdapter.STRING.decode(reader)
            2 -> b = Redacted.ADAPTER.decode(reader)
            3 -> c = NotRedacted.ADAPTER.decode(reader)
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return RedactedChild(
          a = a,
          b = b,
          c = c,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: RedactedChild): RedactedChild? = value.copy(
        b = value.b?.let(Redacted.ADAPTER::redact),
        c = value.c?.let(NotRedacted.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}