import SwiftUI
import ComposeApp

@main
struct iOSApp: App {
    
    init() {
        InitiKoinKt.doInitKoin()
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
