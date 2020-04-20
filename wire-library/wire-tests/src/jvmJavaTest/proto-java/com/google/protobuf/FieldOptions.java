// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.squareup.wire.protos.custom_options.FooBar;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class FieldOptions extends Message<FieldOptions, FieldOptions.Builder> {
  public static final ProtoAdapter<FieldOptions> ADAPTER = new ProtoAdapter_FieldOptions();

  private static final long serialVersionUID = 0L;

  public static final CType DEFAULT_CTYPE = CType.STRING;

  public static final Boolean DEFAULT_PACKED = false;

  public static final JSType DEFAULT_JSTYPE = JSType.JS_NORMAL;

  public static final Boolean DEFAULT_LAZY = false;

  public static final Boolean DEFAULT_DEPRECATED = false;

  public static final Boolean DEFAULT_WEAK = false;

  public static final Integer DEFAULT_MY_FIELD_OPTION_ONE = 0;

  public static final Float DEFAULT_MY_FIELD_OPTION_TWO = 0.0f;

  public static final FooBar.FooBarBazEnum DEFAULT_MY_FIELD_OPTION_THREE = FooBar.FooBarBazEnum.FOO;

  public static final String DEFAULT_SQUAREUP_PROTOS_EXTENSION_COLLISION_1_A = "";

  public static final String DEFAULT_B = "";

  public static final String DEFAULT_SQUAREUP_PROTOS_EXTENSION_COLLISION_2_A = "";

  public static final String DEFAULT_C = "";

  public static final Boolean DEFAULT_REDACTED = false;

  public static final Boolean DEFAULT_RELEVANT = false;

  public static final Boolean DEFAULT_UNUSED = false;

  /**
   * The ctype option instructs the C++ code generator to use a different
   * representation of the field than it normally would.  See the specific
   * options below.  This option is not yet implemented in the open source
   * release -- sorry, we'll try to include it in a future version!
   */
  @WireField(
      tag = 1,
      adapter = "com.google.protobuf.FieldOptions$CType#ADAPTER"
  )
  public final CType ctype;

  /**
   * The packed option can be enabled for repeated primitive fields to enable
   * a more efficient representation on the wire. Rather than repeatedly
   * writing the tag and type for each element, the entire array is encoded as
   * a single length-delimited blob. In proto3, only explicit setting it to
   * false will avoid using packed encoding.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean packed;

  /**
   * The jstype option determines the JavaScript type used for values of the
   * field.  The option is permitted only for 64 bit integral and fixed types
   * (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
   * is represented as JavaScript string, which avoids loss of precision that
   * can happen when a large value is converted to a floating point JavaScript.
   * Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
   * use the JavaScript "number" type.  The behavior of the default option
   * JS_NORMAL is implementation dependent.
   *
   * This option is an enum to permit additional types to be added, e.g.
   * goog.math.Integer.
   */
  @WireField(
      tag = 6,
      adapter = "com.google.protobuf.FieldOptions$JSType#ADAPTER"
  )
  public final JSType jstype;

  /**
   * Should this field be parsed lazily?  Lazy applies only to message-type
   * fields.  It means that when the outer message is initially parsed, the
   * inner message's contents will not be parsed but instead stored in encoded
   * form.  The inner message will actually be parsed when it is first accessed.
   *
   * This is only a hint.  Implementations are free to choose whether to use
   * eager or lazy parsing regardless of the value of this option.  However,
   * setting this option true suggests that the protocol author believes that
   * using lazy parsing on this field is worth the additional bookkeeping
   * overhead typically needed to implement it.
   *
   * This option does not affect the public interface of any generated code;
   * all method signatures remain the same.  Furthermore, thread-safety of the
   * interface is not affected by this option; const methods remain safe to
   * call from multiple threads concurrently, while non-const methods continue
   * to require exclusive access.
   *
   *
   * Note that implementations may choose not to check required fields within
   * a lazy sub-message.  That is, calling IsInitialized() on the outer message
   * may return true even if the inner message has missing required fields.
   * This is necessary because otherwise the inner message would have to be
   * parsed in order to perform the check, defeating the purpose of lazy
   * parsing.  An implementation which chooses not to check required fields
   * must be consistent about it.  That is, for any particular sub-message, the
   * implementation must either *always* check its required fields, or *never*
   * check its required fields, regardless of whether or not the message has
   * been parsed.
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean lazy;

  /**
   * Is this field deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for accessors, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating fields.
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deprecated;

  /**
   * For Google-internal migration only. Do not use.
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean weak;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @WireField(
      tag = 999,
      adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UninterpretedOption> uninterpreted_option;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 60001,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer my_field_option_one;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 60002,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float my_field_option_two;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 60003,
      adapter = "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER"
  )
  public final FooBar.FooBarBazEnum my_field_option_three;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 60004,
      adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  public final FooBar my_field_option_four;

  /**
   * Extension source: extension_collision_1.proto
   */
  @WireField(
      tag = 22101,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      declaredName = "a"
  )
  public final String squareup_protos_extension_collision_1_a;

  /**
   * Extension source: extension_collision_1.proto
   */
  @WireField(
      tag = 22102,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String b;

  /**
   * Extension source: extension_collision_2.proto
   */
  @WireField(
      tag = 22103,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      declaredName = "a"
  )
  public final String squareup_protos_extension_collision_2_a;

  /**
   * Extension source: extension_collision_2.proto
   */
  @WireField(
      tag = 22104,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String c;

  /**
   * Fields marked with redacted are not to be logged, generally for PCI or PII.
   * Extension source: option_redacted.proto
   */
  @WireField(
      tag = 22200,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean redacted;

  /**
   * Extension source: options.proto
   */
  @WireField(
      tag = 22301,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean relevant;

  /**
   * Extension source: options.proto
   */
  @WireField(
      tag = 22302,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean unused;

  public FieldOptions(Builder builder, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.ctype = builder.ctype;
    this.packed = builder.packed;
    this.jstype = builder.jstype;
    this.lazy = builder.lazy;
    this.deprecated = builder.deprecated;
    this.weak = builder.weak;
    this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", builder.uninterpreted_option);
    this.my_field_option_one = builder.my_field_option_one;
    this.my_field_option_two = builder.my_field_option_two;
    this.my_field_option_three = builder.my_field_option_three;
    this.my_field_option_four = builder.my_field_option_four;
    this.squareup_protos_extension_collision_1_a = builder.squareup_protos_extension_collision_1_a;
    this.b = builder.b;
    this.squareup_protos_extension_collision_2_a = builder.squareup_protos_extension_collision_2_a;
    this.c = builder.c;
    this.redacted = builder.redacted;
    this.relevant = builder.relevant;
    this.unused = builder.unused;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.ctype = ctype;
    builder.packed = packed;
    builder.jstype = jstype;
    builder.lazy = lazy;
    builder.deprecated = deprecated;
    builder.weak = weak;
    builder.uninterpreted_option = Internal.copyOf(uninterpreted_option);
    builder.my_field_option_one = my_field_option_one;
    builder.my_field_option_two = my_field_option_two;
    builder.my_field_option_three = my_field_option_three;
    builder.my_field_option_four = my_field_option_four;
    builder.squareup_protos_extension_collision_1_a = squareup_protos_extension_collision_1_a;
    builder.b = b;
    builder.squareup_protos_extension_collision_2_a = squareup_protos_extension_collision_2_a;
    builder.c = c;
    builder.redacted = redacted;
    builder.relevant = relevant;
    builder.unused = unused;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FieldOptions)) return false;
    FieldOptions o = (FieldOptions) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(ctype, o.ctype)
        && Internal.equals(packed, o.packed)
        && Internal.equals(jstype, o.jstype)
        && Internal.equals(lazy, o.lazy)
        && Internal.equals(deprecated, o.deprecated)
        && Internal.equals(weak, o.weak)
        && uninterpreted_option.equals(o.uninterpreted_option)
        && Internal.equals(my_field_option_one, o.my_field_option_one)
        && Internal.equals(my_field_option_two, o.my_field_option_two)
        && Internal.equals(my_field_option_three, o.my_field_option_three)
        && Internal.equals(my_field_option_four, o.my_field_option_four)
        && Internal.equals(squareup_protos_extension_collision_1_a, o.squareup_protos_extension_collision_1_a)
        && Internal.equals(b, o.b)
        && Internal.equals(squareup_protos_extension_collision_2_a, o.squareup_protos_extension_collision_2_a)
        && Internal.equals(c, o.c)
        && Internal.equals(redacted, o.redacted)
        && Internal.equals(relevant, o.relevant)
        && Internal.equals(unused, o.unused);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (ctype != null ? ctype.hashCode() : 0);
      result = result * 37 + (packed != null ? packed.hashCode() : 0);
      result = result * 37 + (jstype != null ? jstype.hashCode() : 0);
      result = result * 37 + (lazy != null ? lazy.hashCode() : 0);
      result = result * 37 + (deprecated != null ? deprecated.hashCode() : 0);
      result = result * 37 + (weak != null ? weak.hashCode() : 0);
      result = result * 37 + uninterpreted_option.hashCode();
      result = result * 37 + (my_field_option_one != null ? my_field_option_one.hashCode() : 0);
      result = result * 37 + (my_field_option_two != null ? my_field_option_two.hashCode() : 0);
      result = result * 37 + (my_field_option_three != null ? my_field_option_three.hashCode() : 0);
      result = result * 37 + (my_field_option_four != null ? my_field_option_four.hashCode() : 0);
      result = result * 37 + (squareup_protos_extension_collision_1_a != null ? squareup_protos_extension_collision_1_a.hashCode() : 0);
      result = result * 37 + (b != null ? b.hashCode() : 0);
      result = result * 37 + (squareup_protos_extension_collision_2_a != null ? squareup_protos_extension_collision_2_a.hashCode() : 0);
      result = result * 37 + (c != null ? c.hashCode() : 0);
      result = result * 37 + (redacted != null ? redacted.hashCode() : 0);
      result = result * 37 + (relevant != null ? relevant.hashCode() : 0);
      result = result * 37 + (unused != null ? unused.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (ctype != null) builder.append(", ctype=").append(ctype);
    if (packed != null) builder.append(", packed=").append(packed);
    if (jstype != null) builder.append(", jstype=").append(jstype);
    if (lazy != null) builder.append(", lazy=").append(lazy);
    if (deprecated != null) builder.append(", deprecated=").append(deprecated);
    if (weak != null) builder.append(", weak=").append(weak);
    if (!uninterpreted_option.isEmpty()) builder.append(", uninterpreted_option=").append(uninterpreted_option);
    if (my_field_option_one != null) builder.append(", my_field_option_one=").append(my_field_option_one);
    if (my_field_option_two != null) builder.append(", my_field_option_two=").append(my_field_option_two);
    if (my_field_option_three != null) builder.append(", my_field_option_three=").append(my_field_option_three);
    if (my_field_option_four != null) builder.append(", my_field_option_four=").append(my_field_option_four);
    if (squareup_protos_extension_collision_1_a != null) builder.append(", a=").append(Internal.sanitize(squareup_protos_extension_collision_1_a));
    if (b != null) builder.append(", b=").append(Internal.sanitize(b));
    if (squareup_protos_extension_collision_2_a != null) builder.append(", a=").append(Internal.sanitize(squareup_protos_extension_collision_2_a));
    if (c != null) builder.append(", c=").append(Internal.sanitize(c));
    if (redacted != null) builder.append(", redacted=").append(redacted);
    if (relevant != null) builder.append(", relevant=").append(relevant);
    if (unused != null) builder.append(", unused=").append(unused);
    return builder.replace(0, 2, "FieldOptions{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<FieldOptions, Builder> {
    public CType ctype;

    public Boolean packed;

    public JSType jstype;

    public Boolean lazy;

    public Boolean deprecated;

    public Boolean weak;

    public List<UninterpretedOption> uninterpreted_option;

    public Integer my_field_option_one;

    public Float my_field_option_two;

    public FooBar.FooBarBazEnum my_field_option_three;

    public FooBar my_field_option_four;

    public String squareup_protos_extension_collision_1_a;

    public String b;

    public String squareup_protos_extension_collision_2_a;

    public String c;

    public Boolean redacted;

    public Boolean relevant;

    public Boolean unused;

    public Builder() {
      uninterpreted_option = Internal.newMutableList();
    }

    /**
     * The ctype option instructs the C++ code generator to use a different
     * representation of the field than it normally would.  See the specific
     * options below.  This option is not yet implemented in the open source
     * release -- sorry, we'll try to include it in a future version!
     */
    public Builder ctype(CType ctype) {
      this.ctype = ctype;
      return this;
    }

    /**
     * The packed option can be enabled for repeated primitive fields to enable
     * a more efficient representation on the wire. Rather than repeatedly
     * writing the tag and type for each element, the entire array is encoded as
     * a single length-delimited blob. In proto3, only explicit setting it to
     * false will avoid using packed encoding.
     */
    public Builder packed(Boolean packed) {
      this.packed = packed;
      return this;
    }

    /**
     * The jstype option determines the JavaScript type used for values of the
     * field.  The option is permitted only for 64 bit integral and fixed types
     * (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
     * is represented as JavaScript string, which avoids loss of precision that
     * can happen when a large value is converted to a floating point JavaScript.
     * Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
     * use the JavaScript "number" type.  The behavior of the default option
     * JS_NORMAL is implementation dependent.
     *
     * This option is an enum to permit additional types to be added, e.g.
     * goog.math.Integer.
     */
    public Builder jstype(JSType jstype) {
      this.jstype = jstype;
      return this;
    }

    /**
     * Should this field be parsed lazily?  Lazy applies only to message-type
     * fields.  It means that when the outer message is initially parsed, the
     * inner message's contents will not be parsed but instead stored in encoded
     * form.  The inner message will actually be parsed when it is first accessed.
     *
     * This is only a hint.  Implementations are free to choose whether to use
     * eager or lazy parsing regardless of the value of this option.  However,
     * setting this option true suggests that the protocol author believes that
     * using lazy parsing on this field is worth the additional bookkeeping
     * overhead typically needed to implement it.
     *
     * This option does not affect the public interface of any generated code;
     * all method signatures remain the same.  Furthermore, thread-safety of the
     * interface is not affected by this option; const methods remain safe to
     * call from multiple threads concurrently, while non-const methods continue
     * to require exclusive access.
     *
     *
     * Note that implementations may choose not to check required fields within
     * a lazy sub-message.  That is, calling IsInitialized() on the outer message
     * may return true even if the inner message has missing required fields.
     * This is necessary because otherwise the inner message would have to be
     * parsed in order to perform the check, defeating the purpose of lazy
     * parsing.  An implementation which chooses not to check required fields
     * must be consistent about it.  That is, for any particular sub-message, the
     * implementation must either *always* check its required fields, or *never*
     * check its required fields, regardless of whether or not the message has
     * been parsed.
     */
    public Builder lazy(Boolean lazy) {
      this.lazy = lazy;
      return this;
    }

    /**
     * Is this field deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for accessors, or it will be completely ignored; in the very least, this
     * is a formalization for deprecating fields.
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    /**
     * For Google-internal migration only. Do not use.
     */
    public Builder weak(Boolean weak) {
      this.weak = weak;
      return this;
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      Internal.checkElementsNotNull(uninterpreted_option);
      this.uninterpreted_option = uninterpreted_option;
      return this;
    }

    public Builder my_field_option_one(Integer my_field_option_one) {
      this.my_field_option_one = my_field_option_one;
      return this;
    }

    public Builder my_field_option_two(Float my_field_option_two) {
      this.my_field_option_two = my_field_option_two;
      return this;
    }

    public Builder my_field_option_three(FooBar.FooBarBazEnum my_field_option_three) {
      this.my_field_option_three = my_field_option_three;
      return this;
    }

    public Builder my_field_option_four(FooBar my_field_option_four) {
      this.my_field_option_four = my_field_option_four;
      return this;
    }

    public Builder squareup_protos_extension_collision_1_a(
        String squareup_protos_extension_collision_1_a) {
      this.squareup_protos_extension_collision_1_a = squareup_protos_extension_collision_1_a;
      return this;
    }

    public Builder b(String b) {
      this.b = b;
      return this;
    }

    public Builder squareup_protos_extension_collision_2_a(
        String squareup_protos_extension_collision_2_a) {
      this.squareup_protos_extension_collision_2_a = squareup_protos_extension_collision_2_a;
      return this;
    }

    public Builder c(String c) {
      this.c = c;
      return this;
    }

    /**
     * Fields marked with redacted are not to be logged, generally for PCI or PII.
     */
    public Builder redacted(Boolean redacted) {
      this.redacted = redacted;
      return this;
    }

    public Builder relevant(Boolean relevant) {
      this.relevant = relevant;
      return this;
    }

    public Builder unused(Boolean unused) {
      this.unused = unused;
      return this;
    }

    @Override
    public FieldOptions build() {
      return new FieldOptions(this, super.buildUnknownFields());
    }
  }

  public enum CType implements WireEnum {
    /**
     * Default mode.
     */
    STRING(0),

    CORD(1),

    STRING_PIECE(2);

    public static final ProtoAdapter<CType> ADAPTER = new ProtoAdapter_CType();

    private final int value;

    CType(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static CType fromValue(int value) {
      switch (value) {
        case 0: return STRING;
        case 1: return CORD;
        case 2: return STRING_PIECE;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_CType extends EnumAdapter<CType> {
      ProtoAdapter_CType() {
        super(CType.class);
      }

      @Override
      protected CType fromValue(int value) {
        return CType.fromValue(value);
      }
    }
  }

  public enum JSType implements WireEnum {
    /**
     * Use the default type.
     */
    JS_NORMAL(0),

    /**
     * Use JavaScript strings.
     */
    JS_STRING(1),

    /**
     * Use JavaScript numbers.
     */
    JS_NUMBER(2);

    public static final ProtoAdapter<JSType> ADAPTER = new ProtoAdapter_JSType();

    private final int value;

    JSType(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static JSType fromValue(int value) {
      switch (value) {
        case 0: return JS_NORMAL;
        case 1: return JS_STRING;
        case 2: return JS_NUMBER;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_JSType extends EnumAdapter<JSType> {
      ProtoAdapter_JSType() {
        super(JSType.class);
      }

      @Override
      protected JSType fromValue(int value) {
        return JSType.fromValue(value);
      }
    }
  }

  private static final class ProtoAdapter_FieldOptions extends ProtoAdapter<FieldOptions> {
    public ProtoAdapter_FieldOptions() {
      super(FieldEncoding.LENGTH_DELIMITED, FieldOptions.class, "type.googleapis.com/google.protobuf.FieldOptions");
    }

    @Override
    public int encodedSize(FieldOptions value) {
      return CType.ADAPTER.encodedSizeWithTag(1, value.ctype)
          + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.packed)
          + JSType.ADAPTER.encodedSizeWithTag(6, value.jstype)
          + ProtoAdapter.BOOL.encodedSizeWithTag(5, value.lazy)
          + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated)
          + ProtoAdapter.BOOL.encodedSizeWithTag(10, value.weak)
          + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, value.uninterpreted_option)
          + ProtoAdapter.INT32.encodedSizeWithTag(60001, value.my_field_option_one)
          + ProtoAdapter.FLOAT.encodedSizeWithTag(60002, value.my_field_option_two)
          + FooBar.FooBarBazEnum.ADAPTER.encodedSizeWithTag(60003, value.my_field_option_three)
          + FooBar.ADAPTER.encodedSizeWithTag(60004, value.my_field_option_four)
          + ProtoAdapter.STRING.encodedSizeWithTag(22101, value.squareup_protos_extension_collision_1_a)
          + ProtoAdapter.STRING.encodedSizeWithTag(22102, value.b)
          + ProtoAdapter.STRING.encodedSizeWithTag(22103, value.squareup_protos_extension_collision_2_a)
          + ProtoAdapter.STRING.encodedSizeWithTag(22104, value.c)
          + ProtoAdapter.BOOL.encodedSizeWithTag(22200, value.redacted)
          + ProtoAdapter.BOOL.encodedSizeWithTag(22301, value.relevant)
          + ProtoAdapter.BOOL.encodedSizeWithTag(22302, value.unused)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, FieldOptions value) throws IOException {
      CType.ADAPTER.encodeWithTag(writer, 1, value.ctype);
      ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.packed);
      JSType.ADAPTER.encodeWithTag(writer, 6, value.jstype);
      ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.lazy);
      ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated);
      ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.weak);
      UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999, value.uninterpreted_option);
      ProtoAdapter.INT32.encodeWithTag(writer, 60001, value.my_field_option_one);
      ProtoAdapter.FLOAT.encodeWithTag(writer, 60002, value.my_field_option_two);
      FooBar.FooBarBazEnum.ADAPTER.encodeWithTag(writer, 60003, value.my_field_option_three);
      FooBar.ADAPTER.encodeWithTag(writer, 60004, value.my_field_option_four);
      ProtoAdapter.STRING.encodeWithTag(writer, 22101, value.squareup_protos_extension_collision_1_a);
      ProtoAdapter.STRING.encodeWithTag(writer, 22102, value.b);
      ProtoAdapter.STRING.encodeWithTag(writer, 22103, value.squareup_protos_extension_collision_2_a);
      ProtoAdapter.STRING.encodeWithTag(writer, 22104, value.c);
      ProtoAdapter.BOOL.encodeWithTag(writer, 22200, value.redacted);
      ProtoAdapter.BOOL.encodeWithTag(writer, 22301, value.relevant);
      ProtoAdapter.BOOL.encodeWithTag(writer, 22302, value.unused);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public FieldOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: {
            try {
              builder.ctype(CType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 2: builder.packed(ProtoAdapter.BOOL.decode(reader)); break;
          case 3: builder.deprecated(ProtoAdapter.BOOL.decode(reader)); break;
          case 5: builder.lazy(ProtoAdapter.BOOL.decode(reader)); break;
          case 6: {
            try {
              builder.jstype(JSType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 10: builder.weak(ProtoAdapter.BOOL.decode(reader)); break;
          case 999: builder.uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader)); break;
          case 22101: builder.squareup_protos_extension_collision_1_a(ProtoAdapter.STRING.decode(reader)); break;
          case 22102: builder.b(ProtoAdapter.STRING.decode(reader)); break;
          case 22103: builder.squareup_protos_extension_collision_2_a(ProtoAdapter.STRING.decode(reader)); break;
          case 22104: builder.c(ProtoAdapter.STRING.decode(reader)); break;
          case 22200: builder.redacted(ProtoAdapter.BOOL.decode(reader)); break;
          case 22301: builder.relevant(ProtoAdapter.BOOL.decode(reader)); break;
          case 22302: builder.unused(ProtoAdapter.BOOL.decode(reader)); break;
          case 60001: builder.my_field_option_one(ProtoAdapter.INT32.decode(reader)); break;
          case 60002: builder.my_field_option_two(ProtoAdapter.FLOAT.decode(reader)); break;
          case 60003: {
            try {
              builder.my_field_option_three(FooBar.FooBarBazEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 60004: builder.my_field_option_four(FooBar.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public FieldOptions redact(FieldOptions value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.uninterpreted_option, UninterpretedOption.ADAPTER);
      if (builder.my_field_option_four != null) builder.my_field_option_four = FooBar.ADAPTER.redact(builder.my_field_option_four);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
