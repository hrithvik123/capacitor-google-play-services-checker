// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorGooglePlayServicesChecker",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "CapacitorGooglePlayServicesChecker",
            targets: ["GooglePlayServicesCheckerPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "GooglePlayServicesCheckerPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/GooglePlayServicesCheckerPlugin"),
        .testTarget(
            name: "GooglePlayServicesCheckerPluginTests",
            dependencies: ["GooglePlayServicesCheckerPlugin"],
            path: "ios/Tests/GooglePlayServicesCheckerPluginTests")
    ]
)