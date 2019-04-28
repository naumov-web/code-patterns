public class HttpPost extends HttpRequest {

    /**
     * Создать объект запроса
     */
    public HttpPost() {
        this.type = "post";
    }

    /**
     * Создать копию текущего объекта
     *
     * @return HttpPost
     */
    public HttpPost cloneThis() {

        HttpPost request = new HttpPost();
        request.setUrl(this.url);
        request.setRaw(this.raw);
        return request;

    }

}