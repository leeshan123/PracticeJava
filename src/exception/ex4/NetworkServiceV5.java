package exception.ex4;



public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";



        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data); //throw new RuntimeException("ex");을 못잡고 던짐
        } catch (Exception e){
            System.out.println("[예외 확인: " + e.getMessage());
            throw e;
        }






    }
}
