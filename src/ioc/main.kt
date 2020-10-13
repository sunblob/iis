package ioc

fun main() {
    val request = Network.Request("https://mock.kek", Network.HttpType.POST)
    val network = Network(Logger())
    network.doRequest(request)
}

