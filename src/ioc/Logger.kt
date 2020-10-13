package ioc


class Logger: Service {
    override fun doServiceWork(request: Network.Request) {
        println("Запрос был отправлен: ${request.url} - ${request.method}")
    }
}