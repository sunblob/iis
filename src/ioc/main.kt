package ioc

fun main() {
    val request = Network.Request("https://mock.kek", Network.HttpMethod.POST)
    val network = Network(Logger())

//    network.service = object : Service {
//        override fun doServiceWork(request: Network.Request) {
//            println("Doing something with $request")
//        }
//    }

    network.makeRequest(request)
}

