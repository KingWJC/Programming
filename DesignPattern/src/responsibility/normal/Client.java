package responsibility.normal;

public class Client {
    public static void main(String[] args) {
        Msg message = new Msg("大家好:)，<script>，欢迎访问 baidu.com ");
        FilterChain chain = new FilterChain();
        chain.add(new HTMLFilter()).add(new URLFilter()).add(new FaceFilter());
        chain.doFilter(message);
        System.out.println(message.getMessage());
    }
}