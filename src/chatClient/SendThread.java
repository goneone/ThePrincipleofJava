package chatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {

   private Socket m_Socket;

   @Override
   public void run() {
      super.run();

      try {

         // 클라이언트 소켓의 인풋 스트림을 사용하기 편하게 변경하고 데이터를 받아옴.
         BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));

         PrintWriter sendWriter = new PrintWriter(m_Socket.getOutputStream());

         String sendString;
         
         //해당 스레드를 진입하자마자 사용할 ID를 묻고 해당 ID를 서버에 최초 한번 전송하게 됨. 
         System.out.println("사용할 ID를 입력해주십시오 :");
         ChatClient.UserID = tmpbuf.readLine();
         sendWriter.println("IDhighkrs12345" + ChatClient.UserID);
         sendWriter.flush();
         
         //그 이후 while에서 데이터를 송수신하게 됨
         while (true) {
            sendString = tmpbuf.readLine();

            if (sendString.equals("exit")) {
               break;
            }
            sendWriter.println(sendString);
            sendWriter.flush();
         }

         sendWriter.close();
         tmpbuf.close();
         m_Socket.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void setSocket(Socket _socket) {
      m_Socket = _socket;
   }
}