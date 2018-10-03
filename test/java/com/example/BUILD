

java_test(
    name = "old_powermock_tests",
    test_class = "com.example.OldPowerMockTest",
    srcs = glob(["OldPowerMockTest.java"]),
    deps = [
        "//:greeter",
        "@junit//jar",
        "@powermock_mockito_common//jar",
        "@powermock_mockito//jar",
        '@powermock_core//jar',
        '@powermock_api//jar',
        '@powermock_junit4//jar',
        '@powermock_junit4_common//jar',
        '@powermock_reflect//jar',
        '@javassist//jar',
        '@byte_buddy//jar',
        '@byte_buddy_agent//jar',
        '@objenesis//jar',
        '@mockito_core//jar'
        ],
)

java_test(
    name = "new_powermock_tests",
    test_class = "com.example.NewPowerMockTest",
    srcs = glob(["NewPowerMockTest.java"]),
    deps = [
        "//:greeter",
        "@junit//jar",
        "@powermock2_mockito//jar",
        '@powermock2_core//jar',
        '@powermock2_api//jar',
        '@powermock2_junit4//jar',
        '@powermock2_junit4_common//jar',
        '@powermock2_reflect//jar',
        '@javassist//jar',
        '@byte_buddy//jar',
        '@byte_buddy_agent//jar',
        '@objenesis//jar',
        '@mockito2_core//jar'
        ],
)
