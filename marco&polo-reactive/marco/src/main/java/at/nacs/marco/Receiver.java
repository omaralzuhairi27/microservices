package at.nacs.marco;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Service
public class Receiver {
  @StreamListener(Processor.INPUT)
  public void hearpolo(String message) {
    System.out.println("<- MESSAGE RECEIVED: " + message);
  }

}
