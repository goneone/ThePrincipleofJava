package chatServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManagerThread extends Thread {

   //해당 소켓과 그 소켓의 채팅 ID를 변수로 사용함 
   private Socket m_socket;
   private String m_ID;

   @Override
   public void run() {

      super.run();
      try {
         //클라이언트 소켓의 인풋 스트림을 사용하기 편하게 변경하고 데이터를 받아옴.
         BufferedReader tmpbuffer = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));

         String text;

         while (true) {
            text = tmpbuffer.readLine();
            
            //해당 소켓이 나갔는지 안나갔는지 체크하는 부분.
            //소켓이 종료되면 text값이 null이 됨.
            //만약 text값이 널이 되면 해당 ID가 나갔다고 알림을 해주고 스레드를 종료시키기 위해 break를 걸어줌.
            //*특정 id가 나갔다는 것을 서버뿐 아니라 모든 클라이언트한테도 알려줘야함.
            //m_OutputList의 사용이유: 한 클라이언트의 메시지를 다른 클라이언트에게 전달 하기 위해 모두 모아서 가지고 있음.
            if (text == null) {
               System.out.println(m_ID + "이(가) 나갔습니다.");
               for (int i = 0; i < ChatServer.m_OutputList.size(); ++i) {
                  ChatServer.m_OutputList.get(i).println(m_ID + "이(가) 나갔습니다.");
                  ChatServer.m_OutputList.get(i).flush();
               }
               break;
            }

            String[] split = text.split("highkrs12345");
            if (split.length == 2 && split[0].equals("ID")) {
               m_ID = split[1];
               System.out.println(m_ID + "이(가) 입장하였습니다 ");
               for (int i = 0; i < ChatServer.m_OutputList.size(); ++i) {
                  ChatServer.m_OutputList.get(i).println(m_ID + "이(가) 입장하였습니다.");
                  ChatServer.m_OutputList.get(i).flush();
               }
               continue;
            }

            for (int i = 0; i < ChatServer.m_OutputList.size(); ++i) {
               ChatServer.m_OutputList.get(i).println(m_ID + " > " + text);
               ChatServer.m_OutputList.get(i).flush();
            }
         }
         //ClientManagerThread가 종료되게 되면 m_OutputList에서 해당 소켓의 OutputStream을 제거하고 소켓을 닫아주게됨.
         ChatServer.m_OutputList.remove(new PrintWriter(m_socket.getOutputStream()));
         m_socket.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void setSocket(Socket _socket) {
      m_socket = _socket;
   }
}