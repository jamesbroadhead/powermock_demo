

java_test(
    name = 'old_powermock_tests',
    test_class = 'com.example.PowerMockTest',
    srcs = glob(['PowerMockTest.java']),
    deps = [
        '//:class_to_mock',
        '@byte_buddy//jar',
        '@byte_buddy_agent//jar',
        '@javassist//jar',
        '@junit//jar',
        '@mockito_core//jar',
        '@objenesis//jar',
        '@powermock_api//jar',
        '@powermock_core//jar',
        '@powermock_junit4//jar',
        '@powermock_junit4_common//jar',
        '@powermock_mockito//jar',
        '@powermock_mockito_common//jar',
        '@powermock_reflect//jar',
        ],
)

java_test(
    name = 'new_powermock_tests',
    test_class = 'com.example.PowerMockTest',
    srcs = glob(['PowerMockTest.java']),
    deps = [
        '//:class_to_mock',
        '@byte_buddy//jar',
        '@byte_buddy_agent//jar',
        '@javassist//jar',
        '@junit//jar',
        '@mockito2_core//jar',
        '@objenesis//jar',
        '@powermock2_api//jar',
        '@powermock2_core//jar',
        '@powermock2_junit4//jar',
        '@powermock2_junit4_common//jar',
        '@powermock2_mockito//jar',
        '@powermock2_reflect//jar',
        ],
)
