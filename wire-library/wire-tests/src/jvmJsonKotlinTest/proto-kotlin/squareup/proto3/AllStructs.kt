// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.AllStructs in all_structs.proto
package squareup.proto3

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.countNonNull
import com.squareup.wire.`internal`.immutableCopyOfMapWithStructValues
import com.squareup.wire.`internal`.immutableCopyOfStruct
import com.squareup.wire.`internal`.redactElements
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmField
import kotlin.lazy
import okio.ByteString

public class AllStructs(
  struct: Map<String, *>? = null,
  list: List<*>? = null,
  null_value: Nothing? = null,
  value_a: Any? = null,
  value_b: Any? = null,
  value_c: Any? = null,
  value_d: Any? = null,
  value_e: Any? = null,
  value_f: Any? = null,
  rep_struct: List<Map<String, *>?> = emptyList(),
  rep_list: List<List<*>?> = emptyList(),
  rep_value_a: List<Any?> = emptyList(),
  rep_null_value: List<Nothing?> = emptyList(),
  map_int32_struct: Map<Int, Map<String, *>?> = emptyMap(),
  map_int32_list: Map<Int, List<*>?> = emptyMap(),
  map_int32_value_a: Map<Int, Any?> = emptyMap(),
  map_int32_null_value: Map<Int, Nothing?> = emptyMap(),
  oneof_struct: Map<String, *>? = null,
  oneof_list: List<*>? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<AllStructs, AllStructs.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
    label = WireField.Label.OMIT_IDENTITY
  )
  @JvmField
  public val struct: Map<String, *>? = immutableCopyOfStruct("struct", struct)

  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
    label = WireField.Label.OMIT_IDENTITY
  )
  @JvmField
  public val list: List<*>? = immutableCopyOfStruct("list", list)

  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_NULL",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "nullValue"
  )
  @JvmField
  public val null_value: Nothing? = immutableCopyOfStruct("null_value", null_value)

  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "valueA"
  )
  @JvmField
  public val value_a: Any? = immutableCopyOfStruct("value_a", value_a)

  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "valueB"
  )
  @JvmField
  public val value_b: Any? = immutableCopyOfStruct("value_b", value_b)

  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "valueC"
  )
  @JvmField
  public val value_c: Any? = immutableCopyOfStruct("value_c", value_c)

  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "valueD"
  )
  @JvmField
  public val value_d: Any? = immutableCopyOfStruct("value_d", value_d)

  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "valueE"
  )
  @JvmField
  public val value_e: Any? = immutableCopyOfStruct("value_e", value_e)

  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "valueF"
  )
  @JvmField
  public val value_f: Any? = immutableCopyOfStruct("value_f", value_f)

  @field:WireField(
    tag = 101,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
    label = WireField.Label.REPEATED,
    jsonName = "repStruct"
  )
  @JvmField
  public val rep_struct: List<Map<String, *>?> = immutableCopyOfStruct("rep_struct", rep_struct)

  @field:WireField(
    tag = 102,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
    label = WireField.Label.REPEATED,
    jsonName = "repList"
  )
  @JvmField
  public val rep_list: List<List<*>?> = immutableCopyOfStruct("rep_list", rep_list)

  @field:WireField(
    tag = 103,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    label = WireField.Label.REPEATED,
    jsonName = "repValueA"
  )
  @JvmField
  public val rep_value_a: List<Any?> = immutableCopyOfStruct("rep_value_a", rep_value_a)

  @field:WireField(
    tag = 104,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_NULL",
    label = WireField.Label.REPEATED,
    jsonName = "repNullValue"
  )
  @JvmField
  public val rep_null_value: List<Nothing?> = immutableCopyOfStruct("rep_null_value",
      rep_null_value)

  @field:WireField(
    tag = 301,
    keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
    jsonName = "mapInt32Struct"
  )
  @JvmField
  public val map_int32_struct: Map<Int, Map<String, *>?> =
      immutableCopyOfMapWithStructValues("map_int32_struct", map_int32_struct)

  @field:WireField(
    tag = 302,
    keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
    jsonName = "mapInt32List"
  )
  @JvmField
  public val map_int32_list: Map<Int, List<*>?> =
      immutableCopyOfMapWithStructValues("map_int32_list", map_int32_list)

  @field:WireField(
    tag = 303,
    keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_VALUE",
    jsonName = "mapInt32ValueA"
  )
  @JvmField
  public val map_int32_value_a: Map<Int, Any?> =
      immutableCopyOfMapWithStructValues("map_int32_value_a", map_int32_value_a)

  @field:WireField(
    tag = 304,
    keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_NULL",
    jsonName = "mapInt32NullValue"
  )
  @JvmField
  public val map_int32_null_value: Map<Int, Nothing?> =
      immutableCopyOfMapWithStructValues("map_int32_null_value", map_int32_null_value)

  @field:WireField(
    tag = 201,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
    jsonName = "oneofStruct",
    oneofName = "choice"
  )
  @JvmField
  public val oneof_struct: Map<String, *>? = immutableCopyOfStruct("oneof_struct", oneof_struct)

  @field:WireField(
    tag = 202,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_LIST",
    jsonName = "oneofList",
    oneofName = "choice"
  )
  @JvmField
  public val oneof_list: List<*>? = immutableCopyOfStruct("oneof_list", oneof_list)

  init {
    require(countNonNull(oneof_struct, oneof_list) <= 1) {
      "At most one of oneof_struct, oneof_list may be non-null"
    }
  }

  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.struct = struct
    builder.list = list
    builder.null_value = null_value
    builder.value_a = value_a
    builder.value_b = value_b
    builder.value_c = value_c
    builder.value_d = value_d
    builder.value_e = value_e
    builder.value_f = value_f
    builder.rep_struct = rep_struct
    builder.rep_list = rep_list
    builder.rep_value_a = rep_value_a
    builder.rep_null_value = rep_null_value
    builder.map_int32_struct = map_int32_struct
    builder.map_int32_list = map_int32_list
    builder.map_int32_value_a = map_int32_value_a
    builder.map_int32_null_value = map_int32_null_value
    builder.oneof_struct = oneof_struct
    builder.oneof_list = oneof_list
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is AllStructs) return false
    if (unknownFields != other.unknownFields) return false
    if (struct != other.struct) return false
    if (list != other.list) return false
    if (null_value != other.null_value) return false
    if (value_a != other.value_a) return false
    if (value_b != other.value_b) return false
    if (value_c != other.value_c) return false
    if (value_d != other.value_d) return false
    if (value_e != other.value_e) return false
    if (value_f != other.value_f) return false
    if (rep_struct != other.rep_struct) return false
    if (rep_list != other.rep_list) return false
    if (rep_value_a != other.rep_value_a) return false
    if (rep_null_value != other.rep_null_value) return false
    if (map_int32_struct != other.map_int32_struct) return false
    if (map_int32_list != other.map_int32_list) return false
    if (map_int32_value_a != other.map_int32_value_a) return false
    if (map_int32_null_value != other.map_int32_null_value) return false
    if (oneof_struct != other.oneof_struct) return false
    if (oneof_list != other.oneof_list) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (struct?.hashCode() ?: 0)
      result = result * 37 + (list?.hashCode() ?: 0)
      result = result * 37 + (null_value?.hashCode() ?: 0)
      result = result * 37 + (value_a?.hashCode() ?: 0)
      result = result * 37 + (value_b?.hashCode() ?: 0)
      result = result * 37 + (value_c?.hashCode() ?: 0)
      result = result * 37 + (value_d?.hashCode() ?: 0)
      result = result * 37 + (value_e?.hashCode() ?: 0)
      result = result * 37 + (value_f?.hashCode() ?: 0)
      result = result * 37 + rep_struct.hashCode()
      result = result * 37 + rep_list.hashCode()
      result = result * 37 + rep_value_a.hashCode()
      result = result * 37 + rep_null_value.hashCode()
      result = result * 37 + map_int32_struct.hashCode()
      result = result * 37 + map_int32_list.hashCode()
      result = result * 37 + map_int32_value_a.hashCode()
      result = result * 37 + map_int32_null_value.hashCode()
      result = result * 37 + (oneof_struct?.hashCode() ?: 0)
      result = result * 37 + (oneof_list?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (struct != null) result += """struct=$struct"""
    if (list != null) result += """list=$list"""
    if (null_value != null) result += """null_value=$null_value"""
    if (value_a != null) result += """value_a=$value_a"""
    if (value_b != null) result += """value_b=$value_b"""
    if (value_c != null) result += """value_c=$value_c"""
    if (value_d != null) result += """value_d=$value_d"""
    if (value_e != null) result += """value_e=$value_e"""
    if (value_f != null) result += """value_f=$value_f"""
    if (rep_struct.isNotEmpty()) result += """rep_struct=$rep_struct"""
    if (rep_list.isNotEmpty()) result += """rep_list=$rep_list"""
    if (rep_value_a.isNotEmpty()) result += """rep_value_a=$rep_value_a"""
    if (rep_null_value.isNotEmpty()) result += """rep_null_value=$rep_null_value"""
    if (map_int32_struct.isNotEmpty()) result += """map_int32_struct=$map_int32_struct"""
    if (map_int32_list.isNotEmpty()) result += """map_int32_list=$map_int32_list"""
    if (map_int32_value_a.isNotEmpty()) result += """map_int32_value_a=$map_int32_value_a"""
    if (map_int32_null_value.isNotEmpty()) result +=
        """map_int32_null_value=$map_int32_null_value"""
    if (oneof_struct != null) result += """oneof_struct=$oneof_struct"""
    if (oneof_list != null) result += """oneof_list=$oneof_list"""
    return result.joinToString(prefix = "AllStructs{", separator = ", ", postfix = "}")
  }

  public fun copy(
    struct: Map<String, *>? = this.struct,
    list: List<*>? = this.list,
    null_value: Nothing? = this.null_value,
    value_a: Any? = this.value_a,
    value_b: Any? = this.value_b,
    value_c: Any? = this.value_c,
    value_d: Any? = this.value_d,
    value_e: Any? = this.value_e,
    value_f: Any? = this.value_f,
    rep_struct: List<Map<String, *>?> = this.rep_struct,
    rep_list: List<List<*>?> = this.rep_list,
    rep_value_a: List<Any?> = this.rep_value_a,
    rep_null_value: List<Nothing?> = this.rep_null_value,
    map_int32_struct: Map<Int, Map<String, *>?> = this.map_int32_struct,
    map_int32_list: Map<Int, List<*>?> = this.map_int32_list,
    map_int32_value_a: Map<Int, Any?> = this.map_int32_value_a,
    map_int32_null_value: Map<Int, Nothing?> = this.map_int32_null_value,
    oneof_struct: Map<String, *>? = this.oneof_struct,
    oneof_list: List<*>? = this.oneof_list,
    unknownFields: ByteString = this.unknownFields
  ): AllStructs = AllStructs(struct, list, null_value, value_a, value_b, value_c, value_d, value_e,
      value_f, rep_struct, rep_list, rep_value_a, rep_null_value, map_int32_struct, map_int32_list,
      map_int32_value_a, map_int32_null_value, oneof_struct, oneof_list, unknownFields)

  public class Builder : Message.Builder<AllStructs, Builder>() {
    @JvmField
    public var struct: Map<String, *>? = null

    @JvmField
    public var list: List<*>? = null

    @JvmField
    public var null_value: Nothing? = null

    @JvmField
    public var value_a: Any? = null

    @JvmField
    public var value_b: Any? = null

    @JvmField
    public var value_c: Any? = null

    @JvmField
    public var value_d: Any? = null

    @JvmField
    public var value_e: Any? = null

    @JvmField
    public var value_f: Any? = null

    @JvmField
    public var rep_struct: List<Map<String, *>?> = emptyList()

    @JvmField
    public var rep_list: List<List<*>?> = emptyList()

    @JvmField
    public var rep_value_a: List<Any?> = emptyList()

    @JvmField
    public var rep_null_value: List<Nothing?> = emptyList()

    @JvmField
    public var map_int32_struct: Map<Int, Map<String, *>?> = emptyMap()

    @JvmField
    public var map_int32_list: Map<Int, List<*>?> = emptyMap()

    @JvmField
    public var map_int32_value_a: Map<Int, Any?> = emptyMap()

    @JvmField
    public var map_int32_null_value: Map<Int, Nothing?> = emptyMap()

    @JvmField
    public var oneof_struct: Map<String, *>? = null

    @JvmField
    public var oneof_list: List<*>? = null

    public fun struct(struct: Map<String, *>?): Builder {
      this.struct = struct
      return this
    }

    public fun list(list: List<*>?): Builder {
      this.list = list
      return this
    }

    public fun null_value(null_value: Nothing): Builder {
      this.null_value = null_value
      return this
    }

    public fun value_a(value_a: Any?): Builder {
      this.value_a = value_a
      return this
    }

    public fun value_b(value_b: Any?): Builder {
      this.value_b = value_b
      return this
    }

    public fun value_c(value_c: Any?): Builder {
      this.value_c = value_c
      return this
    }

    public fun value_d(value_d: Any?): Builder {
      this.value_d = value_d
      return this
    }

    public fun value_e(value_e: Any?): Builder {
      this.value_e = value_e
      return this
    }

    public fun value_f(value_f: Any?): Builder {
      this.value_f = value_f
      return this
    }

    public fun rep_struct(rep_struct: List<Map<String, *>?>): Builder {
      checkElementsNotNull(rep_struct)
      this.rep_struct = rep_struct
      return this
    }

    public fun rep_list(rep_list: List<List<*>?>): Builder {
      checkElementsNotNull(rep_list)
      this.rep_list = rep_list
      return this
    }

    public fun rep_value_a(rep_value_a: List<Any?>): Builder {
      checkElementsNotNull(rep_value_a)
      this.rep_value_a = rep_value_a
      return this
    }

    public fun rep_null_value(rep_null_value: List<Nothing?>): Builder {
      checkElementsNotNull(rep_null_value)
      this.rep_null_value = rep_null_value
      return this
    }

    public fun map_int32_struct(map_int32_struct: Map<Int, Map<String, *>?>): Builder {
      this.map_int32_struct = map_int32_struct
      return this
    }

    public fun map_int32_list(map_int32_list: Map<Int, List<*>?>): Builder {
      this.map_int32_list = map_int32_list
      return this
    }

    public fun map_int32_value_a(map_int32_value_a: Map<Int, Any?>): Builder {
      this.map_int32_value_a = map_int32_value_a
      return this
    }

    public fun map_int32_null_value(map_int32_null_value: Map<Int, Nothing?>): Builder {
      this.map_int32_null_value = map_int32_null_value
      return this
    }

    public fun oneof_struct(oneof_struct: Map<String, *>?): Builder {
      this.oneof_struct = oneof_struct
      this.oneof_list = null
      return this
    }

    public fun oneof_list(oneof_list: List<*>?): Builder {
      this.oneof_list = oneof_list
      this.oneof_struct = null
      return this
    }

    public override fun build(): AllStructs = AllStructs(
      struct = struct,
      list = list,
      null_value = null_value,
      value_a = value_a,
      value_b = value_b,
      value_c = value_c,
      value_d = value_d,
      value_e = value_e,
      value_f = value_f,
      rep_struct = rep_struct,
      rep_list = rep_list,
      rep_value_a = rep_value_a,
      rep_null_value = rep_null_value,
      map_int32_struct = map_int32_struct,
      map_int32_list = map_int32_list,
      map_int32_value_a = map_int32_value_a,
      map_int32_null_value = map_int32_null_value,
      oneof_struct = oneof_struct,
      oneof_list = oneof_list,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<AllStructs> = object : ProtoAdapter<AllStructs>(
      FieldEncoding.LENGTH_DELIMITED, 
      AllStructs::class, 
      "type.googleapis.com/squareup.proto3.AllStructs", 
      PROTO_3, 
      null
    ) {
      private val map_int32_structAdapter: ProtoAdapter<Map<Int, Map<String, *>?>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRUCT_MAP) }

      private val map_int32_listAdapter: ProtoAdapter<Map<Int, List<*>?>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRUCT_LIST) }

      private val map_int32_value_aAdapter: ProtoAdapter<Map<Int, Any?>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRUCT_VALUE) }

      private val map_int32_null_valueAdapter: ProtoAdapter<Map<Int, Nothing?>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRUCT_NULL) }

      public override fun encodedSize(`value`: AllStructs): Int {
        var size = value.unknownFields.size
        if (value.struct != null) size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1,
            value.struct)
        if (value.list != null) size += ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(2, value.list)
        if (value.null_value != null) size += ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(3,
            value.null_value)
        if (value.value_a != null) size += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(4,
            value.value_a)
        if (value.value_b != null) size += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(5,
            value.value_b)
        if (value.value_c != null) size += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(6,
            value.value_c)
        if (value.value_d != null) size += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(7,
            value.value_d)
        if (value.value_e != null) size += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(8,
            value.value_e)
        if (value.value_f != null) size += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(9,
            value.value_f)
        size += ProtoAdapter.STRUCT_MAP.asRepeated().encodedSizeWithTag(101, value.rep_struct)
        size += ProtoAdapter.STRUCT_LIST.asRepeated().encodedSizeWithTag(102, value.rep_list)
        size += ProtoAdapter.STRUCT_VALUE.asRepeated().encodedSizeWithTag(103, value.rep_value_a)
        size += ProtoAdapter.STRUCT_NULL.asRepeated().encodedSizeWithTag(104, value.rep_null_value)
        size += map_int32_structAdapter.encodedSizeWithTag(301, value.map_int32_struct)
        size += map_int32_listAdapter.encodedSizeWithTag(302, value.map_int32_list)
        size += map_int32_value_aAdapter.encodedSizeWithTag(303, value.map_int32_value_a)
        size += map_int32_null_valueAdapter.encodedSizeWithTag(304, value.map_int32_null_value)
        size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(201, value.oneof_struct)
        size += ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(202, value.oneof_list)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: AllStructs): Unit {
        if (value.struct != null) ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, value.struct)
        if (value.list != null) ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 2, value.list)
        if (value.null_value != null) ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 3,
            value.null_value)
        if (value.value_a != null) ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 4, value.value_a)
        if (value.value_b != null) ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 5, value.value_b)
        if (value.value_c != null) ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 6, value.value_c)
        if (value.value_d != null) ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 7, value.value_d)
        if (value.value_e != null) ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 8, value.value_e)
        if (value.value_f != null) ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 9, value.value_f)
        ProtoAdapter.STRUCT_MAP.asRepeated().encodeWithTag(writer, 101, value.rep_struct)
        ProtoAdapter.STRUCT_LIST.asRepeated().encodeWithTag(writer, 102, value.rep_list)
        ProtoAdapter.STRUCT_VALUE.asRepeated().encodeWithTag(writer, 103, value.rep_value_a)
        ProtoAdapter.STRUCT_NULL.asRepeated().encodeWithTag(writer, 104, value.rep_null_value)
        map_int32_structAdapter.encodeWithTag(writer, 301, value.map_int32_struct)
        map_int32_listAdapter.encodeWithTag(writer, 302, value.map_int32_list)
        map_int32_value_aAdapter.encodeWithTag(writer, 303, value.map_int32_value_a)
        map_int32_null_valueAdapter.encodeWithTag(writer, 304, value.map_int32_null_value)
        ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 201, value.oneof_struct)
        ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 202, value.oneof_list)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): AllStructs {
        var struct: Map<String, *>? = null
        var list: List<*>? = null
        var null_value: Nothing? = null
        var value_a: Any? = null
        var value_b: Any? = null
        var value_c: Any? = null
        var value_d: Any? = null
        var value_e: Any? = null
        var value_f: Any? = null
        val rep_struct = mutableListOf<Map<String, *>?>()
        val rep_list = mutableListOf<List<*>?>()
        val rep_value_a = mutableListOf<Any?>()
        val rep_null_value = mutableListOf<Nothing?>()
        val map_int32_struct = mutableMapOf<Int, Map<String, *>?>()
        val map_int32_list = mutableMapOf<Int, List<*>?>()
        val map_int32_value_a = mutableMapOf<Int, Any?>()
        val map_int32_null_value = mutableMapOf<Int, Nothing?>()
        var oneof_struct: Map<String, *>? = null
        var oneof_list: List<*>? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> struct = ProtoAdapter.STRUCT_MAP.decode(reader)
            2 -> list = ProtoAdapter.STRUCT_LIST.decode(reader)
            3 -> try {
              null_value = ProtoAdapter.STRUCT_NULL.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            4 -> value_a = ProtoAdapter.STRUCT_VALUE.decode(reader)
            5 -> value_b = ProtoAdapter.STRUCT_VALUE.decode(reader)
            6 -> value_c = ProtoAdapter.STRUCT_VALUE.decode(reader)
            7 -> value_d = ProtoAdapter.STRUCT_VALUE.decode(reader)
            8 -> value_e = ProtoAdapter.STRUCT_VALUE.decode(reader)
            9 -> value_f = ProtoAdapter.STRUCT_VALUE.decode(reader)
            101 -> rep_struct.add(ProtoAdapter.STRUCT_MAP.decode(reader))
            102 -> rep_list.add(ProtoAdapter.STRUCT_LIST.decode(reader))
            103 -> rep_value_a.add(ProtoAdapter.STRUCT_VALUE.decode(reader))
            104 -> try {
              rep_null_value.add(ProtoAdapter.STRUCT_NULL.decode(reader))
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            301 -> map_int32_struct.putAll(map_int32_structAdapter.decode(reader))
            302 -> map_int32_list.putAll(map_int32_listAdapter.decode(reader))
            303 -> map_int32_value_a.putAll(map_int32_value_aAdapter.decode(reader))
            304 -> map_int32_null_value.putAll(map_int32_null_valueAdapter.decode(reader))
            201 -> oneof_struct = ProtoAdapter.STRUCT_MAP.decode(reader)
            202 -> oneof_list = ProtoAdapter.STRUCT_LIST.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return AllStructs(
          struct = struct,
          list = list,
          null_value = null_value,
          value_a = value_a,
          value_b = value_b,
          value_c = value_c,
          value_d = value_d,
          value_e = value_e,
          value_f = value_f,
          rep_struct = rep_struct,
          rep_list = rep_list,
          rep_value_a = rep_value_a,
          rep_null_value = rep_null_value,
          map_int32_struct = map_int32_struct,
          map_int32_list = map_int32_list,
          map_int32_value_a = map_int32_value_a,
          map_int32_null_value = map_int32_null_value,
          oneof_struct = oneof_struct,
          oneof_list = oneof_list,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: AllStructs): AllStructs = value.copy(
        struct = value.struct?.let(ProtoAdapter.STRUCT_MAP::redact),
        list = value.list?.let(ProtoAdapter.STRUCT_LIST::redact),
        value_a = value.value_a?.let(ProtoAdapter.STRUCT_VALUE::redact),
        value_b = value.value_b?.let(ProtoAdapter.STRUCT_VALUE::redact),
        value_c = value.value_c?.let(ProtoAdapter.STRUCT_VALUE::redact),
        value_d = value.value_d?.let(ProtoAdapter.STRUCT_VALUE::redact),
        value_e = value.value_e?.let(ProtoAdapter.STRUCT_VALUE::redact),
        value_f = value.value_f?.let(ProtoAdapter.STRUCT_VALUE::redact),
        rep_struct = value.rep_struct.redactElements(ProtoAdapter.STRUCT_MAP),
        rep_list = value.rep_list.redactElements(ProtoAdapter.STRUCT_LIST),
        rep_value_a = value.rep_value_a.redactElements(ProtoAdapter.STRUCT_VALUE),
        map_int32_struct = value.map_int32_struct.redactElements(ProtoAdapter.STRUCT_MAP),
        map_int32_list = value.map_int32_list.redactElements(ProtoAdapter.STRUCT_LIST),
        map_int32_value_a = value.map_int32_value_a.redactElements(ProtoAdapter.STRUCT_VALUE),
        oneof_struct = value.oneof_struct?.let(ProtoAdapter.STRUCT_MAP::redact),
        oneof_list = value.oneof_list?.let(ProtoAdapter.STRUCT_LIST::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
