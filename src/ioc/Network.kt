package ioc

class Network(var service: Service? = null) {

    fun doRequest(request: Request) {
        request.apiCall(request.url)
        service?.doServiceWork(request)
    }

    enum class HttpType {
        GET, POST, PUT, DELETE
    }

    class Request(val url: String, val method: HttpType = HttpType.GET) {

        fun apiCall(url: String) {
            println("Performing request... $url")
        }
    }
}