package chatServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManagerThread extends Thread {

   //�ش� ���ϰ� �� ������ ä�� ID�� ������ ����� 
   private Socket m_socket;
   private String m_ID;

   @Override
   public void run() {

      super.run();
      try {
         //Ŭ���̾�Ʈ ������ ��ǲ ��Ʈ���� ����ϱ� ���ϰ� �����ϰ� �����͸� �޾ƿ�.
         BufferedReader tmpbuffer = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));

         String text;

         while (true) {
            text = tmpbuffer.readLine();
            
            //�ش� ������ �������� �ȳ������� üũ�ϴ� �κ�.
            //������ ����Ǹ� text���� null�� ��.
            //���� text���� ���� �Ǹ� �ش� ID�� �����ٰ� �˸��� ���ְ� �����带 �����Ű�� ���� break�� �ɾ���.
            //*Ư�� id�� �����ٴ� ���� ������ �ƴ϶� ��� Ŭ���̾�Ʈ���׵� �˷������.
            //m_OutputList�� �������: �� Ŭ���̾�Ʈ�� �޽����� �ٸ� Ŭ���̾�Ʈ���� ���� �ϱ� ���� ��� ��Ƽ� ������ ����.
            if (text == null) {
               System.out.println(m_ID + "��(��) �������ϴ�.");
               for (int i = 0; i < ChatServer.m_OutputList.size(); ++i) {
                  ChatServer.m_OutputList.get(i).println(m_ID + "��(��) �������ϴ�.");
                  ChatServer.m_OutputList.get(i).flush();
               }
               break;
            }

            String[] split = text.split("highkrs12345");
            if (split.length == 2 && split[0].equals("ID")) {
               m_ID = split[1];
               System.out.println(m_ID + "��(��) �����Ͽ����ϴ� ");
               for (int i = 0; i < ChatServer.m_OutputList.size(); ++i) {
                  ChatServer.m_OutputList.get(i).println(m_ID + "��(��) �����Ͽ����ϴ�.");
                  ChatServer.m_OutputList.get(i).flush();
               }
               continue;
            }

            for (int i = 0; i < ChatServer.m_OutputList.size(); ++i) {
               ChatServer.m_OutputList.get(i).println(m_ID + " > " + text);
               ChatServer.m_OutputList.get(i).flush();
            }
         }
         //ClientManagerThread�� ����ǰ� �Ǹ� m_OutputList���� �ش� ������ OutputStream�� �����ϰ� ������ �ݾ��ְԵ�.
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