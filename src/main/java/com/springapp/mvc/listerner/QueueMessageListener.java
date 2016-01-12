package com.springapp.mvc.listerner;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


public class QueueMessageListener implements MessageListener {

    
    //当收到消息后，自动调用该方法
    @Override
    public void onMessage(Message message) {
        System.out.println(" consumer A :");

        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("you have message ："+ tm.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

        try {
            if(message.getJMSReplyTo()!=null){
                System.out.println(" it's is  from :");
                            System.out.println(message.getJMSReplyTo());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

}