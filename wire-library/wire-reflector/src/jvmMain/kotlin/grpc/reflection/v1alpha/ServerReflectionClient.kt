// Code generated by Wire protocol buffer compiler, do not edit.
// Source: grpc.reflection.v1alpha.ServerReflection in grpc/reflection/v1alpha/reflection.proto
package grpc.reflection.v1alpha

import com.squareup.wire.GrpcStreamingCall
import com.squareup.wire.Service

public interface ServerReflectionClient : Service {
  /**
   * The reflection service is structured as a bidirectional stream, ensuring
   * all related requests go to a single server.
   */
  public fun ServerReflectionInfo(): GrpcStreamingCall<ServerReflectionRequest,
      ServerReflectionResponse>
}