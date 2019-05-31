package at.nacs.polo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class SenderAndReciver {

  @StreamListener(Processor.INPUT)
  @SendTo(Processor.OUTPUT)
  public String hearMarcoAndSayPolo(String message) {
    System.out.println("<- MESSAGE RECIVED: " + message);
    String resopnse = message.replaceAll("marco", "polo");
    System.out.println("<- MESSAGE SEND: " + resopnse);
    return resopnse;

  }
}
