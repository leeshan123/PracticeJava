package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        //오류 검증 데이터 추가
        client.initError(data);

        try {
            client.connect();
            client.send(data); //throw new RuntimeException("ex");을 못잡고 던짐
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+ e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+ e.getSendData() + ", 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }






    }
}
