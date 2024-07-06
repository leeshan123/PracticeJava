package exception.ex4;



public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        //오류 검증 데이터 추가
        client.initError(data);

        try {
            client.connect();
            client.send(data); //throw new RuntimeException("ex");을 못잡고 던짐
        } finally {
            client.disconnect();
        }






    }
}
