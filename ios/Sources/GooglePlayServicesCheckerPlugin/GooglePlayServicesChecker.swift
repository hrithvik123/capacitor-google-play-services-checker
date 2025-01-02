import Foundation

@objc public class GooglePlayServicesChecker: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
