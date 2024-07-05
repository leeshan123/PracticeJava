package exception.ex1;



public class NetworkServiceV1_1 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        //오류 검증 데이터 추가
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();


    }
}
