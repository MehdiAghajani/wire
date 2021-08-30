// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.edgecases.NoFields in edge_cases.proto
package com.squareup.wire.protos.kotlin.edgecases

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
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

public class NoFields(
  unknownFields: ByteString = ByteString.EMPTY
) : Message<NoFields, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NoFields) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  public override fun hashCode(): Int = unknownFields.hashCode()

  public override fun toString(): String = "NoFields{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): NoFields =
      NoFields(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NoFields> = object : ProtoAdapter<NoFields>(
      FieldEncoding.LENGTH_DELIMITED, 
      NoFields::class, 
      "type.googleapis.com/squareup.protos.kotlin.edgecases.NoFields", 
      PROTO_2, 
      null, 
      "edge_cases.proto"
    ) {
      public override fun encodedSize(`value`: NoFields): Int {
        var size = value.unknownFields.size
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: NoFields): Unit {
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: NoFields): Unit {
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): NoFields {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return NoFields(
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: NoFields): NoFields = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
