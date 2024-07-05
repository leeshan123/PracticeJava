package exception.ex1;



public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        //오류 검증 데이터 추가
        client.initError(data);

        String connectResult = client.connect();
        //오류다로 더 쉽게 이해할 수 있게 만듬.
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        }else{
            String sendResult = client.send(data);
            //오류다로 더 쉽게 이해할 수 있게 만듬.
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }

        }
        client.disconnect();


    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
