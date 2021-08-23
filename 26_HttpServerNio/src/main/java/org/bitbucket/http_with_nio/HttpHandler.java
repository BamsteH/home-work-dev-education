package org.bitbucket.http_with_nio;

public class HttpHandler {

    private final SimpleHttpRequest simpleHttpRequest;

    public HttpHandler(SimpleHttpRequest simpleHttpRequest) {
        this.simpleHttpRequest = simpleHttpRequest;
    }

    public String getResponce() {
        return "HTTP/1.1 200 OK\n\r" +
                String.format("Content-Length: %d\n\r", getHtmlPage().length()) +
                "Content-Type: text/html\n\r\n";
    }

    public String getHtmlPage() {

        return  "<!DOCTYPE HTML PUBLIC \"-//IETF//DTD HTML 2.0//EN\">\n\r" +
                "<html>\n\r" +
                "<head>" +
                "<title> Server response </title>" +
                "</head>\n" +
                "<body>\n\r" +
                "<h1>" +
                "Hello, Client! <br>" +
                "Your request type is - " + this.simpleHttpRequest.getType() + "<br>\n\r" +
                "Your request body is - " + this.simpleHttpRequest.getBody() + "<br>\n\r" +
                "</h1>\n\r" +
                "</body>\n\r" +
                "</html>\n\r\n\r";
    }
}
