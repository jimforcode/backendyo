package com.springapp.mvc.activemq.consumer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
//http://www.cnblogs.com/leiOOlei/p/5075402.html#a1

@Service
public class ConsumerService {

    @Resource(name="jmsTemplate")
    private JmsTemplate jmsTemplate;
     
    /**
     * 接收消息
     */
    public TextMessage receive(Destination destination) {
        TextMessage tm = (TextMessage) jmsTemplate.receive(destination);
        try {
            System.out.println("  from queue" + destination.toString() + "  received message：\t"
                    + tm.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
        
        return tm;
        
    }
 
}