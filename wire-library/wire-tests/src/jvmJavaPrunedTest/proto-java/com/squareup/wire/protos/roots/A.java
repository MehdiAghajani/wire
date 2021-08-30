// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.roots.A in roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * Used to test --includes flag of WireCompiler
 *
 * A -> B -> C
 *  \
 *   -> D
 *
 * E -> E.F
 *  \
 *   -> G
 *
 * H -> E.F
 *
 * I -> nothing
 */
public final class A extends Message<A, A.Builder> {
  public static final ProtoAdapter<A> ADAPTER = new ProtoAdapter_A();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.roots.D#ADAPTER"
  )
  public final D d;

  public A(D d) {
    this(d, ByteString.EMPTY);
  }

  public A(D d, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.d = d;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.d = d;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof A)) return false;
    A o = (A) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(d, o.d);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (d != null ? d.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (d != null) builder.append(", d=").append(d);
    return builder.replace(0, 2, "A{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<A, Builder> {
    public D d;

    public Builder() {
    }

    public Builder d(D d) {
      this.d = d;
      return this;
    }

    @Override
    public A build() {
      return new A(d, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_A extends ProtoAdapter<A> {
    public ProtoAdapter_A() {
      super(FieldEncoding.LENGTH_DELIMITED, A.class, "type.googleapis.com/squareup.protos.roots.A", Syntax.PROTO_2, null, "roots.proto");
    }

    @Override
    public int encodedSize(A value) {
      int result = 0;
      result += D.ADAPTER.encodedSizeWithTag(2, value.d);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, A value) throws IOException {
      D.ADAPTER.encodeWithTag(writer, 2, value.d);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, A value) throws IOException {
      writer.writeBytes(value.unknownFields());
      D.ADAPTER.encodeWithTag(writer, 2, value.d);
    }

    @Override
    public A decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 2: builder.d(D.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public A redact(A value) {
      Builder builder = value.newBuilder();
      if (builder.d != null) builder.d = D.ADAPTER.redact(builder.d);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
