package com.fuchangyao.listen;



import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;


public class CodeListener implements javax.jms.MessageListener{

    @Override
    public void onMessage(Message message) {
        TextMessage t=(TextMessage)message;
        String text = null;
        try {
            text = t.getText();
        } catch (JMSException e) {
            e.printStackTrace();
        }
        System.out.println("获取的到的消息："+text);
    }
}
