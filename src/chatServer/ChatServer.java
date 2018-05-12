package chatServer;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
   
   public static ArrayList<PrintWriter> m_OutputList;
   
   public static void main(String[] args) {
      
      //ArrayList Ŭ������ m_OutputList ��ü�� �����ϰ� �Ҵ�. 
      //�� ��ü�� ������ ������ �����ϴ� Ŭ���̾�Ʈ�� Output�� ��Ƶ� �迭
      m_OutputList = new ArrayList<PrintWriter>();
      
      try {
         //�������� 9999��Ʈ�� ��
         ServerSocket s_socket = new ServerSocket(9999);
         
         while(true) 
         {
            //�������Ͽ��� Ŭ���̾�Ʈ�� �����Ǹ� SocketŬ����, �� Ŭ���̾�Ʈ ������ �����Ͽ� 
            //ClientMangerThread�� ��Ƽ� �ش� �����带 �����ϰ� ��.
            Socket c_socket = s_socket.accept();
            ClientManagerThread c_thread = new ClientManagerThread();
            c_thread.setSocket(c_socket);
            
            //Ŭ���̾�Ʈ�� �����ϰ� �Ǹ�, Ŭ���̾�Ʈ�� OutputStream�� �̰�ü�� ��Ƶΰ� ��.   
            //add �޼ҵ�� c_socket.getOutputStream�� ����ϱ� ���� PrintWriter�� ���� �� ���� �ϰ� ����.
            m_OutputList.add(new PrintWriter(c_socket.getOutputStream()));
            
            c_thread.start();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
         
   }
}