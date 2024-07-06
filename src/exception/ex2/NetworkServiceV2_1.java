package exception.ex2;




public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        //오류 검증 데이터 추가
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();


    }
}
