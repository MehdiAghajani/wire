// Code generated by Wire protocol buffer compiler, do not edit.
// Source: grpc.reflection.v1alpha.ServiceResponse in grpc/reflection/v1alpha/reflection.proto
package grpc.reflection.v1alpha

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * The information of a single service used by ListServiceResponse to answer
 * list_services request.
 */
public class ServiceResponse(
  /**
   * Full name of a registered service, including its package name. The format
   * is <package>.<service>
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY
  )
  @JvmField
  public val name: String = "",
  unknownFields: ByteString = ByteString.EMPTY
) : Message<ServiceResponse, ServiceResponse.Builder>(ADAPTER, unknownFields) {
  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ServiceResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    result += """name=${sanitize(name)}"""
    return result.joinToString(prefix = "ServiceResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(name: String = this.name, unknownFields: ByteString = this.unknownFields):
      ServiceResponse = ServiceResponse(name, unknownFields)

  public class Builder : Message.Builder<ServiceResponse, Builder>() {
    @JvmField
    public var name: String = ""

    /**
     * Full name of a registered service, including its package name. The format
     * is <package>.<service>
     */
    public fun name(name: String): Builder {
      this.name = name
      return this
    }

    public override fun build(): ServiceResponse = ServiceResponse(
      name = name,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ServiceResponse> = object : ProtoAdapter<ServiceResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      ServiceResponse::class, 
      "type.googleapis.com/grpc.reflection.v1alpha.ServiceResponse", 
      PROTO_3, 
      null
    ) {
      public override fun encodedSize(value: ServiceResponse): Int {
        var size = value.unknownFields.size
        if (value.name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        return size
      }

      public override fun encode(writer: ProtoWriter, value: ServiceResponse): Unit {
        if (value.name != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): ServiceResponse {
        var name: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ServiceResponse(
          name = name,
          unknownFields = unknownFields
        )
      }

      public override fun redact(value: ServiceResponse): ServiceResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}