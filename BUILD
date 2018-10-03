java_binary(
    name = "ProjectRunner",
    srcs = glob(["src/main/java/com/example/*.java"]),
    deps = [":greeter"],
)

java_library(
    name = "greeter",
    srcs = [
        "src/main/java/com/example/Greeting.java",
        "src/main/java/com/example/ClassToMock.java"
    ],
    visibility = [
        "//src/main/java/com/example/cmdline:__pkg__",
        "//test/java/com/example:__pkg__",
        ],
)
