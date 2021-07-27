// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.redacted_test.RedactedChild in redacted_test.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmField
import okio.ByteString

public class RedactedChild(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public val a: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.redacted.RedactedFields#ADAPTER"
  )
  public val b: RedactedFields? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.protos.kotlin.redacted.NotRedacted#ADAPTER"
  )
  public val c: NotRedacted? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<RedactedChild, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RedactedChild) return false
    if (unknownFields != other.unknownFields) return false
    if (a != other.a) return false
    if (b != other.b) return false
    if (c != other.c) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (a?.hashCode() ?: 0)
      result = result * 37 + (b?.hashCode() ?: 0)
      result = result * 37 + (c?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (a != null) result += """a=${sanitize(a)}"""
    if (b != null) result += """b=$b"""
    if (c != null) result += """c=$c"""
    return result.joinToString(prefix = "RedactedChild{", separator = ", ", postfix = "}")
  }

  public fun copy(
    a: String? = this.a,
    b: RedactedFields? = this.b,
    c: NotRedacted? = this.c,
    unknownFields: ByteString = this.unknownFields
  ): RedactedChild = RedactedChild(a, b, c, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RedactedChild> = object : ProtoAdapter<RedactedChild>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedChild::class, 
      "type.googleapis.com/squareup.protos.kotlin.redacted_test.RedactedChild", 
      PROTO_2, 
      null
    ) {
      public override fun encodedSize(`value`: RedactedChild): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.a)
        size += RedactedFields.ADAPTER.encodedSizeWithTag(2, value.b)
        size += NotRedacted.ADAPTER.encodedSizeWithTag(3, value.c)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: RedactedChild): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a)
        RedactedFields.ADAPTER.encodeWithTag(writer, 2, value.b)
        NotRedacted.ADAPTER.encodeWithTag(writer, 3, value.c)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: RedactedChild): Unit {
        writer.writeBytes(value.unknownFields)
        NotRedacted.ADAPTER.encodeWithTag(writer, 3, value.c)
        RedactedFields.ADAPTER.encodeWithTag(writer, 2, value.b)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.a)
      }

      public override fun decode(reader: ProtoReader): RedactedChild {
        var a: String? = null
        var b: RedactedFields? = null
        var c: NotRedacted? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a = ProtoAdapter.STRING.decode(reader)
            2 -> b = RedactedFields.ADAPTER.decode(reader)
            3 -> c = NotRedacted.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RedactedChild(
          a = a,
          b = b,
          c = c,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: RedactedChild): RedactedChild = value.copy(
        b = value.b?.let(RedactedFields.ADAPTER::redact),
        c = value.c?.let(NotRedacted.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
