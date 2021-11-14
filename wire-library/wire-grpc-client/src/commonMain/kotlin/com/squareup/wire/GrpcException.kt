/*
 * Copyright 2021 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.squareup.wire

import okio.IOException

class GrpcException(
    val grpcStatus: GrpcStatus,
    val grpcMessage: String?,
    val trailers: GrpcHeaders
) : IOException("grpc-status=${grpcStatus.code}, grpc-status-name=${grpcStatus.name}, grpc-message=$grpcMessage")

