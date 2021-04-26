// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.Timestamp in google/protobuf/timestamp.proto
import Foundation

/**
 * A Timestamp represents a point in time independent of any time zone
 * or calendar, represented as seconds and fractions of seconds at
 * nanosecond resolution in UTC Epoch time. It is encoded using the
 * Proleptic Gregorian Calendar which extends the Gregorian calendar
 * backwards to year one. It is encoded assuming all minutes are 60
 * seconds long, i.e. leap seconds are "smeared" so that no leap second
 * table is needed for interpretation. Range is from
 * 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z.
 * By restricting to that range, we ensure that we can convert to
 * and from  RFC 3339 date strings.
 * See [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
 *
 * Example 1: Compute Timestamp from POSIX `time()`.
 *
 *     Timestamp timestamp;
 *     timestamp.set_seconds(time(NULL));
 *     timestamp.set_nanos(0);
 *
 * Example 2: Compute Timestamp from POSIX `gettimeofday()`.
 *
 *     struct timeval tv;
 *     gettimeofday(&tv, NULL);
 *
 *     Timestamp timestamp;
 *     timestamp.set_seconds(tv.tv_sec);
 *     timestamp.set_nanos(tv.tv_usec * 1000);
 *
 * Example 3: Compute Timestamp from Win32 `GetSystemTimeAsFileTime()`.
 *
 *     FILETIME ft;
 *     GetSystemTimeAsFileTime(&ft);
 *     UINT64 ticks = (((UINT64)ft.dwHighDateTime) << 32) | ft.dwLowDateTime;
 *
 *     // A Windows tick is 100 nanoseconds. Windows epoch 1601-01-01T00:00:00Z
 *     // is 11644473600 seconds before Unix epoch 1970-01-01T00:00:00Z.
 *     Timestamp timestamp;
 *     timestamp.set_seconds((INT64) ((ticks / 10000000) - 11644473600LL));
 *     timestamp.set_nanos((INT32) ((ticks % 10000000) * 100));
 *
 * Example 4: Compute Timestamp from Java `System.currentTimeMillis()`.
 *
 *     long millis = System.currentTimeMillis();
 *
 *     Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
 *         .setNanos((int) ((millis % 1000) * 1000000)).build();
 *
 *
 * Example 5: Compute Timestamp from current time in Python.
 *
 *     now = time.time()
 *     seconds = int(now)
 *     nanos = int((now - seconds) * 10**9)
 *     timestamp = Timestamp(seconds=seconds, nanos=nanos)
 */
public struct Timestamp {

    /**
     * Represents seconds of UTC time since Unix epoch
     * 1970-01-01T00:00:00Z. Must be from from 0001-01-01T00:00:00Z to
     * 9999-12-31T23:59:59Z inclusive.
     */
    @JSONString
    public var seconds: Int64
    /**
     * Non-negative fractions of a second at nanosecond resolution. Negative
     * second values with fractions must still have non-negative nanos values
     * that count forward in time. Must be from 0 to 999,999,999
     * inclusive.
     */
    public var nanos: Int32
    public var unknownFields: Data = .init()

    public init(seconds: Int64, nanos: Int32) {
        self.seconds = seconds
        self.nanos = nanos
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Timestamp : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Timestamp : Hashable {
}
#endif

extension Timestamp : Proto3Codable {
    public init(from reader: ProtoReader) throws {
        var seconds: Int64? = nil
        var nanos: Int32? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: seconds = try reader.decode(Int64.self)
            case 2: nanos = try reader.decode(Int32.self)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.seconds = try Timestamp.checkIfMissing(seconds, "seconds")
        self.nanos = try Timestamp.checkIfMissing(nanos, "nanos")
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.seconds)
        try writer.encode(tag: 2, value: self.nanos)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Timestamp : Codable {
    public enum CodingKeys : String, CodingKey {

        case seconds
        case nanos

    }
}
#endif
