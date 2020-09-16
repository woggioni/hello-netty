plugins {
    application
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    val nettyVersion = "4.1.46.Final"
    val tcnativeVersion = "2.0.29.Final"
    implementation(group = "io.netty", name = "netty-handler", version = nettyVersion)
    implementation(group = "io.netty", name = "netty-codec", version = nettyVersion)
    implementation(group = "io.netty", name = "netty-codec-http", version = nettyVersion)
    implementation(group = "io.netty", name = "netty-tcnative-boringssl-static", version = tcnativeVersion)
}

application {
    mainClass.set("net.woggioni.hello.netty.NettyNativeTls")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
