package ioc

class Network(var service: Service? = null) {

    fun makeRequest(request: Request) {
        service?.doServiceWork(request)
    }

    enum class HttpMethod {
        GET, POST, PUT, DELETE
    }

    class Request(val url: String, val method: HttpMethod = HttpMethod.GET) {
    }
}