package ioc

fun main() {
    val request = Network.Request("https://mock.kek", HttpType.POST)
    val network = Network(Logger())
    network.doRequest(request)
}

enum class HttpType {
    GET, POST, PUT, DELETE
}

class Network(private val service: Service? = null) {

    fun doRequest(request: Request) {
        service?.doServiceWork(request)
    }

    class Request(val url: String, val method: HttpType = HttpType.GET)
}

interface Service {
    fun doServiceWork(request: Network.Request)
}

class Logger: Service {
    override fun doServiceWork(request: Network.Request) {
        print("Запрос был отправлен: ${request.url} - ${request.method}")
    }
}

class FileLogger: Service {
    override fun doServiceWork(request: Network.Request) {

    }
}
