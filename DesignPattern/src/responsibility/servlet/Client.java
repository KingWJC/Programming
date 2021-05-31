package responsibility.servlet;

public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        request.message = "大家好:)，<script>，欢迎访问 baidu.com ";
        Response response = new Response();
        response.message = "reponse-";
        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new URLFilter()).add(new FaceFilter());
        chain.doFilter(request, response);
        System.out.println(request.message);
        System.out.println(response.message);
    }
}

class Request {
    String message;
}

class Response {
    String message;
}