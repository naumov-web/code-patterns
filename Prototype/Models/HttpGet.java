public class HttpGet extends HttpRequest {

    /**
     * Создать объект запроса
     */
    public HttpGet() {
        this.type = "get";
    }

    /**
     * Создать копию текущего объекта
     *
     * @return HttpGet
     */
    public HttpGet cloneThis() {

        HttpGet request = new HttpGet();
        request.setUrl(this.url);
        return request;

    }

}