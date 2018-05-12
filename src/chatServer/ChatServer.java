package chatServer;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
   
   public static ArrayList<PrintWriter> m_OutputList;
   
   public static void main(String[] args) {
      
      //ArrayList 클래스로 m_OutputList 객체를 생성하고 할당. 
      //이 객체의 역할은 서버로 접속하는 클라이언트의 Output을 모아둔 배열
      m_OutputList = new ArrayList<PrintWriter>();
      
      try {
         //서버소켓 9999포트로 염
         ServerSocket s_socket = new ServerSocket(9999);
         
         while(true) 
         {
            //서버소켓에서 클라이언트가 감지되면 Socket클래스, 즉 클라이언트 소켓을 생성하여 
            //ClientMangerThread에 담아서 해당 스레드를 실행하게 됨.
            Socket c_socket = s_socket.accept();
            ClientManagerThread c_thread = new ClientManagerThread();
            c_thread.setSocket(c_socket);
            
            //클라이언트가 접속하게 되면, 클라이언트의 OutputStream만 이객체에 모아두게 됨.   
            //add 메소드로 c_socket.getOutputStream을 사용하기 좋게 PrintWriter로 변형 후 저장 하고 있음.
            m_OutputList.add(new PrintWriter(c_socket.getOutputStream()));
            
            c_thread.start();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
         
   }
}